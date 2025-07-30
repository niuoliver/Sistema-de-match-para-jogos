package matchjogo;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela_Inicial implements ActionListener{
    //instância única do banco de dados do sistema.
    Banco_geral bd = new Banco_geral();

    JFrame tela = new JFrame();
    JLabel info = new JLabel("ESCOLHA UMA OPÇÃO.");
    JButton cadastro = new JButton("CADASTRO");
    JButton login = new JButton("LOGIN");

    public Tela_Inicial() {
        // Ajustes visuais
        tela.setLayout(null); // Layout absoluto

        // Título ou mensagem de boas-vindas
        info.setBounds(150, 30, 200, 50); // Centralizado no topo
        tela.add(info);

        // Botão de cadastro
        cadastro.setBounds(150, 100, 200, 60);
        cadastro.setFocusable(false);
        cadastro.addActionListener(this);
        tela.add(cadastro);

        // Botão de login
        login.setBounds(150, 180, 200, 60);
        login.setFocusable(false);
        login.addActionListener(this);
        tela.add(login);

        // Configurações da janela
        tela.setSize(500, 350);
        tela.setResizable(true);
        tela.setLocationRelativeTo(null); // Centraliza a janela na tela
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cadastro){
            //DEVERÁ PASSAR INSTÂNCIA DO BD PARA A TALE CRIADA.
            new Tela_cadastro(bd);
            tela.dispose();
        }
        if(e.getSource() == login){
            //DEVERÁ PASSAR INSTÂNCIA DO BD PARA A TALE CRIADA.
            new Tela_login(bd);
            tela.dispose();
        }
    }

    public static void main(String[] args){
        new Tela_Inicial();
    }
}
