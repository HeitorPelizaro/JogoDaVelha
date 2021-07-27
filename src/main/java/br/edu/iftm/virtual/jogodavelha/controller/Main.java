package br.edu.iftm.virtual.jogodavelha.controller;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {


    private int jogador;
    private int jVelha[][];

    public Main() {
        initComponents();
        inicializarVariaveis();
    }

    public void inicializarVariaveis(){
        jVelha = new int[3][3];
        for(int i=0;i<jVelha.length;i++){
            for(int j=0;j<jVelha.length;j++){
                jVelha[i][j] = -1;
            }
        }

        jogador = 0;

        b00.setText("");
        b01.setText("");
        b02.setText("");
        b10.setText("");
        b11.setText("");
        b12.setText("");
        b20.setText("");
        b21.setText("");
        b22.setText("");
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        b00 = new javax.swing.JButton();
        b01 = new javax.swing.JButton();
        b02 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");

        b00.setFont(new java.awt.Font("Tahoma", 0, 24));
        b00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b00ActionPerformed(evt);
            }
        });

        b01.setFont(new java.awt.Font("Tahoma", 0, 24));
        b01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b01ActionPerformed(evt);
            }
        });

        b02.setFont(new java.awt.Font("Tahoma", 0, 24));
        b02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b02ActionPerformed(evt);
            }
        });

        b10.setFont(new java.awt.Font("Tahoma", 0, 24));
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b11.setFont(new java.awt.Font("Tahoma", 0, 24));
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setFont(new java.awt.Font("Tahoma", 0, 24));
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b20.setFont(new java.awt.Font("Tahoma", 0, 24));
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });

        b21.setFont(new java.awt.Font("Tahoma", 0, 24));
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });

        b22.setFont(new java.awt.Font("Tahoma", 0, 24));
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });

        jMenu1.setText("Jogo");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Novo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    public boolean validar(int x, int y){
        if(jVelha[x][y] == -1){
            return true;
        }

        return false;
    }

    public void trocarJogador(){
        if(jogador == 0){
            jogador = 1;
        }else{
            jogador = 0;
        }
    }


    public int verificarGanhador(){

        for (int[] ints : jVelha) {
            if (ints[0] == ints[1] && ints[0] == ints[2]) {
                if (ints[0] == 0 || ints[0] == 1) {
                    return ints[0];
                }
            }
        }


        for(int i=0;i<jVelha.length;i++){
            if(jVelha[0][i] == jVelha[1][i] && jVelha[0][i] == jVelha[2][i]){
                if(jVelha[0][i] == 0 || jVelha[0][i] == 1){
                    return jVelha[0][i];
                }
            }
        }


        if(jVelha[0][0] == jVelha[1][1] && jVelha[0][0] == jVelha[2][2]){
            if(jVelha[0][0] == 0 || jVelha[0][0] == 1){
                return jVelha[0][0];
            }
        }
        if(jVelha[0][2] == jVelha[1][1] && jVelha[0][2] == jVelha[2][0]){
            if(jVelha[0][2] == 0 || jVelha[0][2] == 1){
                return jVelha[0][2];
            }
        }


        boolean fimdeJogo = true;
        for(int i=0;i<jVelha.length;i++){
            for(int j=0;j<jVelha.length;j++){
                if(jVelha[i][j] == -1){
                    fimdeJogo = false;
                    break;
                }
            }
        }
        if(fimdeJogo){
            return 2;
        }

        return -1;
    }

    public void exibirGanhador(int ganhador){
        JOptionPane.showMessageDialog(this, (ganhador == 0?"Ganhador é a O": "Ganhador é o X"), "Ganhador", JOptionPane.INFORMATION_MESSAGE);
        inicializarVariaveis();
    }

    public void exibirFimdeJogo(){
        JOptionPane.showMessageDialog(this, "Ninguém ganhou.", "Ganhador", JOptionPane.INFORMATION_MESSAGE);
        inicializarVariaveis();
    }

    public void marcarJogada(int x, int y, JButton bt){
        int ganhador;

        jVelha[x][y] = jogador;
        bt.setText((jogador == 0? "O":"X"));
        ganhador = verificarGanhador();

        if(ganhador == -1){
            trocarJogador();
        }else if(ganhador == 0 || ganhador == 1){
            exibirGanhador(ganhador);
        }else{
            exibirFimdeJogo();
        }
    }

    private void b00ActionPerformed(java.awt.event.ActionEvent evt) {
        int x = 0;
        int y = 0;
        if(validar(x, y)){
            marcarJogada(x, y, (JButton)evt.getSource());
        }
    }

    private void b01ActionPerformed(java.awt.event.ActionEvent evt) {
        int x = 0;
        int y = 1;
        if(validar(x, y)){
            marcarJogada(x, y, (JButton)evt.getSource());
        }
    }

    private void b02ActionPerformed(java.awt.event.ActionEvent evt) {
        int x = 0;
        int y = 2;
        if(validar(x, y)){
            marcarJogada(x, y, (JButton)evt.getSource());
        }
    }

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {
        int x = 1;
        int y = 0;
        if(validar(x, y)){
            marcarJogada(x, y, (JButton)evt.getSource());
        }
    }

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {
        int x = 1;
        int y = 1;
        if(validar(x, y)){
            marcarJogada(x, y, (JButton)evt.getSource());
        }
    }

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {
        int x = 1;
        int y = 2;
        if(validar(x, y)){
            marcarJogada(x, y, (JButton)evt.getSource());
        }
    }

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {
        int x = 2;
        int y = 0;
        if(validar(x, y)){
            marcarJogada(x, y, (JButton)evt.getSource());
        }
    }

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {
        int x = 2;
        int y = 1;
        if(validar(x, y)){
            marcarJogada(x, y, (JButton)evt.getSource());
        }
    }

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {
        int x = 2;
        int y = 2;
        if(validar(x, y)){
            marcarJogada(x, y, (JButton)evt.getSource());
        }
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        inicializarVariaveis();
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Sobre().setVisible(true);
            }
        });
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private javax.swing.JButton b00;
    private javax.swing.JButton b01;
    private javax.swing.JButton b02;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;

}
