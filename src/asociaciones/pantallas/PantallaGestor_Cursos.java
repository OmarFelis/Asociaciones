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
public class PantallaGestor_Cursos extends javax.swing.JFrame {
    private Curso curso;
 
    
    /**
     * Creates new form PantallaGestor_Cursos
     */
    public PantallaGestor_Cursos(Curso curso) {
        initComponents();
        this.curso = curso;
        
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jBtnVerProfesorCursos = new javax.swing.JButton();
        jBtnVerEstudiantesCursos = new javax.swing.JButton();
        jBtnAgregarGestor = new javax.swing.JButton();
        jBtnEliminarGestor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Gestor de Cursos");
        jLabel1.setMaximumSize(new java.awt.Dimension(90, 14));
        jLabel1.setMinimumSize(new java.awt.Dimension(90, 14));

        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jBtnVerProfesorCursos.setBackground(new java.awt.Color(0, 51, 255));
        jBtnVerProfesorCursos.setForeground(new java.awt.Color(255, 255, 255));
        jBtnVerProfesorCursos.setText("Profesor");
        jBtnVerProfesorCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerProfesorCursosActionPerformed(evt);
            }
        });

        jBtnVerEstudiantesCursos.setBackground(new java.awt.Color(0, 102, 255));
        jBtnVerEstudiantesCursos.setForeground(new java.awt.Color(255, 255, 255));
        jBtnVerEstudiantesCursos.setText("Estudiantes");
        jBtnVerEstudiantesCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerEstudiantesCursosActionPerformed(evt);
            }
        });

        jBtnAgregarGestor.setBackground(new java.awt.Color(51, 255, 0));
        jBtnAgregarGestor.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAgregarGestor.setText("Agregar");

        jBtnEliminarGestor.setBackground(new java.awt.Color(255, 0, 0));
        jBtnEliminarGestor.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEliminarGestor.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jBtnVerProfesorCursos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnVerEstudiantesCursos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jBtnAgregarGestor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnEliminarGestor)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnVerEstudiantesCursos)
                    .addComponent(jBtnAgregarGestor)
                    .addComponent(jBtnEliminarGestor)
                    .addComponent(jBtnVerProfesorCursos))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBtnVerProfesorCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerProfesorCursosActionPerformed
        
        PantallaProfesores pantallaProfesores = new PantallaProfesores(curso);
        PantallaProfesores.setVisible(true);
               
     
    }//GEN-LAST:event_jBtnVerProfesorCursosActionPerformed

    private void jBtnVerEstudiantesCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerEstudiantesCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnVerEstudiantesCursosActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaGestor_Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaGestor_Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaGestor_Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaGestor_Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Curso curso = new Curso("",0,"");
                new PantallaGestor_Cursos(curso).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregarGestor;
    private javax.swing.JButton jBtnEliminarGestor;
    private javax.swing.JButton jBtnVerEstudiantesCursos;
    private javax.swing.JButton jBtnVerProfesorCursos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
