package com.grupoceon.service;

import com.grupoceon.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void actualizarCliente(Cliente cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == cliente.getId()) {
                clientes.set(i, cliente);
                break;
            }
        }
    }

    public void eliminarCliente(int clienteId) {
        clientes.removeIf(cliente -> cliente.getId() == clienteId);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public Cliente obtenerClientePorId(int clienteId) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == clienteId) {
                return cliente;
            }
        }
        return null;
    }
}
