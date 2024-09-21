package com.realiquez.spring_health_api.service.usuarios;

import com.realiquez.spring_health_api.model.Usuario;
import com.realiquez.spring_health_api.repository.user.UsuarioRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario crearUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> obtenerTodosLosUsuarios(){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> obtenerUsuarioPorId(ObjectId id){
        return usuarioRepository.findById(id);
    }

    public Usuario actualizarUsuairo(ObjectId id, Usuario usuario){
        if(!usuarioRepository.existsById(id)) return null;
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    public String eliminarUsuario(ObjectId id){
        usuarioRepository.deleteById(id);
        return "Usuario con ID: " + id + " eliminado correctamente.";
    }
}
