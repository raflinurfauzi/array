/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author RAFLI NUR FAUZI P
 */
public class praktikum2 extends javax.swing.JFrame {

    /**
     * Creates new form praktikum2
     */
    public praktikum2() {
        initComponents();
        getJumlah();
        setJenis();
        panel.setVisible(false);
        jumlahbil.setVisible(true);
        bil3.setVisible(false);
        bil4.setVisible(false);
        b33.setVisible(false);
        b44.setVisible(false);
        bil1.setVisible(false);
        bil2.setVisible(false);
        b11.setVisible(false);
        b22.setVisible(false);
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
        jenis = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ket = new javax.swing.JLabel();
        bil1 = new javax.swing.JLabel();
        jumlah = new javax.swing.JLabel();
        bil3 = new javax.swing.JLabel();
        bil2 = new javax.swing.JLabel();
        bil4 = new javax.swing.JLabel();
        b11 = new javax.swing.JTextField();
        b22 = new javax.swing.JTextField();
        b44 = new javax.swing.JTextField();
        b33 = new javax.swing.JTextField();
        jumlahbil = new javax.swing.JComboBox<>();
        hasil = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("PROGRAM ARITMATIKA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 30, 120, 20);

        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "penjumlahan", "pengurangan", "pembagian", "perkalian", " " }));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });
        getContentPane().add(jenis);
        jenis.setBounds(140, 80, 200, 30);

        jLabel3.setText("Jenis Aritmatika");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 140, 30);

        jLabel2.setText("OPERASI");

        bil1.setText("Bilangan 1");

        jumlah.setText("Jumlah Bilangan");

        bil3.setText("Bilangan 3");

        bil2.setText("Bilangan 2");

        bil4.setText("Bilangan 4");

        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        jumlahbil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Penjumlahan", "Pengurangan", "Perkalian", "Pembagian" }));

        hitung.setText("HITUNG");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bil3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bil1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bil2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bil4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b11)
                    .addComponent(b22, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(b44, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(b33, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(jumlahbil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(ket, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ket, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahbil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bil1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bil2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bil3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bil4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(panel);
        panel.setBounds(20, 130, 330, 360);

        setBounds(0, 0, 387, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        // TODO add your handling code here:
        setJenis();}
    
    public void setJenis(){
        if(jenis.getSelectedItem().equals("penjumlahan")){
            jns = "penjumlahan";
            ket.setText("penjumlahan");
            panel.setVisible(true);
            jumlahbil.setEnabled(true);
        }
        else if(jenis.getSelectedItem().equals("pengurangan")){
            jns = "pengurangan";
            ket.setText("pengurangan");
            panel.setVisible(true);
            jumlahbil.setEnabled(true);
        }
        else if(jenis.getSelectedItem().equals("perkalian")){
            jns = "perkalian";
            ket.setText("perkalian");
            panel.setVisible(true);
          jumlahbil.setEnabled(true);
        }
        else if(jenis.getSelectedItem().equals("pembagian")){
            jns = "pembagian";
            ket.setText("pembagian");
            panel.setVisible(true);
            jumlahbil.setEnabled(true);
        }
        
  
    }//GEN-LAST:event_jenisActionPerformed

    private void milihbilanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milihbilanganActionPerformed
        // TODO add your handling code here:
        getJumlah();
    }
    public void getJumlah(){
        if(jumlahbil.getSelectedItem().equals("2")){
            bil3.setVisible(false);
            bil4.setVisible(false);
            b33.setVisible(false);
            b44.setVisible(false);
            bil1.setVisible(true);
            bil2.setVisible(true);
            b11.setVisible(true);
            b22.setVisible(true);
            jml = 2; 
                 
        } else if(milihbilangan.getSelectedItem().equals("3")){
            bil1.setVisible(true);
            bil2.setVisible(true);
            b11.setVisible(true);
            b22.setVisible(true);
            bil3.setVisible(true);
            bil4.setVisible(false);
            b33.setVisible(true);
            b44.setVisible(false);
            jml = 3; 
        } else if(milihbilangan.getSelectedItem().equals("4")){
            bil1.setVisible(true);
            bil2.setVisible(true);
            b11.setVisible(true);
            b22.setVisible(true);
            bil3.setVisible(true);
            bil4.setVisible(true);
            b33.setVisible(true);
            b44.setVisible(true);
            jml = 4; }
        
    }
      
        
    }//GEN-LAST:event_jenisActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b11ActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
     Double hsl = 0.0;
        Double a1, a2, a3, a4;
        a1 = Double.parseDouble(b11.getText().toString());
        a2 = Double.parseDouble(b22.getText().toString());
        a3 = Double.parseDouble(b33.getText().toString());
        a4 = Double.parseDouble(b44.getText().toString());
        
        if(jns.equals("penjumlahan")){
            if(jml == 2){
                hsl = a1 + a2;
                hasil.setText("" + a1 + "+" + a2 + "=" + hsl);
            }
            
            if(jml == 3){
                hsl = a1 + a2 + a3;
                hasil.setText("" + a1 + "+" + a2 + "+" + a3 + "=" + hsl);
            }
            if(jml == 4){
                hsl = a1 + a2 + a3 + a4;
                hasil.setText("" + a1 + " + " + a2 + " + " + a3 + " + " + a4 + " = " + hsl);
            }
        }
        else if(jns.equals("pengurangan")){
            if(jml == 2){
                hsl = a1 - a2;
                hasil.setText(" " + a1 + " - " + a2 + " = " + hsl);
            }
            if(jml == 3){
                hsl = a1 - a2 - a3;
                hasil.setText(" " + a1 + " - " + a2 + " - " + a3 + " = " + hsl);
            }
            if(jml == 4){
                hsl = a1 - a2 - a3 - a4;
                hasil.setText(" " + a1 + " - "  + a2 + " - " + a3 + " - " + a4 + " = " + hsl);
            }
        }
        else if(jns.equals("perkalian")){
            if(jml == 2){
                hsl = a1 * a2;
                hasil.setText(" " + a1 + " - " + a2 + " = " + hsl);
            }
            if(jml == 3){
                hsl = a1 * a2 * a3;
                hasil.setText(" " + a1 + " * " + a2 + " * " + a3 + " = " + hsl);
            }
            if(jml == 4){
                hsl = a1 * a2 * a3 * a4;
                hasil.setText(" " + a1 + " * " + a2 + " * " + a3 + " * " + a4 + " = " + hsl);
            }
        }
        else if(jns.equals("pembagian")){
            if(jml == 2){
                hsl = a1 / a2;
                hasil.setText(" " + a1 + " : " + a2 + " = " + hsl);
            }
            if(jml == 3){
                hsl = a1 / a2 / a3;
                hasil.setText(" " + a1 + " : " + a2 + " : " + a3 + " = " + hsl);
            }
            if(jml == 4){
                hsl = a1 / a2 / a3 / a4;
                hasil.setText(" " + a1 + " : " + a2 + " : " + a3 + " : " + a4 + " = " + hsl);
            }
        }
    }
    }//GEN-LAST:event_hitungActionPerformed

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
            java.util.logging.Logger.getLogger(praktikum2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(praktikum2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(praktikum2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(praktikum2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new praktikum2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b11;
    private javax.swing.JTextField b22;
    private javax.swing.JTextField b33;
    private javax.swing.JTextField b44;
    private javax.swing.JLabel bil1;
    private javax.swing.JLabel bil2;
    private javax.swing.JLabel bil3;
    private javax.swing.JLabel bil4;
    private javax.swing.JTextField hasil;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> jenis;
    private javax.swing.JLabel jumlah;
    private javax.swing.JComboBox<String> jumlahbil;
    private javax.swing.JLabel ket;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}}
