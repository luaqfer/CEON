package com.grupoceon.controller;

import com.grupoceon.model.Pedido;
import com.grupoceon.service.PedidoService;

import java.util.List;

public class PedidoController {
    private PedidoService pedidoService;

    public PedidoController() {
        this.pedidoService = new PedidoService();
    }

    public void crearPedido(Pedido pedido) {
        pedidoService.crearPedido(pedido);
    }

    public void actualizarPedido(Pedido pedido) {
        pedidoService.actualizarPedido(pedido);
    }

    public void eliminarPedido(int pedidoId) {
        pedidoService.eliminarPedido(pedidoId);
    }

    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }

    public Pedido obtenerPedidoPorId(int pedidoId) {
        return pedidoService.obtenerPedidoPorId(pedidoId);
    }
}
