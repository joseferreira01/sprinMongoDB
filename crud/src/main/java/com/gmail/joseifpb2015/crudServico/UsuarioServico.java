/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.joseifpb2015.crudServico;

import com.gmail.joseifpb2015.crudEntidades.Usuario;
import java.util.List;

/**
 *
 * @author jose
 */
public interface UsuarioServico {

    List<Usuario> listarTodos();

    Usuario listarPorId(String id);

    Usuario cadastrar(Usuario usuario);

    Usuario atualizar(Usuario usuario);
    void remover(String id);
}
