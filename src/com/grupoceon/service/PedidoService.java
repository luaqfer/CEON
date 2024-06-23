package com.grupoceon.service;

import com.grupoceon.model.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoService {
    private List<Pedido> pedidos = new ArrayList<>();

    public void crearPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void actualizarPedido(Pedido pedido) {
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId() == pedido.getId()) {
                pedidos.set(i, pedido);
                break;
            }
        }
    }

    public void eliminarPedido(int pedidoId) {
        pedidos.removeIf(pedido -> pedido.getId() == pedidoId);
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }

    public Pedido obtenerPedidoPorId(int pedidoId) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == pedidoId) {
                return pedido;
            }
        }
        return null;
    }
}

