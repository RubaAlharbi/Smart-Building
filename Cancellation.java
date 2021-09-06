package SB;

import static SB.Welcome.ClASSROOMS;
import javax.swing.JOptionPane;

public class Cancellation extends javax.swing.JFrame {

    public Cancellation() {
        initComponents();
        initreservationsComboBox(); }

     private void  initreservationsComboBox(){
		String outputLine;
		for(int i=0; i<Welcome.ClASSROOMS.length; i++)
			for(int j=0; j<Welcome.NO_OF_SEATS_PER_ClASSROOM;j++)
				if(Welcome.getTime(i,j).isReserved())
                { 
    outputLine="["+ Welcome.getTime(i,j).getClassRoom()+Welcome.getTime(i,j).getMin()+"]"+Welcome.getTime(i,j).getName()+" ";reservationsComboBox.addItem(outputLine);}
	if(reservationsComboBox.getItemCount()==0) jLabel3.setText("**Empty list..");}
	

	 private void jBackButoonActionPerformed(java.awt.event.ActionEvent evt) {                                            
dispose(); }                                           

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
int answer=JOptionPane.showConfirmDialog(null, " Are you sure you want to delete the following reservation:\n\t"+reservationsComboBox.getSelectedItem()+"?","Confirm Delete", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
	if(answer==1);
	else{
		if(reservationsComboBox.getSelectedItem()==null)jLabel3.setText("**Empty list>>");
		else{ char ClassRoom=reservationsComboBox.getSelectedItem().toString().charAt(1);
		int index=reservationsComboBox.getSelectedItem().toString().indexOf("]");
		int Time=Integer.parseInt(reservationsComboBox.getSelectedItem().toString().substring(2,index).trim());
                cancelBooking(ClassRoom,Time);}} 
 initreservationsComboBox();  }                                            

	
public void cancelBooking(char ClassRoom, int Time){
	for(int i=0; i< Welcome.ClASSROOMS.length; i++)
		for (int j=0; j<Welcome.NO_OF_SEATS_PER_ClASSROOM;j++)
			if ( Welcome.getTime(i,j).getClassRoom()==ClassRoom && Welcome.getTime(i,j).getMin()==Time){
			JOptionPane.showMessageDialog(null,"The reservation for " + Welcome.getTime(i,j).getName()+" has been removed.");
			Welcome.getTime(i,j).setName("");
			Welcome.getTime(i,j).setReserved(false);
			reservationsComboBox.removeAllItems(); } }
		
    public static void main(String args[]) 
	     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancellation().setVisible(true);
            }
        });
    }
	 private javax.swing.JButton jBackButoon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton removeButton;
    private javax.swing.JComboBox<String> reservationsComboBox;              
}

                                
                       
    
