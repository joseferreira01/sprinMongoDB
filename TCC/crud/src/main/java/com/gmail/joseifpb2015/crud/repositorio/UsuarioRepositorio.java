/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.joseifpb2015.crud.repositorio;

import com.gmail.joseifpb2015.crud.Entidades.Usuario;
import java.io.Serializable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author jose
 */
public interface UsuarioRepositorio extends MongoRepository<Usuario, String>{
    
}
