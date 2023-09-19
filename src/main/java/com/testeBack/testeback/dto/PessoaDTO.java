package com.testeBack.testeback.dto;


import com.testeBack.testeback.domain.Pessoa;

public class PessoaDTO {

    private Integer id;
    private String nome;

    private String email;

    private String senha;
    private  String confirmaSenha;
    public PessoaDTO() {
    }

    public PessoaDTO(Integer id, String nome, String email,String senha , String confirmaSenha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.confirmaSenha = confirmaSenha;
    }

    public PessoaDTO(Pessoa obj) {
        id = obj.getId();
        nome = getNome();
        email = getEmail();
        senha = obj.getSenha();
        confirmaSenha = obj.getConfirmaSenha();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }
}
