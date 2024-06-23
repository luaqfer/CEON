package com.grupoceon.controller;

import com.grupoceon.model.Producto;
import com.grupoceon.service.ProductoService;

import java.util.List;

public class ProductoController {
    private ProductoService productoService;

    public ProductoController() {
        this.productoService = new ProductoService();
    }

    public void agregarProducto(Producto producto) {
        productoService.agregarProducto(producto);
    }

    public void actualizarProducto(Producto producto) {
        productoService.actualizarProducto(producto);
    }

    public void eliminarProducto(int productoId) {
        productoService.eliminarProducto(productoId);
    }

    public List<Producto> listarProductos() {
        return productoService.listarProductos();
    }

    public Producto obtenerProductoPorId(int productoId) {
        return productoService.obtenerProductoPorId(productoId);
    }
}
