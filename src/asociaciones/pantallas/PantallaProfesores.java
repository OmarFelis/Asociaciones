/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociaciones.pantallas;

import asociaciones.entidades.Curso;
import asociaciones.entidades.Profesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omar_quiero_dormir_pipipi
 */
public class PantallaProfesores extends javax.swing.JFrame {
    
    private Curso curso;

    /**
     * Creates new form PantallaProfesores
     */
    public PantallaProfesores(Curso curso) {
        initComponents();
        this.curso = curso;
    }
    
    public List<Profesor> buscar(String criterio) {
        return new ArrayList<>();
    }
    
    public void agregar(Profesor profesor) {
        Profesor[] profesores = curso.getProfesores();
        int tamaño = profesores.length;
        for (int i = 0; i < tamaño; i++) {
            if(profesores[i]!=null && 
                    !profesores[i].getNombre().isEmpty()){
                profesores[i]= profesor;
                return;
            }
            
            if(profesores[i]==null){
                profesores[i]=profesor;
                return;
            }
        }
    }
    
    public void eliminar(Profesor profesor) {
        //TODO:implementar
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnAgregar_Pantalla_Prof = new javax.swing.JButton();
        jBtnCancelar_Pantalla_Prof = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jBtnSalir_Pantalla_Prof = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnAgregar_Pantalla_Prof.setBackground(new java.awt.Color(0, 0, 255));
        jBtnAgregar_Pantalla_Prof.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAgregar_Pantalla_Prof.setText("Agregar");
        jBtnAgregar_Pantalla_Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregar_Pantalla_ProfActionPerformed(evt);
            }
        });

        jBtnCancelar_Pantalla_Prof.setBackground(new java.awt.Color(255, 51, 0));
        jBtnCancelar_Pantalla_Prof.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCancelar_Pantalla_Prof.setText("Cancelar");
        jBtnCancelar_Pantalla_Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelar_Pantalla_ProfActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jBtnSalir_Pantalla_Prof.setBackground(new java.awt.Color(204, 153, 0));
        jBtnSalir_Pantalla_Prof.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSalir_Pantalla_Prof.setText("Salir");
        jBtnSalir_Pantalla_Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalir_Pantalla_ProfActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 153, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Buscar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Profesores de: [ ]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnSalir_Pantalla_Prof)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnAgregar_Pantalla_Prof)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancelar_Pantalla_Prof)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAgregar_Pantalla_Prof)
                    .addComponent(jBtnCancelar_Pantalla_Prof)
                    .addComponent(jBtnSalir_Pantalla_Prof))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAgregar_Pantalla_ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregar_Pantalla_ProfActionPerformed
        
        Profesor profesor = new Profesor();
        PantallaEditarProfesor pantallaEditProfe = new PantallaEditarProfesor(profesor);
        pantallaEditProfe.setVisible(true);
        
        
    }//GEN-LAST:event_jBtnAgregar_Pantalla_ProfActionPerformed

    private void jBtnCancelar_Pantalla_ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_Pantalla_ProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCancelar_Pantalla_ProfActionPerformed

    private void jBtnSalir_Pantalla_ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalir_Pantalla_ProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSalir_Pantalla_ProfActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Curso curso = new Curso("",0,"");
                new PantallaProfesores(curso).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar_Pantalla_Prof;
    private javax.swing.JButton jBtnCancelar_Pantalla_Prof;
    private javax.swing.JButton jBtnSalir_Pantalla_Prof;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
