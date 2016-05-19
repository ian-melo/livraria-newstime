/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newstime.fronteira;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import newstime.controle.ControleBusca;
import newstime.entidade.Livro;
import newstime.excecao.BancoException;

/**
 *
 * @author lukin
 */
public class Home extends javax.swing.JFrame {
    Livro l = new Livro();
    CarrinhoCompras telaCarrinho = new CarrinhoCompras();
    CadastroUsuario telaCadUsu = new CadastroUsuario();
  
    public Livro getL() {
        return l;
    }

    public void setL(Livro l) {
        this.l = l;
    }
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_lojas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_pedidos = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        btn_cadastro = new javax.swing.JButton();
        btn_carrinho = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        cmb_criterios = new javax.swing.JComboBox<String>();
        txt_palChave = new javax.swing.JTextField();
        btn_ok = new javax.swing.JButton();
        btn_promocoes = new javax.swing.JButton();
        btn_maisvendidos = new javax.swing.JButton();
        cmb_livros = new javax.swing.JComboBox<String>();
        cmb_digitais = new javax.swing.JComboBox<String>();
        cmb_categoria = new javax.swing.JComboBox<String>();
        scroll_15 = new javax.swing.JScrollPane();
        pn_pai = new javax.swing.JPanel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newstime/fronteira/logo.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");

        btn_lojas.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        btn_lojas.setText("Nossas Lojas");
        btn_lojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lojasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        jLabel2.setText("Televendas (11) 4003-3390");

        btn_pedidos.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        btn_pedidos.setText("Meus Pedidos");

        btn_login.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_cadastro.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        btn_cadastro.setText("Cadastre-se");
        btn_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroActionPerformed(evt);
            }
        });

        btn_carrinho.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        btn_carrinho.setText("Meu Carrinho");
        btn_carrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carrinhoActionPerformed(evt);
            }
        });

        btn_sair.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        cmb_criterios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filtros", "Editora", "Título", "Autor", "ISBN" }));

        btn_ok.setText("OK");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        btn_promocoes.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        btn_promocoes.setText("Promoções do dia");

        btn_maisvendidos.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        btn_maisvendidos.setText("Livros mais vendidos");

        cmb_livros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Livros", "Lançamentos", "Pré-Vendas", "Mais Vendidas" }));

        cmb_digitais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Livros Digitais", "Lançamentos", "Pré-Vendas", "Mais Vendidos" }));

        cmb_categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Categorias", "ADMINISTRAÇÃO", "AGROPECUÁRIA", "ARTES", "ÁUDIO LIVRO", "AUTO AJUDA", "CIÊNCIAS BIOLÓGICAS", "CIÊNCIAS EXATAS", "CIÊNCIAS HUMANAS", "CONTABILIDADE", "IDIOMA", "DICIONÁRIO", "DIDÁTICO", "DIREITO", "ECONOMIA", "ENGENHARIA TECNOLÓGICA", "ESPORTE", "GASTRONOMIA", "GEOGRAFIA HISTÓRICA", "INFORMÁTICA", "LINGUÍSTICA", "LITERATURA ESTRANGEIRA", "LITERATURA INFANTIL", "LITERATURA NACIONAL", "MEDICINA", "RELIGIÃO", "TURISMO" }));
        cmb_categoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_categoriaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pn_paiLayout = new javax.swing.GroupLayout(pn_pai);
        pn_pai.setLayout(pn_paiLayout);
        pn_paiLayout.setHorizontalGroup(
            pn_paiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        pn_paiLayout.setVerticalGroup(
            pn_paiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        scroll_15.setViewportView(pn_pai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(cmb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_livros, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(cmb_digitais, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cmb_criterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_palChave, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_ok))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_lojas)
                                        .addComponent(btn_login, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_pedidos)
                                            .addGap(12, 12, 12))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btn_cadastro)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_carrinho)
                                        .addComponent(btn_sair))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_promocoes)
                        .addGap(18, 18, 18)
                        .addComponent(btn_maisvendidos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scroll_15, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_lojas)
                            .addComponent(btn_pedidos)
                            .addComponent(btn_carrinho))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cadastro)
                            .addComponent(btn_login)
                            .addComponent(btn_sair))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_criterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_palChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ok))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_promocoes)
                        .addComponent(btn_maisvendidos))
                    .addComponent(cmb_livros, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(cmb_digitais)
                    .addComponent(cmb_categoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll_15)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_categoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_categoriaItemStateChanged
        /*
        Categorias
        ADMINISTRAÇÃO
        AGROPECUÁRIA
        ARTES
        ÁUDIO LIVRO
        AUTO AJUDA
        CIÊNCIAS BIOLÓGICAS
        CIÊNCIAS EXATAS
        CIÊNCIAS HUMANAS
        CONTABILIDADE
        IDIOMA
        DICIONÁRIO
        DIDÁTICO
        DIREITO
        ECONOMIA
        ENGENHARIA TECNOLÓGICA
        ESPORTE
        GASTRONOMIA
        GEOGRAFIA HISTÓRICA
        INFORMÁTICA
        LINGUÍSTICA
        LITERATURA ESTRANGEIRA
        LITERATURA INFANTIL
        LITERATURA NACIONAL
        MEDICINA
        RELIGIÃO
        TURISMO
        */
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            pn_pai.removeAll();
            GridLayout gerente = new GridLayout(10, 1);//Mostra até 10 itens um em baixo do outro
            pn_pai.setLayout(gerente);

            ControleBusca controleBusca = new ControleBusca();
            ArrayList<Livro> resultBusca;
            String categoria;
            
            if(cmb_categoria.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(rootPane, "Selecione uma categoria");
                return;
            }else if(cmb_categoria.getSelectedIndex() == 1){
                categoria = "ADMINISTRACAO";
            }else if(cmb_categoria.getSelectedIndex() == 2){
                categoria = "AGROPECUARIA";
            }else if(cmb_categoria.getSelectedIndex() == 3){
                categoria = "ARTES";
            }else if(cmb_categoria.getSelectedIndex() == 4){
                categoria = "AUDIOLIVRO";
            }else if(cmb_categoria.getSelectedIndex() == 5){
                categoria = "AUTOAJUDA";
            }else if(cmb_categoria.getSelectedIndex() == 6){
                categoria = "CIENCIAS_BIO";
            }else if(cmb_categoria.getSelectedIndex() == 7){
                categoria = "CIENCIAS_EXA";
            }else if(cmb_categoria.getSelectedIndex() == 8){
                categoria = "CIENCIAS_HUM";
            }else if(cmb_categoria.getSelectedIndex() == 9){
                categoria = "CONTABILIDADE";
            }else if(cmb_categoria.getSelectedIndex() == 10){
                categoria = "IDIOMA";
            }else if(cmb_categoria.getSelectedIndex() == 11){
                categoria = "DICIONARIO";
            }else if(cmb_categoria.getSelectedIndex() == 12){
                categoria = "DIDATICO";
            }else if(cmb_categoria.getSelectedIndex() == 13){
                categoria = "DIREITO";
            }else if(cmb_categoria.getSelectedIndex() == 14){
                categoria = "ECONOMIA";
            }else if(cmb_categoria.getSelectedIndex() == 15){
                categoria = "ENG_TEC";
            }else if(cmb_categoria.getSelectedIndex() == 16){
                categoria = "ESPORTE";
            }else if(cmb_categoria.getSelectedIndex() == 17){
                categoria = "GASTRONOMIA";
            }else if(cmb_categoria.getSelectedIndex() == 18){
                categoria = "GEO_HIST";
            }else if(cmb_categoria.getSelectedIndex() == 19){
                categoria = "INFORMATICA";
            }else if(cmb_categoria.getSelectedIndex() == 20){
                categoria = "LINGUISTICA";
            }else if(cmb_categoria.getSelectedIndex() == 21){
                categoria = "LITER_ESTR";
            }else if(cmb_categoria.getSelectedIndex() == 22){
                categoria = "LITER_INFA";
            }else if(cmb_categoria.getSelectedIndex() == 23){
                categoria = "LITER_NACIO";
            }else if(cmb_categoria.getSelectedIndex() == 24){
                categoria = "MEDICINA";
            }else if(cmb_categoria.getSelectedIndex() == 25){
                categoria = "RELIGIAO";
            }else if(cmb_categoria.getSelectedIndex() == 26){
                categoria = "TURISMO";
            }else{
                JOptionPane.showMessageDialog(rootPane, "Erro ao buscar");
                return;
            }
            
            try {
                controleBusca.fazerBusca(categoria, 5);
            } catch (BancoException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
                return;
            }
            
            resultBusca = controleBusca.getResultadosBusca();
            
            for (Livro ver : resultBusca) {
                newstime.fronteira.pn_Busca p1 = new newstime.fronteira.pn_Busca();
                pn_pai.add(p1);
                p1.getTxt_titulo().setText(ver.getTitulo());
                p1.getTxt_autor().setText(ver.getAutor().getNome());
                p1.getTxt_preco().setText(String.valueOf(ver.getPrecoVenda()));
                p1.setLi(ver);
            }
            //System.out.println(l.getIsbn());
            //System.out.println(l.getMargemLucro());
            //Atualiza form...pequeno erro grafico
            pequenoBug();//Corrige
        }
    }//GEN-LAST:event_cmb_categoriaItemStateChanged

    private void btn_lojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lojasActionPerformed
        NossasLojas nossas = new NossasLojas();

        nossas.show();
    }//GEN-LAST:event_btn_lojasActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed

        pn_pai.removeAll();//Retira tudo do painel
        if ("".equals(txt_palChave.getText()) || " ".equals(txt_palChave.getText()) || "   ".equals(txt_palChave.getText()) ||cmb_criterios.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha filtros ou paravra chave");
        } else {
            GridLayout gerente = new GridLayout(10, 1);//Mostra até 10 itens um em baixo do outro
            pn_pai.setLayout(gerente);

            ControleBusca controleBusca = new ControleBusca();
            ArrayList<Livro> resultBusca;
            
            try {
                controleBusca.fazerBusca(txt_palChave.getText(), cmb_criterios.getSelectedIndex());
            } catch (BancoException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
                return;
            }
            
            resultBusca = controleBusca.getResultadosBusca();

            for (Livro ver : resultBusca) {
                newstime.fronteira.pn_Busca p1 = new newstime.fronteira.pn_Busca();
                pn_pai.add(p1);
                p1.getTxt_titulo().setText(ver.getTitulo());
                p1.getTxt_autor().setText(ver.getAutor().getNome());
                p1.getTxt_preco().setText(String.valueOf(ver.getPrecoVenda()));
                p1.setLi(ver);//envia objeto
            }
            //System.out.println(l.getIsbn());
            //System.out.println(l.getMargemLucro());

            //Atualiza form...pequeno erro grafico
            pequenoBug();//Corrige

        }
    }//GEN-LAST:event_btn_okActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        UsuarioCadastrado userCad = new UsuarioCadastrado();
        userCad.show();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_carrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carrinhoActionPerformed
        telaCarrinho.setVisible(true);
        telaCarrinho.preencherTabela();
    }//GEN-LAST:event_btn_carrinhoActionPerformed

    private void btn_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroActionPerformed
        telaCadUsu.setVisible(true);
    }//GEN-LAST:event_btn_cadastroActionPerformed
    private void pequenoBug(){
        int x = this.getHeight();
            int y = this.getWidth();
            this.setSize(y - 1, x - 1);
            this.setSize(y, x);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Metal look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastro;
    private javax.swing.JButton btn_carrinho;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_lojas;
    private javax.swing.JButton btn_maisvendidos;
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton btn_pedidos;
    private javax.swing.JButton btn_promocoes;
    private javax.swing.JButton btn_sair;
    private javax.swing.JComboBox<String> cmb_categoria;
    private javax.swing.JComboBox<String> cmb_criterios;
    private javax.swing.JComboBox<String> cmb_digitais;
    private javax.swing.JComboBox<String> cmb_livros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pn_pai;
    private javax.swing.JScrollPane scroll_15;
    private javax.swing.JTextField txt_palChave;
    // End of variables declaration//GEN-END:variables
}
