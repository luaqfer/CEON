package com.grupoceon.controller;

import com.grupoceon.model.Proveedor;
import com.grupoceon.service.ProveedorService;

import java.util.List;

public class ProveedorController {
    private ProveedorService proveedorService;

    public ProveedorController() {
        this.proveedorService = new ProveedorService();
    }

    public void agregarProveedor(Proveedor proveedor) {
        proveedorService.agregarProveedor(proveedor);
    }

    public void actualizarProveedor(Proveedor proveedor) {
        proveedorService.actualizarProveedor(proveedor);
    }

    public void eliminarProveedor(int proveedorId) {
        proveedorService.eliminarProveedor(proveedorId);
    }

    public List<Proveedor> listarProveedores() {
        return proveedorService.listarProveedores();
    }

    public Proveedor obtenerProveedorPorId(int proveedorId) {
        return proveedorService.obtenerProveedorPorId(proveedorId);
    }
}

