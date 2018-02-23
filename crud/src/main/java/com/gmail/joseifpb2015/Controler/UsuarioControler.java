/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.joseifpb2015.Controler;

import com.gmail.joseifpb2015.crudEntidades.Usuario;
import com.gmail.joseifpb2015.crudServico.UsuarioServico;
import java.util.List;
import java.util.jar.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jose
 */
@RestController
@RequestMapping(path = "/api/usuarios")
public class UsuarioControler {
    @Autowired
    private UsuarioServico usuarioServico;
    public ResponseEntity<List<Usuario>> listarTodos(){
        return ResponseEntity.ok(usuarioServico.listarTodos());
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<Usuario> listarPorId(@PathVariable(name = "id")String id){
        return ResponseEntity.ok(usuarioServico.listarPorId(id));
    }
     public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioServico.cadastrar(usuario));
    }
     public ResponseEntity<Usuario> atualizar(@PathVariable(name = "id") String id,@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioServico.cadastrar(usuario));
    }
}
