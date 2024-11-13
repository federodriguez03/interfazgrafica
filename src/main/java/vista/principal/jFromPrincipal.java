/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.principal;

import vista.turno.JFormCosnultaTurnoOperacion;

/**
 *
 * @author Alumno
 */
public class jFromPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jFromPrincipal
     */
    public jFromPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMItemConsulTurnoOperacion = new javax.swing.JMenuItem();
        jMItemConsultaConsu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMitemAltaTurno = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Consultas");

        jMItemConsulTurnoOperacion.setText("Turnos de Operacion");
        jMItemConsulTurnoOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemConsulTurnoOperacionActionPerformed(evt);
            }
        });
        jMenu1.add(jMItemConsulTurnoOperacion);

        jMItemConsultaConsu.setText("Consulta General");
        jMenu1.add(jMItemConsultaConsu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Alta");

        jMitemAltaTurno.setText("Turno");
        jMenu2.add(jMitemAltaTurno);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMItemConsulTurnoOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemConsulTurnoOperacionActionPerformed
        openConsultaTurnoForm();
    }//GEN-LAST:event_jMItemConsulTurnoOperacionActionPerformed

    
    private void openConsultaTurnoForm() {
    // Create an instance of the consulta form
    JFormCosnultaTurnoOperacion consultaTurnoForm = new JFormCosnultaTurnoOperacion();

    // Set the form to be visible
    consultaTurnoForm.setVisible(true);

    // Optional: Set the form location or other properties if needed
    consultaTurnoForm.setLocationRelativeTo(null); // Center on screen
    }
    
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
            java.util.logging.Logger.getLogger(jFromPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFromPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFromPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFromPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFromPrincipal().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMItemConsulTurnoOperacion;
    private javax.swing.JMenuItem jMItemConsultaConsu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMitemAltaTurno;
    // End of variables declaration//GEN-END:variables
}
