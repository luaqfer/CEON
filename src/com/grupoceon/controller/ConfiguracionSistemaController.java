package com.grupoceon.controller;

import com.grupoceon.model.ConfiguracionSistema;
import com.grupoceon.service.ConfiguracionSistemaService;

public class ConfiguracionSistemaController {
    private ConfiguracionSistemaService configuracionSistemaService;

    public ConfiguracionSistemaController() {
        this.configuracionSistemaService = new ConfiguracionSistemaService();
    }

    public void configurarSistema(ConfiguracionSistema configuracionSistema) {
        configuracionSistemaService.configurarSistema(configuracionSistema);
    }

    public ConfiguracionSistema obtenerConfiguracionSistema() {
        return configuracionSistemaService.obtenerConfiguracionSistema();
    }
}
