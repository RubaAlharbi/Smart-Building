package SB;

public class BookManagement extends javax.swing.JFrame {

    public BookManagement() {
        initComponents(); }

	private void removeButtonActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {                                                            
 new Cancellation().setVisible(true);       
 }                                                           

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
new TimeClasses().setVisible(true);          
    }  
	
    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
dispose(); 
}

public static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookManagement().setVisible(true);
            }
        });
    }  
	
    private javax.swing.JButton jBackButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton okButton;
    private javax.swing.JButton removeButtonActionPerformed;
}
