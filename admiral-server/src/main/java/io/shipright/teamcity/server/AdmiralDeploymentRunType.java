package io.shipright.teamcity.server;


import com.intellij.openapi.diagnostic.Logger;
import io.shipright.teamcity.DeployerRunnerConstants;
import io.shipright.teamcity.SSHRunnerConstants;
import jetbrains.buildServer.serverSide.PropertiesProcessor;
import jetbrains.buildServer.serverSide.RunType;
import jetbrains.buildServer.serverSide.RunTypeRegistry;
import jetbrains.buildServer.util.StringUtil;
import jetbrains.buildServer.web.openapi.PluginDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class AdmiralDeploymentRunType extends RunType {
    private static final Logger LOG = Logger.getInstance(AdmiralDeploymentRunType.class.getName());
    private final PluginDescriptor descriptor;

    public AdmiralDeploymentRunType(@NotNull final RunTypeRegistry registry,
                                    @NotNull final PluginDescriptor descriptor) {
        LOG.info("AdmiralDeploymentRunType");
        this.descriptor = descriptor;
        registry.registerRunType(this);
    }

    @NotNull
    @Override
    public String getType() {
        LOG.info("getType");
        return "admiral-deploy-runner";
    }

    @NotNull
    @Override
    public String getDisplayName() {
        LOG.info("getDisplayName");
        return "Admiral Deployer";
    }

    @NotNull
    @Override
    public String getDescription() {
        LOG.info("getDescription");
        return "Runner able to deploy build artifacts via SSH";
    }

    @Nullable
    @Override
    public PropertiesProcessor getRunnerPropertiesProcessor() {
        LOG.info("getRunnerPropertiesProcessor");
        return new SSHDeployerPropertiesProcessor();
    }

    @Nullable
    @Override
    public String getEditRunnerParamsJspFilePath() {
        LOG.info("getEditRunnerParamsJspFilePath");
        return descriptor.getPluginResourcesPath() + "editAdmiralDeployerParams.jsp";
    }

    @Nullable
    @Override
    public String getViewRunnerParamsJspFilePath() {
        LOG.info("getViewRunnerParamsJspFilePath");
        return descriptor.getPluginResourcesPath() + "viewAdmiralDeployerParams.jsp";
    }

    @Nullable
    @Override
    public Map<String, String> getDefaultRunnerProperties() {
        LOG.info("getDefaultRunnerProperties");
        return new HashMap<String, String>();
    }

    @NotNull
    @Override
    public String describeParameters(@NotNull Map<String, String> parameters) {
        LOG.info("describeParameters");
        StringBuilder sb = new StringBuilder();
        sb.append("Target: ").append(parameters.get(DeployerRunnerConstants.PARAM_TARGET_URL));
        final String port = parameters.get(SSHRunnerConstants.PARAM_PORT);
        if (StringUtil.isNotEmpty(port)) {
            sb.append('\n').append(" Port: ").append(port);
        }
        final Map<String, String> transportTypeValues = new SSHRunnerConstants().getTransportTypeValues();
        sb.append('\n').append("Protocol: ").append(transportTypeValues.get(parameters.get(SSHRunnerConstants.PARAM_TRANSPORT)));
        return sb.toString();
    }
}
