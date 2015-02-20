
import java.io.*;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * @author RafaelRCA
 */
public class A1 extends javax.swing.JFrame {
DefaultTableModel modelo1;
DefaultTableModel modelo2;    

    public A1() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo2 = (DefaultTableModel) jTable2.getModel();
        this.modelo1 = (DefaultTableModel) jTable1.getModel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        abrir = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pasajeros y Vuelos");

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        jScrollPane1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Edad", "Origen", "Destino", "Asiento"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);

        jTable2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Origen", "Destino", "Salida", "Arribo", "Distancia", "Pasajeros", "Carga", "Disponibles"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);

        jToolBar2.setRollover(true);

        abrir.setText("Cargar");
        abrir.setFocusable(false);
        abrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        abrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        jToolBar2.add(abrir);

        guardar.setText("Guardar");
        guardar.setFocusable(false);
        guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jToolBar2.add(guardar);

        jButton5.setText("Limpiar");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton5);

        cerrar.setText("Cerrar");
        cerrar.setFocusable(false);
        cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jToolBar2.add(cerrar);

        jLabel1.setText("Pasajeros:");
        jLabel1.setLocation(new java.awt.Point(-32700, -32688));

        jLabel2.setText("Vuelos:");
        jLabel2.setLocation(new java.awt.Point(-32700, -32688));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1424416962_add-16.png"))); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(26, 26));
        jButton3.setMinimumSize(new java.awt.Dimension(26, 26));
        jButton3.setPreferredSize(new java.awt.Dimension(26, 26));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1424417031_sub-16.png"))); // NOI18N
        jButton6.setMaximumSize(new java.awt.Dimension(26, 26));
        jButton6.setMinimumSize(new java.awt.Dimension(26, 26));
        jButton6.setPreferredSize(new java.awt.Dimension(26, 26));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1424416962_add-16.png"))); // NOI18N
        jButton4.setMaximumSize(new java.awt.Dimension(26, 26));
        jButton4.setMinimumSize(new java.awt.Dimension(26, 26));
        jButton4.setPreferredSize(new java.awt.Dimension(26, 26));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1424417031_sub-16.png"))); // NOI18N
        jButton7.setMaximumSize(new java.awt.Dimension(26, 26));
        jButton7.setMinimumSize(new java.awt.Dimension(26, 26));
        jButton7.setPreferredSize(new java.awt.Dimension(26, 26));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        guardar();
    }//GEN-LAST:event_guardarActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        int res =JOptionPane.showConfirmDialog(null,"Desea cerrar sin guardar?","Pasajeros y Vuelos", 
                JOptionPane.YES_NO_OPTION);
        if(res==JOptionPane.YES_OPTION)
            System.exit(0);
        else {
        }
    }//GEN-LAST:event_cerrarActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        limpiar();
    try {
        llenaTabla();
    } catch (IOException ex) {
        Logger.getLogger(A1.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_abrirActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        modelo2.addRow(new Object[]{});
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
            modelo2.removeRow(modelo2.getRowCount()-1);
        }catch(ArrayIndexOutOfBoundsException e){}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        modelo1.addRow(new Object[]{});
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try{
            modelo1.removeRow(modelo1.getRowCount()-1);
        }catch(ArrayIndexOutOfBoundsException e){}
    }//GEN-LAST:event_jButton7ActionPerformed

    @SuppressWarnings("empty-statement")

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
            java.util.logging.Logger.getLogger(A1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrir;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables

    
    
    public void limpiar(){
        int rows=jTable1.getRowCount(), rows1=jTable2.getRowCount();
        for(int i=0; i<rows; i++){
                modelo1.removeRow(0);
            }
        for (int ii=0;ii<rows1; ii++){
                modelo2.removeRow(0);
            }
    }
    
    public void llenaTabla() throws FileNotFoundException, IOException{
        FileReader fr1 = new FileReader("Pasajeros.txt");
        FileReader fr2 = new FileReader("Vuelos.txt");
        BufferedReader bfr1 = new BufferedReader(fr1);
        BufferedReader bfr2 = new BufferedReader(fr2);
        String lin1 ="";
        int rp=0,rv=0;
        
        while((lin1 = bfr1.readLine())!= null){
                modelo1.addRow(new Object[]{});
                String[] temp = null;
                temp = lin1.split("\t");
                for(int i =0; i < temp.length ; i++){
                    modelo1.setValueAt(temp[i], rp, i);
                }
                rp++;
            }
        while((lin1 = bfr2.readLine())!= null){
                modelo2.addRow(new Object[]{});
                String[] temp = null;
                temp = lin1.split("\t");
                for(int i =0; i < temp.length ; i++){
                    modelo2.setValueAt(temp[i], rv, i);
                }
                rv++;
            }
    }
    
    public void guardar(){
        try{
            BufferedWriter bw1 = null, bw2=null;
            File fl1 = new File("Pasajeros.txt");
            File fl2 = new File("Vuelos.txt");
            bw1 = new BufferedWriter(new FileWriter(fl1));
            bw2 = new BufferedWriter(new FileWriter(fl2));
        
            for(int nrow1=0; nrow1<jTable1.getRowCount(); nrow1++){
                for(int ncolm1=0; ncolm1<jTable1.getColumnCount(); ncolm1++){
                String dat1=jTable1.getValueAt(nrow1, ncolm1).toString();
                bw1.append(dat1+"\t");
                } 
                bw1.append("\n");
            }
            bw1.close();
        
            for(int nrow2=0; nrow2<jTable2.getRowCount(); nrow2++){
                for(int ncolm2=0; ncolm2<jTable2.getColumnCount(); ncolm2++){
                String dat2=jTable2.getValueAt(nrow2, ncolm2).toString();
                bw2.append(dat2+"\t"); 
                }  
                bw2.append("\n");
            }
            bw2.close();
         JOptionPane.showMessageDialog(null, "Se guardo correctamente.");
        }catch(Exception ex){JOptionPane.showMessageDialog(null, "No se guardo. ERROR: "+ex);}
    }
    /************/
    

}

