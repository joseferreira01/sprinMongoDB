/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.joseifpb2015.crud.Controler;

import com.gmail.joseifpb2015.crud.Entidades.Usuario;
import com.gmail.joseifpb2015.crud.Servico.UsuarioServico;
import com.gmail.joseifpb2015.crud.response.Response;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jose
 */
@RestController
@RequestMapping(path = "/usuarios")
//@RequestMapping(path = "/api/usuarios")
public class UsuarioControler {

    @Autowired
    private UsuarioServico usuarioServico;

//    public ResponseEntity<Response<List<Usuario>>> listarTodos() {
//        return ResponseEntity.ok(new Response(usuarioServico.listarTodos()));
//    }
    public String listarTodos() {
        System.out.println("Executando a lógica com Spring MVC");
          return "ok";
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<Response<Usuario>> listarPorId(@PathVariable(name = "id") String id) {
        return ResponseEntity.ok(new Response(usuarioServico.listarPorId(id)));
    }

    @PostMapping
    public ResponseEntity<Response<Usuario>> cadastrar(@Valid @RequestBody Usuario usuario, BindingResult result) {
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Usuario>(erros));
        }
        return ResponseEntity.ok(new Response<Usuario>(usuarioServico.cadastrar(usuario)));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Response<Usuario>> atualizar(@PathVariable(name = "id") String id, @Valid @RequestBody Usuario usuario, BindingResult result) {
        if (result.hasErrors()) {
            List<String> erros = new ArrayList<>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Usuario>(erros));
        }
        usuario.setId(id);
        return ResponseEntity.ok(new Response<Usuario>(usuarioServico.atualizar(usuario)));

    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Integer> atualizar(@PathVariable(name = "id") String id) {
        usuarioServico.remover(id);
        return ResponseEntity.ok(1);

    }
}
