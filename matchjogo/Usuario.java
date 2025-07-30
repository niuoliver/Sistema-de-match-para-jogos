package matchjogo;

import java.util.Scanner;

public class Usuario {
    Scanner scan = new Scanner(System.in);
    private String nome;
    private int idade;
    private String email;
    private String senha;
    
    //CRIAR UM VETOR PARA "BANCO DE DADOS" - EMAIL E SENHA.  
    public void Cadastro(){
        System.out.println("INSIRA O SEU NOME COMPLETO. ");
        this.nome = scan.nextLine();
        //int pulalinha = scan.nextInt();

        System.out.println("\nQUAL A SUA IDADE. ");
        this.idade = scan.nextInt();
        this.email = scan.nextLine(); //essa linha existe para receber o "enter" da leitura da idade.
        
        System.out.println("\nINSIRA O SEU EMAIL. ");
        this.email = scan.nextLine();
        //pulalinha = scan.nextInt();
        

        System.out.println("\nCRIE UMA SENHA. ");
        this.senha = scan.nextLine();
        //pulalinha = scan.nextInt();
    
        //checagem de dados para cadastro no main.
    }

    public void login(){
        System.out.println("\nINSIRA O SEU EMAIL. ");
        this.email = scan.nextLine();
        //int //pulalinha = scan.nextInt();

        System.out.println("\nINSIRA A SUA SENHA. ");
        this.senha = scan.nextLine();
        //pulalinha = scan.nextInt();        
    }

    public String get_email(){
        return this.email;
    }
    public String get_senha(){
        return this.senha;
    }

    public String get_nome(){
        return this.nome;
    }
    
    public int get_idade(){
        return this.idade;
    }    
}




    


