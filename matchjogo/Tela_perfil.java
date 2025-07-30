package matchjogo;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela_perfil implements ActionListener{



    JTextArea jogos;
    JTextField nome_jogo;

    JComboBox<String> comboGenero;
    JComboBox<String> comboModalidade;
    JComboBox<String> comboEstilo;
    JComboBox<String> comboTematica;
    JComboBox<String> comboDuracao;
    JComboBox<String> comboDesign;
    JComboBox<String> comboGameplay;

    Jogo jgUser = new Jogo();

    JFrame perfil = new JFrame();

    JButton btnSair = new JButton("SAIR");
    JButton btnOutro = new JButton("OUTRO JOGO");
    JButton lerNomeJogo = new JButton("OK");
    JButton btnSetGenero = new JButton("Definir Gênero");
    JButton btnSetModalidade = new JButton("Definir Modalidade");
    JButton btnSetEstilo = new JButton("Definir Estilo");
    JButton btnSetTematica = new JButton("Definir Tematica");
    JButton btnSetDuracao = new JButton("Definir Duração");
    JButton btnSetDesign = new JButton("Definir Design");
    JButton btnSetGameplay= new JButton("Definir Gameplay");

    Banco_jogos bd = new Banco_jogos();

    //construtor
    public Tela_perfil() {
        perfil.setSize(800, 800);
        perfil.setTitle("Tela Principal");
        perfil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        perfil.setLocationRelativeTo(null);
        perfil.setLayout(null);

        // Botão Sair
        btnSair.setBounds(50, 700, 100, 50);
        btnSair.setFocusable(false);
        btnSair.addActionListener(this);
        perfil.add(btnSair);

        // Botão Outro Jogo
        btnOutro.setBounds(150, 700, 100, 50);
        btnOutro.setFocusable(false);
        btnOutro.addActionListener(this);
        perfil.add(btnOutro);

        // Área de log
        jogos = new JTextArea();
        jogos.setEditable(false);
        jogos.setLineWrap(true);
        jogos.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(jogos);
        scroll.setBounds(20, 200, 500, 450);
        perfil.add(scroll);

        // Campo de texto para nome do jogo
        nome_jogo = new JTextField();
        nome_jogo.setBounds(140, 90, 250, 48);
        perfil.add(nome_jogo);

        JLabel jLabel = new JLabel("-- Insira o nome do seu jogo favorito --");
        jLabel.setBounds(140, 50, 250, 30);
        perfil.add(jLabel);

        // Botão OK para ler nome
        lerNomeJogo.setBounds(210, 145, 100, 50);
        lerNomeJogo.setFocusable(false);
        lerNomeJogo.addActionListener(this);
        lerNomeJogo.setEnabled(true);   // habilitado inicialmente
        perfil.add(lerNomeJogo);



        //                     COMBO BOX PARA TODOS OS PARAMETROS                       //
        //------------------------------------------------------------------------------//
        // ComboBox de GÊNERO
        String[] generos = {"RPG", "Tiro", "RTS", "Hack and Slash", "Simulador"};
        comboGenero = new JComboBox<>(generos);
        comboGenero.setBounds(580, 50, 150, 30);
        comboGenero.setEnabled(false);    // Desabilitado inicialmente
        perfil.add(comboGenero);

        // Botão definir GÊNERO
        btnSetGenero.setBounds(580, 90, 150, 30);
        btnSetGenero.setFocusable(false);
        btnSetGenero.addActionListener(this);
        btnSetGenero.setEnabled(false);   // Desabilitado inicialmente
        perfil.add(btnSetGenero);

        perfil.setVisible(true);

        //------------------------------------------------------------------------------//
        // ComboBox de MODALIDADE
        String[] modalidade = {"Ação", "Aventura", "Esporte", "Indie", "Mobile"};
        comboModalidade = new JComboBox<>(modalidade);
        comboModalidade.setBounds(580, 150, 150, 30);
        comboModalidade.setEnabled(false);    // Desabilitado inicialmente
        perfil.add(comboModalidade);

        // Botão definir MODALIDADE
        btnSetModalidade.setBounds(580, 190, 150, 30);
        btnSetModalidade.setFocusable(false);
        btnSetModalidade.addActionListener(this);
        btnSetModalidade.setEnabled(false); // Desabilitado inicialmente   
        perfil.add(btnSetModalidade);

        //------------------------------------------------------------------------------//
        // ComboBox de ESTILO
        String[] estilo = {"Single Player", "Multiplayer"};
        comboEstilo = new JComboBox<>(estilo);
        comboEstilo.setBounds(580, 250, 150, 30);
        comboEstilo.setEnabled(false);    // Desabilitado inicialmente
        perfil.add(comboEstilo);

        // Botão definir ESTILO
        btnSetEstilo.setBounds(580, 290, 150, 30);
        btnSetEstilo.setFocusable(false);
        btnSetEstilo.addActionListener(this);
        btnSetEstilo.setEnabled(false); // Desabilitado inicialmente   
        perfil.add(btnSetEstilo);

        //------------------------------------------------------------------------------//
        // ComboBox de TEMATICA
        String[] tematica = {"Medieval", "Espacial", "Esporte", "Moderno", "Futurista"};
        comboTematica = new JComboBox<>(tematica);
        comboTematica.setBounds(580, 350, 150, 30);
        comboTematica.setEnabled(false);    // Desabilitado inicialmente
        perfil.add(comboTematica);

        // Botão definir TEMATICA
        btnSetTematica.setBounds(580, 390, 150, 30);
        btnSetTematica.setFocusable(false);
        btnSetTematica.addActionListener(this);
        btnSetTematica.setEnabled(false); // Desabilitado inicialmente   
        perfil.add(btnSetTematica);

        //------------------------------------------------------------------------------//
        // ComboBox de DURAÇÃO
        String[] duracao = {"Curto", "Medio", "Longo"};
        comboDuracao = new JComboBox<>(duracao);
        comboDuracao.setBounds(580, 450, 150, 30);
        comboDuracao.setEnabled(false);    // Desabilitado inicialmente
        perfil.add(comboDuracao);

        // Botão definir TEMATICA
        btnSetDuracao.setBounds(580, 490, 150, 30);
        btnSetDuracao.setFocusable(false);
        btnSetDuracao.addActionListener(this);
        btnSetDuracao.setEnabled(false); // Desabilitado inicialmente   
        perfil.add(btnSetDuracao);

        //------------------------------------------------------------------------------//
        // ComboBox de DESIGN
        String[] design = {"Mundo aberto", "Linear"};
        comboDesign = new JComboBox<>(design);
        comboDesign.setBounds(580, 550, 150, 30);
        comboDesign.setEnabled(false);    // Desabilitado inicialmente
        perfil.add(comboDesign);

        // Botão definir DESIGN
        btnSetDesign.setBounds(580, 590, 150, 30);
        btnSetDesign.setFocusable(false);
        btnSetDesign.addActionListener(this);
        btnSetDesign.setEnabled(false); // Desabilitado inicialmente   
        perfil.add(btnSetDesign);

        //------------------------------------------------------------------------------//
        // ComboBox de GAMEPLAY
        String[] gameplay = {"Primeira pessoa", "Terceira pessoa "};
        comboGameplay = new JComboBox<>(gameplay);
        comboGameplay.setBounds(580, 650, 150, 30);
        comboGameplay.setEnabled(false);    // Desabilitado inicialmente
        perfil.add(comboGameplay);

        // Botão definir DESIGN
        btnSetGameplay.setBounds(580, 690, 150, 30);
        btnSetGameplay.setFocusable(false);
        btnSetGameplay.addActionListener(this);
        btnSetGameplay.setEnabled(false); // Desabilitado inicialmente   
        perfil.add(btnSetGameplay);



        perfil.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSair) {
            System.exit(0);
        }

        if (e.getSource() == btnOutro) {
            perfil.dispose();
            new Tela_perfil();
        }

        if (e.getSource() == lerNomeJogo) {
            String nome = nome_jogo.getText().trim();
            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(perfil, "Insira o nome do seu jogo", "AVISO!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            jgUser.set_nome(nome);
            log("Nome do jogo: " + nome);

            comboGenero.setEnabled(true);  //habilita a escolha do genero após definir o nome do jogo  
            btnSetGenero.setEnabled(true); 
        }

        if (e.getSource() == btnSetGenero) {
            String selecionado = (String) comboGenero.getSelectedItem();
            switch (selecionado) {
                case "RPG": jgUser.set_genero(10); break;
                case "Tiro": jgUser.set_genero(40); break;
                case "RTS": jgUser.set_genero(70); break;
                case "Hack and Slash": jgUser.set_genero(100); break;
                case "Simulador": jgUser.set_genero(130); break;
            }
            log("Gênero definido: " + selecionado);

            btnSetModalidade.setEnabled(true);  //habilita as escolhas após definir o primeiro parâmetro
            comboModalidade.setEnabled(true); 

            lerNomeJogo.setEnabled(false);   // Desabilitado após
            comboGenero.setEnabled(false);   // Desabilitado após
            btnSetGenero.setEnabled(false);  // Desabilitado após
            
        }
        if (e.getSource() == btnSetModalidade) {
            String selecionado = (String) comboModalidade.getSelectedItem();
            switch (selecionado) {
                case "Ação": jgUser.set_modalidade(10); break;
                case "Aventura": jgUser.set_modalidade(40); break;
                case "Esporte": jgUser.set_modalidade(70); break;
                case "Indie": jgUser.set_modalidade(100); break;
                case "Mobile": jgUser.set_modalidade(130); break;
            }
            log("Modalidade definida: " + selecionado);

            btnSetEstilo.setEnabled(true);  //habilita as escolhas após definir o parâmetro
            comboEstilo.setEnabled(true);
            
            comboModalidade.setEnabled(false);   // Desabilitado após
            btnSetModalidade.setEnabled(false);  // Desabilitado após

        }
        if (e.getSource() == btnSetEstilo) {
            String selecionado = (String) comboEstilo.getSelectedItem();
            switch (selecionado) {
                case "Single Player": jgUser.set_estilo(0); break;
                case "Multiplayer": jgUser.set_estilo(1); break;
                
            }
            log("Estilo definido: " + selecionado);
           
            comboEstilo.setEnabled(false);   // Desabilitado após
            btnSetEstilo.setEnabled(false);  // Desabilitado após

            btnSetTematica.setEnabled(true);  //habilita as escolhas após definir o parâmetro
            comboTematica.setEnabled(true);

        }
        if (e.getSource() == btnSetTematica) {
            String selecionado = (String) comboTematica.getSelectedItem();
            switch (selecionado) {
                case "Medieval": jgUser.set_tematica(10); break;
                case "Espacial": jgUser.set_tematica(40); break;
                case "Esporte": jgUser.set_tematica(70); break;
                case "Moderno": jgUser.set_tematica(100); break;
                case "Futurista": jgUser.set_tematica(130); break;
            }
            log("Tematica definida: " + selecionado);
            
            comboTematica.setEnabled(false);   // Desabilitado após
            btnSetTematica.setEnabled(false);  // Desabilitado após

            btnSetDuracao.setEnabled(true);  //habilita as escolhas após definir o parâmetro
            comboDuracao.setEnabled(true);
        }
        if (e.getSource() == btnSetDuracao) {
            String selecionado = (String) comboDuracao.getSelectedItem();
            switch (selecionado) {
                case "Curto": jgUser.set_duracao(10); break;
                case "Medio": jgUser.set_duracao(50); break;
                case "Longo": jgUser.set_duracao(90); break;
            }
            log("Duração definida: " + selecionado);
           
            comboDuracao.setEnabled(false);   // Desabilitado após
            btnSetDuracao.setEnabled(false);  // Desabilitado após

            btnSetDesign.setEnabled(true);  //habilita as escolhas após definir o parâmetro
            comboDesign.setEnabled(true);

        }
        if (e.getSource() == btnSetDesign) {
            String selecionado = (String) comboDesign.getSelectedItem();
            switch (selecionado) {
                case "Mundo aberto": jgUser.set_design(0); break;
                case "Linear": jgUser.set_design(1); break;
                
            }
            log("Design definido: " + selecionado);
           
            comboDesign.setEnabled(false);   // Desabilitado após
            btnSetDesign.setEnabled(false);  // Desabilitado após

            btnSetGameplay.setEnabled(true);  //habilita as escolhas após definir o parâmetro
            comboGameplay.setEnabled(true);

        }
        if (e.getSource() == btnSetGameplay) {
            String selecionado = (String) comboGameplay.getSelectedItem();
            switch (selecionado) {
                case "Primeira pessoa": jgUser.set_gameplay(0); break;
                case "Terceira pessoa": jgUser.set_gameplay(1); break;
                
            }
            log("Gameplay definida: " + selecionado);
           
            comboGameplay.setEnabled(false);   // Desabilitado após
            btnSetGameplay.setEnabled(false);  // Desabilitado após

            double soma;
            soma = jgUser.get_media();
            log("\nMédia final do jogo = " + soma);

            String resultado = bd.busca(soma);
            log("\nJOGOS PARECIDOS\n" + resultado);

        }

    }
    private void log(String mensagem) {
        jogos.append(mensagem + "\n");
        jogos.setCaretPosition(jogos.getDocument().getLength());
    }
    
}
