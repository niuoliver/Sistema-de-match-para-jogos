package matchjogo;

import java.util.Scanner;

public class Jogo {
    
    private  String nome;
    private int genero;//EX: 1-rpg(10), 2-tiro(40), 3-rts(70), 4-haken slash(100), 5-simulador(130).  
    private int modalidade;//EX: 1-açao, 2-aventura, 3-esporte, 4-indie, 5-mobile.
    private int estilo;//EX: 1-single(0) ou 2-multiplayer(1) 
    private int tematica;//EX: 1-Medieval, 2-espacial, 3-futurista, 4-moderno, 5-cyberpunk.
    private int duracao;
    private int design;//EX: 1-mundo aberto,  2-linear 
    private int gameplay;//EX: 1-Primeira, 2-segunda pessoa.

    //entrada de atributos 

    Scanner scan = new Scanner(System.in);
    public void cadastro(){
        
        System.out.println("Insira o nome do seu jogo: ");
        this.nome = scan.nextLine();
        //int pulalinha = scan.nextInt();

        System.out.println("\nO seu jogo é o " + this.nome + " \nagora...");
        
        //GENERO
        System.out.println("\nInforme o gênero do jogo.\n[1].RPG\n[2].TIRO\n[3].RTS\n[4].HACK AND SLASH\n[5].SIMULADOR");
        int op1 ;
        op1= scan.nextInt();
        if(op1 == 1){
            set_genero(10);  

        }else if(op1 == 2){
            set_genero(40);

        }else if(op1 == 3){
            set_genero(70);

        }else if(op1 == 4){
            set_genero(100);

        }else{
            set_genero(130);
        }

        //MODALIDADE
        System.out.println("\nInforme a modalidade do jogo.\n[1].ACAO \n[2].AVENTURA\n[3].ESPORTE\n[4].INDIE\n[5].MOBILE");
        int op2 = 0; 
        op2 = scan.nextInt();
        if(op2 == 1){
            set_modalidade(10) ;  

        }else if(op2 == 2){
            set_modalidade(40)  ;

        }else if(op2 == 3){
            set_modalidade(70) ;

        }else if(op2 == 4){
            set_modalidade(100) ;

        }else{
            set_modalidade(130) ;
        }
    
        //ESTILO
        System.out.println("\nInforme o estilo do jogo.\n[1].SINGLE PLAYER\n[2].MULTIPLAYER");
        int op3 = 0; 
        op3 = scan.nextInt();
        if(op3 == 1){
            set_estilo(0);  

        }else{
            set_estilo(1);
        }

        //TEMATICA
        System.out.println("\nInforme a tematica do jogo.\n[1].MEDIEVAL\n[2].ESPACIAL\n[3].ESPORTE\n[4].MODERNO\n[5].FUTURISTA");
        int op4 = 0; 
        op4 = scan.nextInt();
        if(op4 == 1){
            set_tematica(10);  

        }else if(op4 == 2){
            set_tematica(40);

        }else if(op4 == 3){
            set_tematica(70);

        }else if(op4 == 4){
            set_tematica(100);

        }else{
            set_tematica(130);
        }

        //DURAÇÃO
        System.out.println("\nInforme a duração do jogo.\n[1].CURTO\n[2].MEDIO\n[3].LONGO");
        int op5 = 0;
        op5 = scan.nextInt(); 
        if(op5 == 1){
            set_duracao(10);  

        }else if(op5 == 2){
            set_duracao(50);

        }else{
            set_duracao(90);
        }

        //DESIGN
        System.out.println("\nInforme o design do jogo.\n[1].MUNDO ABERTO\n[2].LINEAR");
        int op6 = 0;
        op6 = scan.nextInt();
        if(op6 == 1){
           set_design(0);  

        }else{
           set_design(1);
        }

        //GAMEPLAY
        System.out.println("\nInforme o gameplay do jogo.\n[1].PRIMEIRA PESSOA\n[2].TERCEIRA PESSOA");
        int op7 = 0;
        op7 = scan.nextInt();
        if(op7 == 1){
            set_gameplay(0);  

        }else{
            set_gameplay(1);
        }     
    }
    public void set_nome(String nome){
        this.nome = nome;
    }
    public void set_genero(int parametro){
        this.genero = parametro;
    }
    public void set_modalidade(int parametro){
        this.modalidade = parametro;
    }
    public void set_estilo(int parametro){
        this.estilo = parametro;
    }
    public void set_tematica(int parametro){
        this.tematica = parametro;
    }
    public void set_duracao(int parametro){
        this.duracao = parametro;
    }
    public void set_design(int parametro){
        this.design = parametro;
    }
    public void set_gameplay(int parametro){
        this.gameplay = parametro;
    }

    public double get_media(){
        double media=(this.tematica+this.design+this.duracao+this.estilo+this.gameplay+this.genero+this.modalidade)/7;

        return media;
    }

    public String get_nome(){
        return this.nome;
    }
}


