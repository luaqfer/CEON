package com.grupoceon.controller;

import com.grupoceon.model.Cliente;
import com.grupoceon.service.ClienteService;

import java.util.List;

public class ClienteController {
    private ClienteService clienteService;

    public ClienteController() {
        this.clienteService = new ClienteService();
    }

    public void agregarCliente(Cliente cliente) {
        clienteService.agregarCliente(cliente);
    }

    public void actualizarCliente(Cliente cliente) {
        clienteService.actualizarCliente(cliente);
    }

    public void eliminarCliente(int clienteId) {
        clienteService.eliminarCliente(clienteId);
    }

    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    public Cliente obtenerClientePorId(int clienteId) {
        return clienteService.obtenerClientePorId(clienteId);
    }
}

