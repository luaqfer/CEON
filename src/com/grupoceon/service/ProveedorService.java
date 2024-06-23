package com.grupoceon.service;

import com.grupoceon.model.Proveedor;
import java.util.ArrayList;
import java.util.List;

public class ProveedorService {
    private List<Proveedor> proveedores = new ArrayList<>();

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public void actualizarProveedor(Proveedor proveedor) {
        for (int i = 0; i < proveedores.size(); i++) {
            if (proveedores.get(i).getId() == proveedor.getId()) {
                proveedores.set(i, proveedor);
                break;
            }
        }
    }

    public void eliminarProveedor(int proveedorId) {
        proveedores.removeIf(proveedor -> proveedor.getId() == proveedorId);
    }

    public List<Proveedor> listarProveedores() {
        return proveedores;
    }

    public Proveedor obtenerProveedorPorId(int proveedorId) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getId() == proveedorId) {
                return proveedor;
            }
        }
        return null;
    }
}

