package com.realiquez.spring_health_api.service.interfaces.usuarios;

import com.realiquez.spring_health_api.model.Usuario;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
@Service
public class UsuarioServiceImpl implements UsuarioService{
    private Map<Long, Usuario> usuarios = new HashMap<>();
    //private ObjectId contadorId = 1L;


    @Override
    public Usuario crearUsuario(Usuario usuario) {
        usuario.setId(contadorId++);
        usuarios.put(usuario.getId(), usuario);
        return usuario;
    }

    @Override
    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarios.get(id);
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return new ArrayList<>(usuarios.values());
    }

    @Override
    public Usuario actualizarUsuario(Long id, Usuario usuario) {
        if(!usuarios.containsKey(id)) return null;
        usuario.setId(id);
        usuarios.put(usuario.getId(), usuario);
        return usuario;
    }

    @Override
    public String eliminarUsuario(Long id) {
        usuarios.remove(id);
        return "Usuario con ID: " + id + " eliminado.";
    }
}
*/