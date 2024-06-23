package com.grupoceon.controller;

import com.grupoceon.model.Usuario;
import com.grupoceon.service.UsuarioService;

import java.util.List;

public class UsuarioController {
    private UsuarioService usuarioService;

    public UsuarioController() {
        this.usuarioService = new UsuarioService();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarioService.agregarUsuario(usuario);
    }

    public void actualizarUsuario(Usuario usuario) {
        usuarioService.actualizarUsuario(usuario);
    }

    public void eliminarUsuario(int usuarioId) {
        usuarioService.eliminarUsuario(usuarioId);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    public Usuario obtenerUsuarioPorId(int usuarioId) {
        return usuarioService.obtenerUsuarioPorId(usuarioId);
    }
}
