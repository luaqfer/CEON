package com.grupoceon.service;

import com.grupoceon.model.ConfiguracionSistema;

public class ConfiguracionSistemaService {
    private ConfiguracionSistema configuracionSistema;

    public void configurarSistema(ConfiguracionSistema configuracionSistema) {
        this.configuracionSistema = configuracionSistema;
    }

    public ConfiguracionSistema obtenerConfiguracionSistema() {
        return configuracionSistema;
    }
}
