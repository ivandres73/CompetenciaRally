package competencia;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Menu extends javax.swing.JFrame {
    
    Random x = new Random();
    boolean repeat = true;
    
    public void Revolver() {
        Global.caracteres = Global.juego.caracteres;
        Global.caraud = Global.juego.caraud;
        Global.cajita = Global.juego.cajita;
        Global.cara = Global.juego.cara;
    }
    
    public void Visible() {
        if(Global.juego==null){
            Global.juego = new Juego();
        }else{
            Global.juego.init(false);
        }
        Global.juego.setVisible(true);
        Global.menu.setVisible(false);
}

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\unitec.png");
        this.setIconImage(icon);
        Global.menu = this;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        AlAzar = new javax.swing.JButton();
        secuencia1 = new javax.swing.JButton();
        secencia2 = new javax.swing.JButton();
        secuencia3 = new javax.swing.JButton();
        secuencia4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(2055, 805));

        AlAzar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AlAzar.setText("Al Azar");
        AlAzar.setPreferredSize(new java.awt.Dimension(177, 31));
        AlAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlAzarActionPerformed(evt);
            }
        });

        secuencia1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        secuencia1.setText("}~`{;^?$@/|&#*'");
        secuencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secuencia1ActionPerformed(evt);
            }
        });

        secencia2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        secencia2.setText(">`&@;~*'\"<|?$\\^");
        secencia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secencia2ActionPerformed(evt);
            }
        });

        secuencia3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        secuencia3.setText(")&+!%|]^\"'~<.=[");
        secuencia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secuencia3ActionPerformed(evt);
            }
        });

        secuencia4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        secuencia4.setText("~|#-`$@?{<>'/\\\"");
        secuencia4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secuencia4ActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.setPreferredSize(new java.awt.Dimension(59, 31));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(secuencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(secencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(secuencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(secuencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(AlAzar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(secuencia1)
                .addGap(18, 18, 18)
                .addComponent(secencia2)
                .addGap(18, 18, 18)
                .addComponent(secuencia3)
                .addGap(18, 18, 18)
                .addComponent(secuencia4)
                .addGap(18, 18, 18)
                .addComponent(AlAzar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void secuencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secuencia1ActionPerformed
        char secuencia[] = {'}', '~', '`', '{', ';', '^', '?', '$', '@', '/', '|', '&', '#', '*', '\'', '!'};
        Global.current = new String(secuencia);
        Global.menu = this;
        Visible();
    }//GEN-LAST:event_secuencia1ActionPerformed

    private void secencia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secencia2ActionPerformed
        char secuencia[] = {'>', '`', '&', '@', ';', '~', '*', '\'', '"', '<', '|', '?', '$', '\\', '^', '-'};
            Global.current = new String(secuencia);
            Global.menu = this;
            Visible();
    }//GEN-LAST:event_secencia2ActionPerformed

    private void secuencia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secuencia3ActionPerformed
        char secuencia[] = {')', '&', '+', '!', '%', '|', ']', '^', '"', '\'', '~', '<', '.', '=', '[', ','};
        Global.current = new String(secuencia);
        Global.menu = this;
        Visible();
    }//GEN-LAST:event_secuencia3ActionPerformed

    private void secuencia4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secuencia4ActionPerformed
        char secuencia[] = {'~', '|', '#', '-', '`', '$', '@', '?', '{', '<', '>', '\'', '/', '\\', '"', '('};
        Global.current = new String(secuencia);
        Global.menu = this;
        Visible();
    }//GEN-LAST:event_secuencia4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AlAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlAzarActionPerformed
        Visible();
        Revolver();
        for(int i = 0; i < Global.caraud.length; i++){
            while(repeat){
                repeat = false;
                int rpos = x.nextInt(20);
                for(int p = 0; p < Global.caraud.length; p++){
                    if(Global.cara[rpos] == Global.caraud[p]){
                        repeat = true;
                    }
                }
                Global.caraud[i] = Global.cara[rpos];
            }
            repeat = true;
        }
        Global.current = new String(Global.caraud);
    }//GEN-LAST:event_AlAzarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AlAzar;
    public javax.swing.JButton jButton1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JButton secencia2;
    public javax.swing.JButton secuencia1;
    public javax.swing.JButton secuencia3;
    public javax.swing.JButton secuencia4;
    // End of variables declaration//GEN-END:variables
}
