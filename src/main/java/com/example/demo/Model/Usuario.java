package com.example.demo.Model;

import java.util.List;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "cpf", nullable = false, length = 256)
    private String cpf;

    @ManyToMany
    @JoinColumn(name = "nivel_acesso_id")
    private List<NivelAcesso> nivelAcesso;

    @Column(name = "senha", nullable = false, length = 256)
    private String senha;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "ativo", nullable = true, length = 250)
    @ColumnDefault("true")
    private boolean ativo = true;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<NivelAcesso> getNivelAcesso() {
        return this.nivelAcesso;
    }

    public void setNivelAcesso(List<NivelAcesso> nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public boolean getAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
