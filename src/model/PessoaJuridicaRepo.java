/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author leosc
 */


public class PessoaJuridicaRepo {

private ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<>();
    
    

    public void inserir(PessoaJuridica pessoaJuridica) {
        pessoasJuridicas.add(pessoaJuridica);
    }

    public void alterar(PessoaJuridica pessoaJuridica) {
        int index = pessoasJuridicas.indexOf(pessoaJuridica);
        pessoasJuridicas.set(index, pessoaJuridica);
    }

    public void excluir(PessoaJuridica pessoaJuridica) {
        pessoasJuridicas.remove(pessoaJuridica);
    }

    public PessoaJuridica obter(int id) {
        return pessoasJuridicas.get(id);
    }

    public ArrayList<PessoaJuridica> obterTodos() {
        return pessoasJuridicas;
    }

    public void persistir(String nomeArquivo) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File(nomeArquivo));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(pessoasJuridicas);
        oos.close();
        System.out.println("Dados de Pessoa Juridica Armazenados");
    }

    public void recuperar(String nomeArquivo) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(new File(nomeArquivo));
        ObjectInputStream ois = new ObjectInputStream(fis);
        pessoasJuridicas = (ArrayList<PessoaJuridica>) ois.readObject();
        ois.close();
        System.out.println("Dados de Pessoa Juridica Recuperados");
    }


}
