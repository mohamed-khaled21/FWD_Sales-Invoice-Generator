package GUI;

import GUI.JframeNew;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import static java.nio.file.Files.lines;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import Model.InHeaderTableModel;
import Model.InLineTableModel;
import Controller.InvoiceHeader;
import Controller.InvoiceLine;
import View.InvHeaderDialog;
import View.InvLineDialog;

public class JframeNew extends javax.swing.JFrame implements ActionListener, ListSelectionListener {

    public JframeNew() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        headerTable = new javax.swing.JTable();
        headerTable.getSelectionModel().addListSelectionListener(this);
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(this);
        jButton2 = new javax.swing.JButton();
        jButton2.addActionListener(this);
        label = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        InvoiceTotal = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lineTable = new javax.swing.JTable();
        InvNumber = new javax.swing.JLabel();
        cusNameTF = new javax.swing.JTextField();
        invDateTF = new javax.swing.JTextField();
        InvTotal = new javax.swing.JLabel();
        insertItemBtn = new javax.swing.JButton();
        insertItemBtn.addActionListener(this);
        jButton4 = new javax.swing.JButton();
        jButton4.addActionListener(this);
        jLabel5 = new javax.swing.JLabel();
        invNumLbl = new javax.swing.JLabel();
        invTotalLbl = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFileMenuItem = new javax.swing.JMenuItem();
        loadFileMenuItem.addActionListener(this);
        saveFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Invoice Date", "Customer Name", "Total"
            }
        ));
        headerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(headerTable);

        jButton1.setText("Create New Invoice");
        jButton1.setActionCommand("CreateInv");

        jButton2.setText("Delete Invoice");
        jButton2.setActionCommand("DeleteInv");

        label.setText("Invoice Num.");

        label1.setText("Invoice Date");

        InvoiceTotal.setText("Customer Name");

        label4.setText("Invoice Total");

        lineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Item Price", "Count", "Item Total"
            }
        ));
        lineTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lineTable);

        cusNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusNameTFActionPerformed(evt);
            }
        });

        invDateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invDateTFActionPerformed(evt);
            }
        });

        insertItemBtn.setText("Insert New Item");
        insertItemBtn.setActionCommand("InsertItem");

        jButton4.setText("Delete Item");
        jButton4.setActionCommand("DeleteItem");

        jLabel5.setText("Invoice Tabel");

        jMenu1.setText("File");

        loadFileMenuItem.setText("Load File");
        loadFileMenuItem.setActionCommand("L");
        loadFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadFileMenuItem);

        saveFileMenuItem.setText("Save");
        saveFileMenuItem.setActionCommand("S");
        jMenu1.add(saveFileMenuItem);
        saveFileMenuItem.getAccessibleContext().setAccessibleName("S");

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvoiceTotal)
                            .addComponent(label1)
                            .addComponent(label)
                            .addComponent(label4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invDateTF)
                            .addComponent(cusNameTF)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invNumLbl)
                                    .addComponent(invTotalLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InvTotal)
                                    .addComponent(InvNumber))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(230, 230, 230)
                .addComponent(insertItemBtn)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label)
                    .addComponent(InvNumber)
                    .addComponent(jLabel5)
                    .addComponent(invNumLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(invDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceTotal)
                            .addComponent(cusNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(InvTotal)
                            .addComponent(invTotalLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(insertItemBtn)
                            .addComponent(jButton4))))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        cusNameTF.getAccessibleContext().setAccessibleName("cusNameTF");
        invDateTF.getAccessibleContext().setAccessibleName("invDateTF");
        invNumLbl.getAccessibleContext().setAccessibleName("Invoice Num.");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invDateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invDateTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invDateTFActionPerformed

    private void cusNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusNameTFActionPerformed

    private void loadFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileMenuItemActionPerformed
        try {
            loadFiless();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_loadFileMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(JframeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InvNumber;
    private javax.swing.JLabel InvTotal;
    private javax.swing.JLabel InvoiceTotal;
    private javax.swing.JTextField cusNameTF;
    private javax.swing.JTable headerTable;
    private javax.swing.JButton insertItemBtn;
    private javax.swing.JTextField invDateTF;
    private javax.swing.JLabel invNumLbl;
    private javax.swing.JLabel invTotalLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label4;
    private javax.swing.JTable lineTable;
    private javax.swing.JMenuItem loadFileMenuItem;
    private javax.swing.JMenuItem saveFileMenuItem;
    // End of variables declaration//GEN-END:variables

    private ArrayList<InvoiceHeader> filesData = new ArrayList<>();
    private InHeaderTableModel headerTableModel;
    private InLineTableModel lineTableModel;
    private SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
    private InvHeaderDialog headerDialog;
    private InvLineDialog lineDialog;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("S")) {
            try {
                saveData();
            } catch (Exception ex) {
                Logger.getLogger(JframeNew.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand().equals("CreateInv")) {
            createInvoice();
        } else if (e.getActionCommand().equals("DeleteInv")) {
            deleteInvoce();
        } else if (e.getActionCommand().equals("InsertItem")) {
            //System.out.println("Creat new item clicked");
            InsertItem();
        } else if (e.getActionCommand().equals("DeleteItem")) {
            //System.out.println("Delete an item clicked");
            deleteItem();
        } else if (e.getActionCommand().equals("creatInvOk")) {
            createInvOk();
        } else if (e.getActionCommand().equals("creatInvCancle")) {
            createInvCancle();
        } else if (e.getActionCommand().equals("creatLinevOk")) {
            createLineOk();
        } else if (e.getActionCommand().equals("creatLineCancle")) {
            createLineCancle();
        }
    }

    private InvoiceHeader findByNum(int num) {
        for (InvoiceHeader header : filesData) {
            if (header.getInvNum() == num) {
                return header;
            }
        }
        return null;
    }

    private void loadFiless() throws Exception {
        filesData.clear();
        JOptionPane.showMessageDialog(this, "Please select Invoice header file", "Invoice Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser fc = new JFileChooser();
        int option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            FileReader fr = new FileReader(selectedFile);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] headerSegments = line.split(",");
                String invNumStr = headerSegments[0];
                String invDateStr = headerSegments[1];
                String custName = headerSegments[2];
                int invNum = Integer.parseInt(invNumStr);
                Date invDate = df.parse(invDateStr);
                InvoiceHeader header = new InvoiceHeader(invNum, invDate, custName);
                filesData.add(header);
            }
            br.close();
            fr.close();

            JOptionPane.showMessageDialog(this, "Please select Invoice lines file", "Invoice Lines", JOptionPane.WARNING_MESSAGE);
            option = fc.showOpenDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                selectedFile = fc.getSelectedFile();
                fr = new FileReader(selectedFile);
                br = new BufferedReader(fr);
                line = null;
                while ((line = br.readLine()) != null) {
                    String[] lineSegments = line.split(",");
                    String invNumStr = lineSegments[0];
                    String item = lineSegments[1];
                    String priceStr = lineSegments[2];
                    String countStr = lineSegments[3];
                    int invNum = Integer.parseInt(invNumStr);
                    double price = Double.parseDouble(priceStr);
                    int count = Integer.parseInt(countStr);
                    InvoiceHeader header = findByNum(invNum);
                    InvoiceLine invLine = new InvoiceLine(item, price, count, header);
                    header.addLine(invLine);
                }

                br.close();
                fr.close();
                headerTableModel = new InHeaderTableModel(filesData);
                headerTable.setModel(headerTableModel);
                headerTable.validate();

            }
        }
    }

    private void saveData() throws Exception {

        JOptionPane.showMessageDialog(this, "Please Save Invoice header file", "Invoice Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser fc = new JFileChooser();
        int option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            PrintWriter fr = new PrintWriter(selectedFile);
            for (InvoiceHeader header : filesData) {
                fr.printf("%d,%s,%s", header.getInvNum(), header.getInvDate().toString(), header.getCusName());
                fr.println();
            }
            fr.close();
        }
        
                JOptionPane.showMessageDialog(this, "Please Save Invoice line file", "Invoice Line", JOptionPane.WARNING_MESSAGE);
         fc = new JFileChooser();
         option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            PrintWriter fr = new PrintWriter(selectedFile);
            for (InvoiceHeader header : filesData) {
                for(InvoiceLine line:header.getLines()){
                fr.printf("%s,%s,%s", line.getItemName(), line.getItemPrice(), line.getCount());
                fr.println();
            }}
            fr.close();
        }
    }

    private void createInvoice() {
        headerDialog = new InvHeaderDialog(this);
        headerDialog.setVisible(true);
    }

    private void deleteInvoce() {
        int x = headerTable.getSelectedRow();
        headerTableModel.removeRow(x);
        headerTableModel.fireTableDataChanged();
        lineTableModel.fireTableDataChanged();

    }

    private void headerTableRowSelected() {
        int selectedRowIndex = headerTable.getSelectedRow();
        if (selectedRowIndex >= 0) {
            InvoiceHeader row = headerTableModel.getHeaders().get(selectedRowIndex);
            cusNameTF.setText(row.getCusName());
            invDateTF.setText(row.getInvDate().toString());
            invNumLbl.setText("" + row.getInvNum());
            invTotalLbl.setText("" + row.getInvTotal());
            ArrayList<InvoiceLine> lines = row.getLines();
            lineTableModel = new InLineTableModel(lines);
            lineTable.setModel(lineTableModel);
            lineTableModel.fireTableDataChanged();
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        headerTableRowSelected();
    }

    private void InsertItem() {
        lineDialog = new InvLineDialog(this);
        lineDialog.setVisible(true);
    }

    private void deleteItem() {

        int x = lineTable.getSelectedRow();
        lineTableModel.removeRow(x);
        lineTableModel.fireTableDataChanged();
        headerTableModel.fireTableDataChanged();
    }

    private void createInvOk() {
        String custName = headerDialog.getCustNameField().getText();
        String strDate = headerDialog.getCustNameField().getText();
        Date invDate = new Date();
        try {
            invDate = df.parse(strDate);
        } catch (ParseException ex) {
        }
        headerDialog.setVisible(false);
        int num = getMaxInvNum() + 1;
        InvoiceHeader newInvHeader = new InvoiceHeader(WIDTH, invDate, custName);
        filesData.add(newInvHeader);
        headerTableModel.fireTableDataChanged();
        System.out.println("chick");
    }

    private void createInvCancle() {
        headerDialog.setVisible(false);
    }

    private void createLineOk() {
        String itemName = lineDialog.getItemNameField().getText();
        String itemCountStr = lineDialog.getItemCountField().getText();
        String itemPriceStr = lineDialog.getItemPriceField().getText();
        lineDialog.setVisible(false);
        int itemCount = Integer.parseInt(itemCountStr);
        double itemPrice = Double.parseDouble(itemPriceStr);
        InvoiceHeader invoiceHeader = filesData.get(headerTable.getSelectedRow());

        InvoiceLine line = new InvoiceLine(itemName, itemPrice, itemCount, invoiceHeader);
        invoiceHeader.addLine(line);
        lineTableModel.fireTableDataChanged();
        headerTableModel.fireTableDataChanged();
    }

    private void createLineCancle() {
        lineDialog.setVisible(false);
    }

    private int getMaxInvNum() {
        int num = 0;
        for (InvoiceHeader header : filesData) {
            if (header.getInvNum() > num) {
                num = header.getInvNum();
            }
        }
        return num;
    }

}
