package io.shipright.teamcity.server;

import io.shipright.teamcity.DeployerRunnerConstants;
import io.shipright.teamcity.SSHRunnerConstants;
import jetbrains.buildServer.serverSide.InvalidProperty;
import jetbrains.buildServer.util.StringUtil;

import java.util.Collection;
import java.util.Map;

class SSHDeployerPropertiesProcessor extends DeployerPropertiesProcessor {
    @Override
    public Collection<InvalidProperty> process(Map<String, String> properties) {
        Collection<InvalidProperty> result = super.process(properties);
        if (StringUtil.isEmptyOrSpaces(properties.get(DeployerRunnerConstants.PARAM_USERNAME)) &&
                !SSHRunnerConstants.AUTH_METHOD_DEFAULT_KEY.equals(properties.get(SSHRunnerConstants.PARAM_AUTH_METHOD))) {
            result.add(new InvalidProperty(DeployerRunnerConstants.PARAM_USERNAME, "Username must be specified."));
        }
        return result;
    }
}