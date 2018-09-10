package gui;

import classes.MassaPizza;
import classes.PluginController;
import interfaces.IComponent;
import interfaces.PizzaDecorator;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TelaEscolherIngredientes extends javax.swing.JFrame {

    private final PluginController plugin;
    private final DefaultListModel model;
    private final DefaultListModel model2;
            
    public TelaEscolherIngredientes() {
        plugin  = new PluginController();
        model   = new DefaultListModel();
        model2  = new DefaultListModel();
        initComponents();
        fillListPizzas();
    }
     
    public final void fillListPizzas(){
        plugin.initialize();
        ArrayList<String> pluginsCarregados = plugin.getLoadedPlugins();
        this.jlIngredientes.setModel(model);
        for (int i = 0; i < pluginsCarregados.size(); i++) {
              model.addElement(pluginsCarregados.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlIngredientes = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jlIngredEscolhidos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonEnviar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonUp = new javax.swing.JButton();
        jButtonDown = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jlIngredientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jlIngredientes);

        jScrollPane4.setViewportView(jlIngredEscolhidos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ITENS DISPONIVEIS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ITENS ESCOLHIDOS");

        jButtonEnviar.setBackground(new java.awt.Color(153, 153, 255));
        jButtonEnviar.setText(">");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        jButtonRemover.setBackground(new java.awt.Color(153, 153, 255));
        jButtonRemover.setText("<");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jButtonUp.setBackground(new java.awt.Color(153, 153, 255));
        jButtonUp.setText("^");
        jButtonUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpActionPerformed(evt);
            }
        });

        jButtonDown.setBackground(new java.awt.Color(153, 153, 255));
        jButtonDown.setText("v");
        jButtonDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDownActionPerformed(evt);
            }
        });

        jButtonConfirmar.setBackground(new java.awt.Color(153, 153, 255));
        jButtonConfirmar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonConfirmar.setText("CONFIRMAR PEDIDO");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonEnviar)
                                    .addComponent(jButtonRemover)))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonDown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(jButtonEnviar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonRemover))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jButtonUp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonDown)))
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConfirmar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed

        IComponent ultimoDaCadeia = new MassaPizza();
        URL[] jars = new URL[jlIngredEscolhidos.getModel().getSize()];
        for (int i = 0; i < jlIngredEscolhidos.getModel().getSize(); i++) {
            try {
                jars[i] = new File("ingredientes/" + jlIngredEscolhidos.getModel().getElementAt(i)+".jar").toURL();
            } catch (MalformedURLException ex) {
                Logger.getLogger(TelaEscolherIngredientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        URLClassLoader ulc = new URLClassLoader(jars);
        for (int i = 0; i < jlIngredEscolhidos.getModel().getSize(); i++) {
            String nomeDoDecorator = jlIngredEscolhidos.getModel().getElementAt(i);
            PizzaDecorator decorator = null;
            try {
                decorator = (PizzaDecorator) Class.forName(nomeDoDecorator.toLowerCase() + "." + nomeDoDecorator, true, ulc).newInstance();
                decorator.setDecorated(ultimoDaCadeia);
                ultimoDaCadeia = decorator;
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
                Logger.getLogger(TelaEscolherIngredientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ultimoDaCadeia.fazerPizza();
        JOptionPane.showMessageDialog(null, "Pedido confirmado!");
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDownActionPerformed
        ArrayList<Object> temp = new ArrayList<>();
        int indice = jlIngredEscolhidos.getSelectedIndex();
        if (indice != jlIngredEscolhidos.getModel().getSize() - 1) {//posição atual
            for (int i = 0; i < jlIngredEscolhidos.getModel().getSize(); i++) {
                temp.add(jlIngredEscolhidos.getModel().getElementAt(i));
            }
            Collections.swap(temp, jlIngredEscolhidos.getSelectedIndex(), jlIngredEscolhidos.getSelectedIndex() + 1);
            model2.removeAllElements();
            for (int i = 0; i < temp.size(); i++) {
                model2.addElement(temp.get(i));
            }
            this.jlIngredEscolhidos.setModel(model2);
            this.jlIngredEscolhidos.setSelectedIndex(indice+1);
        }
    }//GEN-LAST:event_jButtonDownActionPerformed

    private void jButtonUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpActionPerformed
        ArrayList<Object> temp = new ArrayList<>();
        int indice = jlIngredEscolhidos.getSelectedIndex();
        if (indice != 0) {
            for (int i = 0; i < jlIngredEscolhidos.getModel().getSize(); i++) {
                temp.add(jlIngredEscolhidos.getModel().getElementAt(i));
            }
            Collections.swap(temp, jlIngredEscolhidos.getSelectedIndex(), jlIngredEscolhidos.getSelectedIndex() - 1);
            model2.removeAllElements();
            for (int i = 0; i < temp.size(); i++) {
                model2.addElement(temp.get(i));
            }
            this.jlIngredEscolhidos.setModel(model2);
            this.jlIngredEscolhidos.setSelectedIndex(indice-1);
        }
    }//GEN-LAST:event_jButtonUpActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        model2.removeElement(jlIngredEscolhidos.getSelectedValue());
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        this.jlIngredEscolhidos.setModel(model2);
        model2.addElement(jlIngredientes.getSelectedValue());
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEscolherIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEscolherIngredientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonDown;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> jlIngredEscolhidos;
    private javax.swing.JList<String> jlIngredientes;
    // End of variables declaration//GEN-END:variables
}
