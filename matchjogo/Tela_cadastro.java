package matchjogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//LOGIN E SENHA DEVERÃO FAZER PARTE DA MESMA CLASSE, MAS COMO TELAS DIFERENTES.
public class Tela_cadastro implements ActionListener{
    Banco_geral banco;

    //--INSTANCIAMENTO DA TELA DE CADASTRO------------
    JFrame cadastro = new JFrame();
    JButton confirma = new JButton("CADASTRAR");
    JButton voltar = new JButton("VOLTAR");

    JTextField nome = new JTextField("nome");
    JTextField idade = new JTextField("idade");
    JTextField email = new JTextField("email");
    JPasswordField senha = new JPasswordField("senha");

    JLabel info_nome = new JLabel("insira seu nome:");
    JLabel info_idade = new JLabel("insira sua idade:");
    JLabel info_email = new JLabel("insira seu e-mail:");
    JLabel info_senha = new JLabel("crie uma senha:");

    public Tela_cadastro(Banco_geral bd) {
        this.banco = bd;

        // CONSTRUÇÃO DA TELA DE CADASTRO ------------------------
        cadastro.setLayout(null); // Usando posicionamento absoluto

        // NOME
        info_nome.setBounds(30, 20, 80, 25);
        cadastro.add(info_nome);

        nome.setBounds(30, 45, 150, 25);
        cadastro.add(nome);

        // IDADE
        info_idade.setBounds(220, 20, 80, 25);
        cadastro.add(info_idade);

        idade.setBounds(220, 45, 150, 25);
        cadastro.add(idade);

        // EMAIL
        info_email.setBounds(30, 90, 80, 25);
        cadastro.add(info_email);

        email.setBounds(30, 115, 150, 25);
        cadastro.add(email);

        // SENHA
        info_senha.setBounds(220, 90, 80, 25);
        cadastro.add(info_senha);

        senha.setBounds(220, 115, 150, 25);
        cadastro.add(senha);

        // BOTÃO CONFIRMAR
        confirma.setBounds(30, 200, 160, 40);
        confirma.addActionListener(this);
        confirma.setFocusable(false);
        cadastro.add(confirma);

        // BOTÃO VOLTAR
        voltar.setBounds(210, 200, 160, 40);
        voltar.addActionListener(this);
        cadastro.add(voltar);

        // CONFIGURAÇÕES FINAIS
        cadastro.setSize(420, 300);
        cadastro.setResizable(true);
        cadastro.setLocationRelativeTo(null); // Centraliza a janela
        cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadastro.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==confirma){
            String email_copy = email.getText();
            String senha_copy = String.valueOf(senha.getPassword());
            if(banco.cadastro(email_copy, senha_copy)==true){
                //menságem de sucesso via optionPane. Transferência direta para login.
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.", "CADASTRO", JOptionPane.PLAIN_MESSAGE);
                cadastro.dispose();
                new Tela_login(banco);
            }else{
                //menságem de fracasso via optionPane.
                JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro.", "CADASTRO", JOptionPane.PLAIN_MESSAGE);
            }
        }
        if(e.getSource()==voltar){
            cadastro.dispose();
            new Tela_Inicial();
        }
    }
    
}
