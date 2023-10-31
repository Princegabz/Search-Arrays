
package prj2darraysearch;

import javax.swing.JOptionPane;

public class Prj2DArraySearch {
    public static void main(String[] args) 
    {
        String[][]arrInfo;//first square brackets is y(rows) and the 2nd one is x(Coloms)
        int iSize = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the amount of staff members"));
        arrInfo = new String[iSize][3];//ID,Name, Salary
        int y = 1;
        
        for (int x =0; x <iSize ;x++)
        {
            arrInfo[x][0]= JOptionPane.showInputDialog(null,"Enter staff ID "+y);
            arrInfo[x][1]= JOptionPane.showInputDialog(null,"Enter staff Name "+y);
            arrInfo[x][2]= JOptionPane.showInputDialog(null,"Enter staff Salary "+y);
            y++;
        }
        boolean bStop = true;
        while(bStop ==true)
        {
             String strID = JOptionPane.showInputDialog(null,"Enter the Employee ID to search");
             for (int x =0; x <iSize;x++)
             {
                 if(arrInfo[x][0].toLowerCase().equals(strID.toLowerCase())) 
                 {
                     JOptionPane.showMessageDialog(null,"Employee Number: "+arrInfo[x][0] +"\n"+
                                                        "Employee Name: "+arrInfo[x][1] +"\n"+
                                                        "Employee Salary: R"+arrInfo[x][2]);
                 }
                 else
                 {
                      JOptionPane.showMessageDialog(null,"Employee could not be found");
                     bStop = false;
                 }
             }
             int reply =  JOptionPane.showConfirmDialog(null,"Do you want to search?","Search again",JOptionPane.YES_NO_OPTION);
             if (reply==JOptionPane.YES_OPTION)
             {
                 bStop = true;
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"Goodbye");
                 bStop = false;
                 System.exit(0);
             }
        }
    }
    
}
