package firstgui;

import java.awt.Color;

public class UI extends javax.swing.JFrame {
    private boolean checkClicked=false;
    public UI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showMessage = new javax.swing.JLabel();
        clickBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My First GUI");
        setPreferredSize(new java.awt.Dimension(500, 500));

        showMessage.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        showMessage.setText("Hello Java");

        clickBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clickBtn.setText("CLICK ME");
        clickBtn.setToolTipText("You can click this button to switch On and Off");
        clickBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clickBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clickBtn)
                    .addComponent(showMessage))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showMessage)
                .addGap(38, 38, 38)
                .addComponent(clickBtn)
                .addContainerGap(391, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickBtnActionPerformed
        if(checkClicked){
            showMessage.setText("OFF");
            clickBtn.setBackground(Color.red);
            checkClicked=false;
        }
        else{
            showMessage.setText("ON");
            clickBtn.setBackground(new Color(172, 192, 224));
            checkClicked=true;
        }
            
    }//GEN-LAST:event_clickBtnActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clickBtn;
    private javax.swing.JLabel showMessage;
    // End of variables declaration//GEN-END:variables
}
