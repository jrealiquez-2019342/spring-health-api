package com.realiquez.spring_health_api.service.interfaces.usuarios;

import com.realiquez.spring_health_api.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario crearUsuario(Usuario usuario);
    Usuario obtenerUsuarioPorId(Long id);
    List<Usuario> obtenerTodosLosUsuarios();
    Usuario actualizarUsuario(Long id, Usuario usuario);
    String eliminarUsuario(Long id);
}
