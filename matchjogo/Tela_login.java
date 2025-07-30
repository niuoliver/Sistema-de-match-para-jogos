package matchjogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tela_login implements ActionListener{
    Banco_geral banco = new Banco_geral();

    JFrame login = new JFrame();

    JLabel rotulo = new JLabel("INSIRA SUAS INFORMAÇÕES.");

    JButton submit = new JButton("login");
    JButton voltar = new JButton("voltar");

    JLabel info_email = new JLabel("insira seu e-mail:");
    JLabel info_senha = new JLabel("insira sua senha:");

    JTextField email = new JTextField("email");
    JPasswordField senha = new JPasswordField("senha");

    public Tela_login(Banco_geral banco) {
    // Ajuste lógico do construtor
    this.banco = banco;

    login.setLayout(null); // Layout absoluto

    // Rótulo de boas-vindas / título
    rotulo.setBounds(130, 20, 200, 30);
    login.add(rotulo);

    // Email
    info_email.setBounds(50, 70, 100, 25);
    login.add(info_email);

    email.setBounds(50, 95, 140, 25);
    login.add(email);

    // Senha
    info_senha.setBounds(210, 70, 100, 25);
    login.add(info_senha);

    senha.setBounds(210, 95, 140, 25);
    login.add(senha);

    // Botão de login
    submit.setBounds(90, 160, 100, 35);
    submit.setFocusable(false);
    submit.addActionListener(this);
    login.add(submit);

    // Botão de voltar
    voltar.setBounds(220, 160, 100, 35);
    voltar.setFocusable(false);
    voltar.addActionListener(this);
    login.add(voltar);

    // Configurações finais da janela
    login.setSize(420, 280);
    login.setResizable(true);
    login.setLocationRelativeTo(null); // Centraliza na tela
    login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    login.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
            String email_copy = email.getText();
            String senha_copy = String.valueOf(senha.getPassword());
            if(banco.login(email_copy, senha_copy)==true){
                //LOGIN. TRANSFERÊNCIA PARA O PERFILADOR. optionPane de sucesso.
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso.", "LOGIN", JOptionPane.PLAIN_MESSAGE);
                login.dispose();
                new Tela_perfil();
            }else{
                //MESÁGEM DE ERRO. optionPane de fracasso.
                JOptionPane.showMessageDialog(null, "Não foi possível realizar o login.", "LOGIN", JOptionPane.PLAIN_MESSAGE);
            }
        }
        if(e.getSource()==voltar){
            login.dispose();
            new Tela_Inicial();
        }
    }
}
