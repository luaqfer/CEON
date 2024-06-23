package com.grupoceon.model;

import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private Date fecha;
    private String cliente;
    private List<Producto> productos;
    private double total;

    // Constructor
    public Pedido(int id, Date fecha, String cliente, List<Producto> productos, double total) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = productos;
        this.total = total;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public List<Producto> getProductos() { return productos; }
    public void setProductos(List<Producto> productos) { this.productos = productos; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}
