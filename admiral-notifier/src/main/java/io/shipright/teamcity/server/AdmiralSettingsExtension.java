package io.shipright.teamcity.server;

import jetbrains.buildServer.web.openapi.PagePlaces;
import jetbrains.buildServer.web.openapi.PlaceId;
import jetbrains.buildServer.web.openapi.SimplePageExtension;

import javax.servlet.http.HttpServletRequest;

public class AdmiralSettingsExtension extends SimplePageExtension {

    public AdmiralSettingsExtension(PagePlaces pagePlaces) {
        super(pagePlaces);
        setIncludeUrl("admiralSettings.jsp");
        setPlaceId(PlaceId.NOTIFIER_SETTINGS_FRAGMENT);
        setPluginName("admiral");
        register();
    }

    public boolean isAvailable(HttpServletRequest request) {
        return super.isAvailable(request);
    }
}
