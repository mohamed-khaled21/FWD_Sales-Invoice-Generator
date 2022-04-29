/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import GUI.JframeNew;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class InvHeaderDialog extends JDialog{
   
   private JTextField custNameField;
   private JTextField invDateField;
   private JLabel custNameLbl;
   private JLabel invDateLbl;
   private JButton okBtn;
   private JButton cancleBtn;
   
   public InvHeaderDialog(JframeNew frame){
        custNameLbl = new JLabel ("Customer Name: ");
        custNameField = new JTextField(30);
        invDateLbl = new JLabel ("Invoice Date: ");
        invDateField  = new JTextField(30); 
        okBtn = new JButton ("Ok");
        cancleBtn = new JButton ("Cancle");

        okBtn.setActionCommand("creatInvOk");
        cancleBtn .setActionCommand("creatInvCancle");
        okBtn.addActionListener(frame);
        cancleBtn.addActionListener(frame);
        
        setLayout (new GridLayout(3,2));
        
        add(invDateLbl);
        add(invDateField);
        add(custNameLbl);
        add(custNameField);
        add(okBtn);
        add(cancleBtn);
        
        pack();
   }

    public JTextField getCustNameField() {
        return custNameField;
    }

    public JTextField getInvDateField() {
        return invDateField;
    }


   
}
