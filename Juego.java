package competencia;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JOptionPane;

public class Juego extends javax.swing.JFrame {
    
    char cara[] = new char[] {'~', '{', '#', '@', '*', '?', '>', '<', '&', '\\', '}', ';', '"', '\'', '^', '/', '|', '-', '`', '$'};
    char caraud[] = new char[] {};
    Random x = new Random();
    
    public Juego() {
        initComponents();
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\logo.png");
        this.setIconImage(icon);
        caraud = Global.current.toCharArray();
        caracteres.setText(Global.current);
        Aceptar.setVisible(false);
        Secuencias.setVisible(false);
        cajita.setVisible(false);
        caracteres.setVisible(false);
        terminos.setEditable(false);
        fondo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cajita = new javax.swing.JTextField();
        caracteres = new javax.swing.JLabel();
        Secuencias = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        Sistemas = new javax.swing.JLabel();
        condiciones = new javax.swing.JCheckBox();
        scrollPane = new javax.swing.JScrollPane();
        terminos = new javax.swing.JTextArea();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 232, 231));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajita.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cajita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajitaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajitaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajitaKeyTyped(evt);
            }
        });
        jPanel1.add(cajita, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 240, -1));

        caracteres.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        caracteres.setText("bobadas");
        caracteres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(caracteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 40, 250, 40));

        Secuencias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Secuencias.setText("Secuencias");
        Secuencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecuenciasActionPerformed(evt);
            }
        });
        jPanel1.add(Secuencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 130, -1));

        Aceptar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        jPanel1.add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 120, -1));

        Sistemas.setFont(new java.awt.Font("Lucida Console", 0, 13)); // NOI18N
        Sistemas.setText("Sistemas ©");
        jPanel1.add(Sistemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 100, -1));

        condiciones.setBackground(new java.awt.Color(232, 232, 231));
        condiciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        condiciones.setText("Acepto los Terminos y Condiciones");
        condiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condicionesActionPerformed(evt);
            }
        });
        jPanel1.add(condiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        terminos.setColumns(20);
        terminos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        terminos.setRows(5);
        terminos.setText("Please read these Terms and Conditions carefully before using this app operated by Systems Engineerings.\nYour access to and use of the Service is conditioned on your acceptance of and compliance with these Terms. \nThese Terms apply to all visitors,\nusers and others who access or use the Service.\nBy accessing or using the Service you agree to be bound by these Terms. If you disagree with any part of the terms\nthen you may not access the Service. This Terms and Conditions was created with the help of TermsFeed.\nLinks To Other Web Sites\nOur Service may contain links to third-party web sites or services that are not owned or controlled by Systems Engineerings.\nSystems Engineering has no control over, and assumes no responsibility for, the content, privacy policies, or practices of any\nthird party web sites or services. You further acknowledge and agree that Systems Engineering shall not be responsible or liable,\ndirectly or indirectly, for any damage or loss caused or alleged to be caused by or in connection with use of or reliance on any such\ncontent, goods or services available on or through any such web sites or services.\nWe strongly advise you to read the terms and conditions and privacy policies of any third-party web sites or services that you visit.\nTermination\nWe may terminate or suspend access to our Service immediately, without prior notice or liability, for any reason whatsoever,\nincluding without limitation if you breach the Terms.\nAll provisions of the Terms which by their nature should survive termination shall survive termination, including, without limitation,\nownership provisions, warranty disclaimers, indemnity and limitations of liability.\nGoverning Law\nThese Terms shall be governed and construed in accordance with the laws of Honduras, without regard to its conflict of law provisions.\nOur failure to enforce any right or provision of these Terms will not be considered a waiver of those rights. If any provision of these Terms\nis held to be invalid or unenforceable by a court, the remaining provisions of these Terms will remain in effect. These Terms constitute the entire\nagreement between us regarding our Service, and supersede and replace any prior agreements we might have between us regarding the Service.\nChanges\nWe reserve the right, at our sole discretion, to modify or replace these Terms at any time. If a revision is material we will try to provide at least 30 days notice prior\nto any new terms taking effect. What constitutes a material change will be determined at our sole discretion.\nBy continuing to access or use our Service after those revisions become effective, you agree to be bound by the revised terms. If you do not agree to the new terms,\nplease stop using the Service.\nContact Us\nIf you have any questions about these Terms, please contact us.\n");
        scrollPane.setViewportView(terminos);

        jPanel1.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 510, 282));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/puzzle.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void condicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condicionesActionPerformed
        init(true);
    }//GEN-LAST:event_condicionesActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if (cajita.getText().length() == 15 ) {
            JOptionPane.showMessageDialog(rootPane, "Has ganado ! !");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Todavia no has ganado...");
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void SecuenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecuenciasActionPerformed
        Global.menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SecuenciasActionPerformed

    private void cajitaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajitaKeyTyped

    }//GEN-LAST:event_cajitaKeyTyped

    private void cajitaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajitaKeyReleased
        String ingr = cajita.getText();
        caracteres.setText(new String(caraud));
        for (int i = 0; i < ingr.length(); i++) {
            if (ingr.charAt(i) != caraud[i]) {
                break;
            } else {
                caracteres.setText(new String(caraud).substring(i+1));
            }
        }
    }//GEN-LAST:event_cajitaKeyReleased

    private void cajitaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajitaKeyPressed
        int a = 0;
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            for (int i = 0; i < cajita.getText().length(); i++) {
                if (cajita.getText().charAt(i) == caraud[i]) {
                    a++;
                }
            }
            if (a == 15) {
                JOptionPane.showMessageDialog(rootPane, "Has Ganado ! !");
                caracteres.setText("Enhorabuena");
            }
        }
    }//GEN-LAST:event_cajitaKeyPressed

    public void init(boolean t){
        caracteres.setText(Global.current);
        Aceptar.setVisible(t);
        Secuencias.setVisible(t);
        cajita.setVisible(t);
        caracteres.setVisible(t);
        fondo.setVisible(t);
        terminos.setVisible(!t);
        scrollPane.setVisible(!t);
        condiciones.setVisible(!t);
        condiciones.setSelected(t);
        fondo.setVisible(t);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Aceptar;
    public javax.swing.JButton Secuencias;
    public javax.swing.JLabel Sistemas;
    public javax.swing.JTextField cajita;
    public javax.swing.JLabel caracteres;
    public javax.swing.JCheckBox condiciones;
    public javax.swing.JLabel fondo;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane scrollPane;
    public javax.swing.JTextArea terminos;
    // End of variables declaration//GEN-END:variables
}
