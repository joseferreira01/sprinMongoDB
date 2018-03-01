/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.joseifpb2015.crud.Entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author jose
 */
@Document
public class Evento implements Serializable{
    
    @Id
    private String id;
    private String titulo;
    private  LocalDate dataInicio;
    private  LocalDate dataTernino;
    private String estado;
    private String cidade;
    private String descricao;

    public Evento() {
    }

    public Evento( String titulo, LocalDate dataInicio, LocalDate dataTernino, String estado, String cidade, String descricao) {
        
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataTernino = dataTernino;
        this.estado = estado;
        this.cidade = cidade;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTernino() {
        return dataTernino;
    }

    public void setDataTernino(LocalDate dataTernino) {
        this.dataTernino = dataTernino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.id);
        hash = 13 * hash + Objects.hashCode(this.titulo);
        hash = 13 * hash + Objects.hashCode(this.dataInicio);
        hash = 13 * hash + Objects.hashCode(this.dataTernino);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evento other = (Evento) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.dataInicio, other.dataInicio)) {
            return false;
        }
        if (!Objects.equals(this.dataTernino, other.dataTernino)) {
            return false;
        }
        return true;
    }
    
    
}
