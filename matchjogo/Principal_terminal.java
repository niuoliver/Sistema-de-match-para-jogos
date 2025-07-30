package matchjogo;
import java.util.Scanner;

public class Principal_terminal {
    public static void main(String[] args){
    
//-----------------------------------------------------------------------------------------------------
        Usuario user = new Usuario();
        Banco_geral bd = new Banco_geral();
        bd.set_bd();
        Banco_jogos bj = new Banco_jogos();
        bj.set_jogos();
        Jogo game = new Jogo();
//-----------------------------------------------------------------------------------------------------
        Scanner scan = new Scanner(System.in);

        boolean ct=true;
        //while principal.
        while(ct==true){
            System.out.println("Selecione uma ação:\n[1].FAZER CADASTRO\n[2].FAZER LOGIN\n[3].ENCERRAR"); //tela com botoes
            int op=scan.nextInt();

            boolean ct1=true;

            //while auxiliar para transição entre cadastro, login e perfilamento.
            while(ct1==true){

                if(op==1){ //cadastro de novo usuário. Tela com textFields.
                    user.Cadastro();
                    if(bd.cadastro(user.get_email(), user.get_senha())==true){
                        System.out.println("cadastro feito. Transferindo para login.");
                        op=2;
                    }else{
                        System.out.println("email já cadastrado.");
                        ct1=false;
                    }
                }else
                if(op==2){ //login de usuário já existente. Tela com textFields
                    
                    boolean ct2=true;
                    //while auxiliar para o login.
                    while(ct2==true){
                        user.login();
                        if(bd.login(user.get_email(), user.get_senha())==true){
                            System.out.println("sucesso no login.");
                            //transição para o perfilamento

                            boolean ct3=true;
                            //while auxiliar para perfilamento.
                            while(ct3==true){
                                System.out.println("faça o cadastro do seu jogo favorito.\n"); //tela com um textField e caixas de selessão.
                                game.cadastro();
                                System.out.println("média de " + game.get_nome() + ":"  + game.get_media());

                                //comparar perfil.
                                bj.compara(game.get_media());
                                //cadastrar outro jogo.
                                System.out.println("Deseja comparar outro jogo?\n[1].sim\t[2].não");
                                int op1 = scan.nextInt();
                                if(op1==1){
                                    System.out.println("voltando para o cadastro de jogo.");
                                }else{
                                    ct3=false;
                                    ct2=false;
                                    ct1=false;
                                }
                            }

                        }else{
                            System.out.println("email ou senha inválidos. Deseja reallizar cadastro?\n[1].sim\t[2].não");
                            op=scan.nextInt();
                            if(op==1){
                                System.out.println("transferindo para cadastro.");
                                op=1;
                                ct2=false;
                            }else{
                                op=2;
                            }
                        }
                    }

                }else{ //encerramento do programa. 
                    System.out.println("Até logo!");
                    ct=false;
                    ct1=false;
                }
            }
        }
        scan.close();
    }
    
}
