/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newstime.fronteira;

import javax.swing.JLabel;
import javax.swing.JTextField;
import newstime.controle.ControleCarrinho;
import newstime.entidade.Livro;

/**
 *
 * @author Usuario
 */
public class pn_Busca extends javax.swing.JPanel {
    private Livro li = new Livro();

    public Livro getLi() {
        return li;
    }

    public void setLi(Livro li) {
        this.li = li;
    }
    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getLab() {
        return lab;
    }

    public void setLab(JLabel lab) {
        this.lab = lab;
    }

    public JTextField getTxt_autor() {
        return txt_autor;
    }

    public void setTxt_autor(JTextField txt_autor) {
        this.txt_autor = txt_autor;
    }

    public JTextField getTxt_preco() {
        return txt_preco;
    }

    public void setTxt_preco(JTextField txt_preco) {
        this.txt_preco = txt_preco;
    }

    public JTextField getTxt_titulo() {
        return txt_titulo;
    }

    public void setTxt_titulo(JTextField txt_titulo) {
        this.txt_titulo = txt_titulo;
    }

    
    /**
     * Creates new form pn_Busca
     */
    public pn_Busca() {
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

        txt_titulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        txt_autor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_preco = new javax.swing.JTextField();
        btn_adicionar = new javax.swing.JButton();
        btn_detalhes = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_titulo.setText("jTextField1");

        jLabel1.setText("Titulo");

        lab.setText("Autor");

        txt_autor.setText("jTextField1");

        jLabel3.setText("Preço");

        txt_preco.setText("jTextField1");

        btn_adicionar.setText("Adicionar ao carrinho");
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });

        btn_detalhes.setText("Mais detalhes");
        btn_detalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detalhesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lab)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_preco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btn_adicionar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_detalhes)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lab)
                        .addComponent(jLabel3))
                    .addComponent(btn_adicionar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_detalhes))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_detalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detalhesActionPerformed
        MaisDetalhes detalhes = new MaisDetalhes();
        Home h = new Home();
        detalhes.setLiv(li);
        //detalhes
        detalhes.show();
    }//GEN-LAST:event_btn_detalhesActionPerformed

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
        ControleCarrinho controle = new ControleCarrinho();
        controle.adicionarItem(getLi().getIsbn(), "1");
    }//GEN-LAST:event_btn_adicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_detalhes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lab;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_preco;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
