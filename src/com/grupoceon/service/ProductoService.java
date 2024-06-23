package com.grupoceon.service;

import com.grupoceon.model.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoService {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void actualizarProducto(Producto producto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == producto.getId()) {
                productos.set(i, producto);
                break;
            }
        }
    }

    public void eliminarProducto(int productoId) {
        productos.removeIf(producto -> producto.getId() == productoId);
    }

    public List<Producto> listarProductos() {
        return productos;
    }

    public Producto obtenerProductoPorId(int productoId) {
        for (Producto producto : productos) {
            if (producto.getId() == productoId) {
                return producto;
            }
        }
        return null;
    }
}

