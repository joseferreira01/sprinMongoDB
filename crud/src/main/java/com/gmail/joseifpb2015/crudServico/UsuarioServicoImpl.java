/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.joseifpb2015.crudServico;

import com.gmail.joseifpb2015.crudEntidades.Usuario;
import com.gmail.joseifpb2015.crudrepositorio.UsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jose
 */
@Service
public class UsuarioServicoImpl implements UsuarioServico{
    @Autowired
private UsuarioRepositorio usuarioRepositorio;
    @Override
    public List<Usuario> listarTodos() {
    return this.usuarioRepositorio.findAll();
    }

    @Override
    public Usuario listarPorId(String id) {
      return this.usuarioRepositorio.findOne(id);
    }

    @Override
    public Usuario cadastrar(Usuario usuario) {
       return this.usuarioRepositorio.save(usuario);
    }

    @Override
    public Usuario atualizar(Usuario usuario) {
       return this.usuarioRepositorio.save(usuario);
    }

    @Override
    public void remover(String id) {
        this.usuarioRepositorio.delete(id);
    }
    
}
