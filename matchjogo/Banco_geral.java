package matchjogo;

public class Banco_geral {

    private String[] email; 
    private String[] senha;
    //private String[] jgsalvos;
    //private double[] medias; 

    public Banco_geral(){
        set_bd();

        this.email[0]="neumannoliver12@gmail.com";
        this.email[1]="saymon123@hotmail.com";
        this.email[2]="juninhodopneu@yahoo.com";
        
        this.senha[0]="I'm Batman";
        this.senha[1]="12345";
        this.senha[2]="senha";
    }
    public void set_bd(){
        this.email = new String[100];
        this.senha = new String[100];
        for(int i=0;i<100;i++){
            this.email[i]="";
            this.senha[i]="";
        }
    }

    public boolean cadastro(String email, String senha){
        boolean ct=false;
        for(int i=0;i<100;i++){
            if(this.email[i]==""){
                this.email[i]=email;
                this.senha[i]=senha;
                ct=true;
                break;
            }else
            if(this.email[i].equals(email) & this.email[i]!=""){
                ct=false;
                break;
            }
        }
        return ct;
    }
    

    public boolean login(String email, String senha){
        boolean ct=false;
        for(int i=0;i<100;i++){
            if(this.email[i].equals(email) & this.senha[i].equals(senha)){
                ct=true;
                break;
            }
        }
        return ct;
    }
//----------------------------------------------------------------------------//

    
}
