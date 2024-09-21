package com.realiquez.spring_health_api.repository.user;

import com.realiquez.spring_health_api.model.Usuario;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, ObjectId> {
}
