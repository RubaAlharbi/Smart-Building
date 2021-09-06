package SB;

public class TimeClasses extends javax.swing.JFrame {

    public TimeClasses() {
        initComponents();
         displayChart();
    }

	private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
dispose();      
    }  
	
private void displayChart(){
String outputLine;
for(int i=0;i<Welcome.ClASSROOMS.length;i++)
for(int j=0; j<Welcome. NO_OF_SEATS_PER_ClASSROOM;j++)
if(Welcome.getTime(i,j).isReserved())
listTextArea.append(createOutputLine(i,j));
}

private String createOutputLine(int i, int j){
return Welcome.getTime(i,j).getName()+"["+
Welcome.getTime(i,j).getClassRoom()+" - " +
Welcome.getTime(i,j).getMin()+":00]"+ "\n"; 
}

    public static void main(String args[]) {
	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimeClasses().setVisible(true);
            }
        });
    }
                 
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listTextArea;
    private javax.swing.JButton okButton;
                    
}