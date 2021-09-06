package SB;
import javax.swing.*;


public class ComBooking extends javax.swing.JFrame {

    public ComBooking() {
        initComponents();
    setComboBoxModel();} 
	
	private void jBookButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
String name = jName.getText().trim();
char ClassRoom= jClassName.getSelectedItem().toString().charAt(0);
int Time= Integer.parseInt(jTimeBox.getSelectedItem().toString());
if (name.isEmpty()) errorLabel.setText("** Please enter a name for your patron.");
else makeBooking(name,ClassRoom,Time); } 


 private void makeBooking(String name, char ClassRoom, int Time){
if (Welcome.getTime(Welcome.convertClassRoom(ClassRoom),Time).isReserved())
errorLabel.setText("**please choose another Time.");
else  {Welcome.setTime(new Time (ClassRoom,Time,true,name),Welcome.convertClassRoom(ClassRoom),Time);
JOptionPane.showMessageDialog(null,"The reservation for " +name+" in Class: " +ClassRoom+ " at "+Time+":00 is complete! \n See you soon ❤");
jName.setText(" ");
errorLabel.setText(" ");
setComboBoxModel();}}  
  
  
private void setComboBoxModel(){
jTimeBox.setModel(new javax.swing.DefaultComboBoxModel
        (new String[]{"8","10","13","15","17" }));  
jClassName.setModel(new javax.swing.DefaultComboBoxModel
(new String[]{"R","U","M","A","N","H"}));       }                                           

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
 dispose(); 
 new Booking().setVisible(true); }                                                                                

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
 dispose();     }                                            
                                    

    public static void main(String args[]) {
	ava.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComBooking().setVisible(true); }
        }); }
                
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton jBackButton;
    private javax.swing.JButton jBookButton;
    private javax.swing.JComboBox<String> jClassName;
    private javax.swing.JLabel jClassNameLabel;
    private javax.swing.JButton jCloseButton;
    private javax.swing.JLabel jHeader;
    private javax.swing.JTextField jName;
    private javax.swing.JLabel jNameLable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> jTimeBox;
    private javax.swing.JLabel jTimeLabel;                 
    }
