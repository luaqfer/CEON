package com.grupoceon.model;

public class ConfiguracionSistema {
    private int id;
    private int umbralInventarioBajo;
    private String parametrosFacturacion;

    // Constructor
    public ConfiguracionSistema(int id, int umbralInventarioBajo, String parametrosFacturacion) {
        this.id = id;
        this.umbralInventarioBajo = umbralInventarioBajo;
        this.parametrosFacturacion = parametrosFacturacion;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUmbralInventarioBajo() { return umbralInventarioBajo; }
    public void setUmbralInventarioBajo(int umbralInventarioBajo) { this.umbralInventarioBajo = umbralInventarioBajo; }

    public String getParametrosFacturacion() { return parametrosFacturacion; }
    public void setParametrosFacturacion(String parametrosFacturacion) { this.parametrosFacturacion = parametrosFacturacion; }
}

