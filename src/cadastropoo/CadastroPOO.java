/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastropoo;

import java.io.IOException;
import model.PessoaFisica;
import model.PessoaJuridica;
import repository.PessoaFisicaRepo;
import repository.PessoaJuridicaRepo;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author leosc
 */
public class CadastroPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        boolean inicio = true;       
        PessoaFisicaRepo repo1 = new PessoaFisicaRepo();
        PessoaJuridicaRepo repo2 = new PessoaJuridicaRepo();
        
        while(inicio == true){
        
        System.out.println("==================================");
        System.out.println("1 - Incluir Pessoa");
        System.out.println("2 - Alterar Pessoa");
        System.out.println("3 - Excluir Pessoa");
        System.out.println("4 - Buscar pelo Id");
        System.out.println("5 - Exibir Todos");
        System.out.println("6 - Persistir Dados");
        System.out.println("7 - Recuperar Dados");
        System.out.println("0 - Finalizar Programa");
        System.out.println("==================================");
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero desejado: ");
        int numero = scanner.nextInt();
       
        
        switch (numero){
        case 1 -> {
            boolean caso1 = true;
            
            while(caso1 == true){
                System.out.println("Selecionado Incluir Pessoa");
                System.out.println("F - Pessoa Fisica | J - Pessoa Juridica ");
                String tipoPessoa = scanner.next().toUpperCase();
                
                if(tipoPessoa.equals("F")){
                    System.out.println("Selecionado Pessoa Fisica");
                    PessoaFisica pessoa = new PessoaFisica(12, "", 12);

//                    PessoaFisica p2 = new




                    pessoa.setId(new Random().nextInt());

                    System.out.println("Digite o Nome: ");
                    String nome = scanner.next();
                    System.out.println("Digite o CPF: ");
                    String cpf = scanner.next();
                    System.out.println("Digite a Idade: ");
                    Integer idade = scanner.nextInt();

                    pessoa.setNome(nome);
                    pessoa.setCpf(cpf);
                    pessoa.setIdade(idade);

                    repo1.inserir(pessoa);


                    //teste
//                    PessoaFisica pessoa1 = new model.PessoaFisica(1,"Ana","111111111",20);
//                    PessoaFisica pessoa2 = new model.PessoaFisica(2,"Paulo","222222222",19);
//                    PessoaFisica pessoa3 = new model.PessoaFisica(3,"Tadeu","333333333",89);
//                    PessoaFisica pessoa4 = new model.PessoaFisica(4,"Roberto","4444444444",35);
//                    PessoaFisica pessoa5 = new model.PessoaFisica(5,"Walter","5555555555",50);
//                    repo1.inserir(pessoa1);
//                    repo1.inserir(pessoa2);
//                    repo1.inserir(pessoa3);
//                    repo1.inserir(pessoa4);
//                    repo1.inserir(pessoa5);
                    
                    
                    /*System.out.println(pessoa);*/
                    caso1 = false;
                    
                }else if(tipoPessoa.equals("J")){
                    System.out.println("Selecionado Pessoa Juridica");
                    
                   
                    /*System.out.println("Digite o ID: ");
                    int Id = scanner.nextInt();
                    System.out.println("Digite o Nome: ");
                    String nome = scanner.next();
                    System.out.println("Digite o CNPJ: ");
                    String cnpj = scanner.next();
               
                    PessoaJuridica pessoa = new model.PessoaJuridica(Id,nome,cnpj);*/
                    

                //teste
//                    PessoaJuridica pessoa1 = new PessoaJuridica(1,"Tapateu","11111111");
//                    PessoaJuridica pessoa2 = new PessoaJuridica(2,"Noscodai","2222222");
//                    PessoaJuridica pessoa3 = new PessoaJuridica(3,"Antsgus","3333333");
//                    PessoaJuridica pessoa4 = new PessoaJuridica(4,"onteihoje","4444444444");
//                    PessoaJuridica pessoa5 = new PessoaJuridica(5,"codemar","555555555");
                   
                    
//                    repo2.inserir(pessoa1);
//                    repo2.inserir(pessoa2);
//                    repo2.inserir(pessoa3);
//                    repo2.inserir(pessoa4);
//                    repo2.inserir(pessoa5);
//
//                    caso1 = false;
                    
                }else {
                    System.out.println("Comando Incorreto!!");
                    caso1 = true;
                }
            }   }
        case 2 -> {
                boolean caso1 = true;
                while(caso1 == true){
                System.out.println("Selecionado Alterar Pessoa");
                System.out.println("F - Pessoa Fisica | J - Pessoa Juridica ");
                String tipoPessoa = scanner.next().toUpperCase();
                
                if(tipoPessoa.equals("F")){
                    System.out.println("Digite o ID da pessoa que deseja alterar: ");
                    Integer id = scanner.nextInt();
                    scanner.nextLine();

                    PessoaFisica pessoaFisica = repo1.obter(id);
                    System.out.println(pessoaFisica);
            
                    System.out.println("Digite o nome: ");
                    String nome = scanner.nextLine();
                    
                    System.out.println("Digite o CPF: ");
                    String cpf = scanner.nextLine();
                    
                    System.out.println("Digite o Idade: ");
                    Integer idade = scanner.nextInt();
                   
                    PessoaFisica pessoaAlterada = new PessoaFisica(id, nome, idade);
                    repo1.alterar(pessoaAlterada);
                    
                    System.out.println("Pessoa alterada com sucesso!");
                    caso1 = false;

                }else if (tipoPessoa.equals("J")){
                    System.out.println("Digite o ID da pessoa que deseja alterar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    PessoaJuridica pessoaJuridica = repo2.obter(id);
                    System.out.println(pessoaJuridica);
            
                    System.out.println("Digite o nome: ");
                    String nome = scanner.nextLine();
                    
                    System.out.println("Digite o CNPJ: ");
                    String cnpj = scanner.nextLine();
                    
                    PessoaJuridica pessoaAlterada = new PessoaJuridica(id,nome,cnpj);
                    repo2.alterar(pessoaAlterada);
                    
                    System.out.println("Pessoa alterada com sucesso!");
                    caso1 = false;
                }else{
                    System.out.println("Comando Incorreto!!");
                    caso1 = true;
                }
                }  
          
        }
        
        case 3 ->{ 
            
            System.out.println("Selecionado Excluir Pessoa");
            boolean caso1 = true;
            while(caso1 == true){
                System.out.println("F - Pessoa Fisica | J - Pessoa Juridica ");
                String tipoPessoa = scanner.next().toUpperCase();
                if(tipoPessoa.equals("F")){
                    System.out.println("Digite o ID da pessoa que deseja alterar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    repo1.excluir(id);
                    System.out.println("Pessoa excluida com sucesso!");
               
                
                    caso1 = false; 
                }else if (tipoPessoa.equals("J")){
                    System.out.println("Digite o ID da pessoa que deseja alterar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    repo2.excluir(id);
                    System.out.println("Pessoa excluida com sucesso!");

                    caso1 = false;
                }else{
                    System.out.println("Comando Incorreto!!");
                    caso1 = true;
            }
        
          }
        }
        
        
        case 4 -> {
            System.out.println("Selecionado Buscar pelo Id");
            boolean caso1 = true;
            while(caso1 == true){
                
                System.out.println("F - Pessoa Fisica | J - Pessoa Juridica ");
                String tipoPessoa = scanner.next().toUpperCase();
                
                if(tipoPessoa.equals("F")){
                    
                    System.out.println("Digite o ID da pessoa que deseja obter: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    
                    PessoaFisica pessoaFisica = repo1.obter(id);
                    System.out.println(pessoaFisica);
                    
                    System.out.println("Pessoa obtida com sucesso!");
               
                
                    caso1 = false; 
                }else if (tipoPessoa.equals("J")){
                    
                    System.out.println("Digite o ID da pessoa que deseja obter: ");
                    int id = scanner.nextInt();                  
                    scanner.nextLine();
                    
                    PessoaJuridica pessoaJuridica = repo2.obter(id);
                    System.out.println(pessoaJuridica);
                    
                    System.out.println("Pessoa obtida com sucesso!");

                    caso1 = false;
                }else{
                    System.out.println("Comando Incorreto!!");
                    caso1 = true;
            }
        
          }
        }
        case 5 -> {
            System.out.println("Selecionado Exibir Todos");
            
            boolean caso1 = true;
            while(caso1 == true){
                
                System.out.println("F - Pessoa Fisica | J - Pessoa Juridica ");
                String tipoPessoa = scanner.next().toUpperCase();
                
                if(tipoPessoa.equals("F")){
                    
                   for (PessoaFisica pessoa : repo1.obterTodos()) {
                    System.out.println(pessoa);
               
                   }
              
                    caso1 = false; 
                }else if (tipoPessoa.equals("J")){
                    
                    for (PessoaJuridica pessoa : repo2.obterTodos()) {
                    System.out.println(pessoa);
                    }

                    caso1 = false;
                }else{
                    System.out.println("Comando Incorreto!!");
                    caso1 = true;
            }
        
          }
        }
        case 6 -> {
            System.out.println("Selecionado  Persistir Dados");
                scanner.nextLine();
                System.out.println("Digite o prefixo do arquivo:");
                String prefixo = scanner.nextLine();
                
                repo1.persistir(prefixo + ".fisica.bin");
                repo2.persistir(prefixo + ".fisica.bin");
        
        }
        case 7 -> {
            System.out.println("Selecionado Recuperar Dados");
                scanner.nextLine();
                System.out.println("Digite o prefixo do arquivo:");
                String prefixo = scanner.nextLine();
                
                repo1.recuperar(prefixo + ".fisica.bin");
                repo2.recuperar(prefixo + ".fisica.bin");
        
        }
        case 0 -> {
            System.out.println("Programa Finalizado!");
            inicio = false;
                }
        default -> System.out.println("Comando Incorreto!!");
            
        }
        
    }
 }
}   

