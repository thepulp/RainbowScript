/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaDePush;

/**
 *
 * @author fvarg
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
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

        btn_nuevo = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_abrir = new javax.swing.JButton();
        btn_reservadas = new javax.swing.JButton();
        btn_indentado = new javax.swing.JButton();
        btn_tokens = new javax.swing.JButton();
        btn_Compilar = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JLabel();
        Titulo_App = new javax.swing.JLabel();
        Titulo_App1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtp_Code = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaCompile = new javax.swing.JTextArea();
        Titulo_Consola = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_nuevo.setBackground(new java.awt.Color(0, 0, 0));
        btn_nuevo.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        btn_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Icon/icons8_code_file_48px.png"))); // NOI18N
        btn_nuevo.setText("Nuevo");
        btn_nuevo.setToolTipText("Nuevo documento");
        btn_nuevo.setBorderPainted(false);
        btn_nuevo.setContentAreaFilled(false);
        btn_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevo.setFocusPainted(false);
        btn_nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_nuevo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btn_guardar.setBackground(new java.awt.Color(0, 0, 0));
        btn_guardar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Icon/icons8_save_48px.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setToolTipText("Guardar documento");
        btn_guardar.setBorderPainted(false);
        btn_guardar.setContentAreaFilled(false);
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.setFocusPainted(false);
        btn_guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guardar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        btn_abrir.setBackground(new java.awt.Color(0, 0, 0));
        btn_abrir.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        btn_abrir.setForeground(new java.awt.Color(255, 255, 255));
        btn_abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Icon/icons8_opened_folder_48px.png"))); // NOI18N
        btn_abrir.setText("Abrir");
        btn_abrir.setToolTipText("Abrir Documento");
        btn_abrir.setBorderPainted(false);
        btn_abrir.setContentAreaFilled(false);
        btn_abrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_abrir.setFocusPainted(false);
        btn_abrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_abrir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(btn_abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        btn_reservadas.setBackground(new java.awt.Color(0, 0, 0));
        btn_reservadas.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        btn_reservadas.setForeground(new java.awt.Color(255, 255, 255));
        btn_reservadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Icon/icons8-text-color-48.png"))); // NOI18N
        btn_reservadas.setText("Reservadas");
        btn_reservadas.setToolTipText("Palabras Reservadas");
        btn_reservadas.setBorderPainted(false);
        btn_reservadas.setContentAreaFilled(false);
        btn_reservadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reservadas.setFocusPainted(false);
        btn_reservadas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_reservadas.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(btn_reservadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        btn_indentado.setBackground(new java.awt.Color(0, 0, 0));
        btn_indentado.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        btn_indentado.setForeground(new java.awt.Color(255, 255, 255));
        btn_indentado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Icon/icons8-text-cursor-48.png"))); // NOI18N
        btn_indentado.setText("Indentar");
        btn_indentado.setToolTipText("Indentar Documento");
        btn_indentado.setBorderPainted(false);
        btn_indentado.setContentAreaFilled(false);
        btn_indentado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_indentado.setFocusPainted(false);
        btn_indentado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_indentado.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(btn_indentado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        btn_tokens.setBackground(new java.awt.Color(0, 0, 0));
        btn_tokens.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        btn_tokens.setForeground(new java.awt.Color(255, 255, 255));
        btn_tokens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Icon/icons8-index-48.png"))); // NOI18N
        btn_tokens.setText("Tokens");
        btn_tokens.setToolTipText("Tokens");
        btn_tokens.setBorderPainted(false);
        btn_tokens.setContentAreaFilled(false);
        btn_tokens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tokens.setFocusPainted(false);
        btn_tokens.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_tokens.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(btn_tokens, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        btn_Compilar.setBackground(new java.awt.Color(0, 0, 0));
        btn_Compilar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        btn_Compilar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Compilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Icon/icons8_code_48px.png"))); // NOI18N
        btn_Compilar.setText("Compilar");
        btn_Compilar.setToolTipText("Compilar Codigo");
        btn_Compilar.setBorderPainted(false);
        btn_Compilar.setContentAreaFilled(false);
        btn_Compilar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Compilar.setFocusPainted(false);
        btn_Compilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Compilar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_Compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CompilarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Compilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        Btn_Salir.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 58)); // NOI18N
        Btn_Salir.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_Salir.setText("x");
        Btn_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_SalirMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 60, -1));

        Titulo_App.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        Titulo_App.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_App.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_App.setText("RainbowScript");
        getContentPane().add(Titulo_App, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 330, -1));

        Titulo_App1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        Titulo_App1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_App1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_App1.setText("Compilador Equipo 4");
        getContentPane().add(Titulo_App1, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 60, 320, -1));

        jtp_Code.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        jtp_Code.setToolTipText("");
        jScrollPane3.setViewportView(jtp_Code);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 530, 620));

        jtaCompile.setEditable(false);
        jtaCompile.setColumns(20);
        jtaCompile.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        jtaCompile.setRows(5);
        jtaCompile.setToolTipText("");
        jScrollPane2.setViewportView(jtaCompile);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 470, 160));

        Titulo_Consola.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        Titulo_Consola.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_Consola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Consola.setText("Consola:");
        getContentPane().add(Titulo_Consola, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 456, 470, 20));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Icon/RainbowScript.png"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 290, 140));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Icon/fondo1.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CompilarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CompilarActionPerformed

    private void Btn_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_SalirMouseClicked
        dispose();
    }//GEN-LAST:event_Btn_SalirMouseClicked

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_Salir;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Titulo_App;
    private javax.swing.JLabel Titulo_App1;
    private javax.swing.JLabel Titulo_Consola;
    private javax.swing.JButton btn_Compilar;
    private javax.swing.JButton btn_abrir;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_indentado;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_reservadas;
    private javax.swing.JButton btn_tokens;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jtaCompile;
    private javax.swing.JTextPane jtp_Code;
    // End of variables declaration//GEN-END:variables
}