package com.grupoceon.model;

public class Proveedor {
    private int id;
    private String nombre;
    private String contacto;
    private String terminosPago;

    // Constructor
    public Proveedor(int id, String nombre, String contacto, String terminosPago) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
        this.terminosPago = terminosPago;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getContacto() { return contacto; }
    public void setContacto(String contacto) { this.contacto = contacto; }

    public String getTerminosPago() { return terminosPago; }
    public void setTerminosPago(String terminosPago) { this.terminosPago = terminosPago; }
}
