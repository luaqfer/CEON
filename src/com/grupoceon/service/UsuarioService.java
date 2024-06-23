package com.grupoceon.service;

import com.grupoceon.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void actualizarUsuario(Usuario usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == usuario.getId()) {
                usuarios.set(i, usuario);
                break;
            }
        }
    }

    public void eliminarUsuario(int usuarioId) {
        usuarios.removeIf(usuario -> usuario.getId() == usuarioId);
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    public Usuario obtenerUsuarioPorId(int usuarioId) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == usuarioId) {
                return usuario;
            }
        }
        return null;
    }
}
