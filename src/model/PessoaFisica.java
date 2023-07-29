/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 * @author leosc
 */
public class PessoaFisica extends Pessoa implements Serializable {

    private String cpf;

//    public PessoaFisica() {
//    }

    public PessoaFisica(Integer id, String nome, Integer idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public Integer getIdade() {
        return super.getIdade();
    }

    @Override
    public void setIdade(Integer idade) {
        super.setIdade(idade);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(this.getId()).append("\n");
        sb.append("Nome: ").append(this.getNome()).append("\n");
        sb.append("CPF: ").append(cpf).append("\n");
        sb.append("Idade: ").append(this.getIdade());
        return sb.toString();
    }

}
