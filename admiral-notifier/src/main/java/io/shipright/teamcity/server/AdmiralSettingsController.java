package io.shipright.teamcity.server;

import jetbrains.buildServer.controllers.BaseController;
import jetbrains.buildServer.serverSide.SBuildServer;
import jetbrains.buildServer.version.ServerVersionHolder;
import jetbrains.buildServer.version.ServerVersionInfo;
import jetbrains.buildServer.web.openapi.WebControllerManager;
import jetbrains.buildServer.web.openapi.WebResourcesManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdmiralSettingsController extends BaseController {

    public AdmiralSettingsController(final SBuildServer server, WebControllerManager manager, WebResourcesManager webResources) {
        super(server);
        manager.registerController("/tcgrowlSettings.html", this);

        //in TeamCity < 4.x EAP we need to register plugin resources automatically.
        final ServerVersionInfo serverVersionInfo = ServerVersionHolder.getVersion();
        if (serverVersionInfo.getDisplayVersionMajor()<4){
            webResources.addPluginResources("tcGrowl", "tcgrowl.jar");
        }
    }

    @Nullable
    @Override
    protected ModelAndView doHandle(@NotNull HttpServletRequest httpServletRequest, @NotNull HttpServletResponse httpServletResponse) throws Exception {
        return null;
    }


}
