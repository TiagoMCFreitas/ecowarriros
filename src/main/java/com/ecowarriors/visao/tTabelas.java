/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ecowarriors.visao;

/**
 *
 * @author tiago.moliveira
 */
public class tTabelas extends javax.swing.JFrame {

    /**
     * Creates new form tTabelas
     */
    public tTabelas() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ecowarriors/visao/icons/5333978.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void imprimirDadosNaGrid() {
//
//        try {
//
//            DefaultTableModel model = (DefaultTableModel) jTable1_gastos.getModel();
//            JTableRenderer JtableRenderer = new JTableRenderer();
//            conexao = ConexaoBD.getConexao();
//            Statement statement = conexao.createStatement();
//            String query = "select veiculos.id as \"Identificador do Veiculo\",\n"
//                    + "	   modelos.descricao as \"Modelo do Carro\",\n"
//                    + "	   marcas.descricao as \"Marca Do Carro\",\n"
//                    + "	   veiculos.placa as \"Placa do veiculo\",\n"
//                    + "	   veiculos.categoria_veiculo as \"Categoria\",\n"
//                    + "	   veiculos.tipo_veiculo as \"Tipo de veiculo\",\n"
//                    + "	   veiculos.tipo_combustivel  as \"Tipo de Combustivel\",\n"
//                    + "	   veiculos.quilometragem as \"Quilometragem atual\"\n"
//                    + "from veiculos \n"
//                    + "inner join modelos on modelos.id = veiculos.id_modelo \n"
//                    + "inner join marcas on marcas.id = modelos.id_marca";
//            ResultSet resultSet = statement.executeQuery(query);
//
//            DefaultTableModel tableModel = new DefaultTableModel();
//            jTable1_gastos.setModel(tableModel);
//
//            ResultSetMetaData metaData = resultSet.getMetaData();
//            int columnCount = metaData.getColumnCount();
//
//            for (int i = 1; i <= columnCount; i++) {
//                tableModel.addColumn(metaData.getColumnName(i));
//            }
//
//            while (resultSet.next()) {
//                Object[] row = new Object[columnCount];
//                for (int i = 1; i <= columnCount; i++) {
//                    row[i - 1] = resultSet.getObject(i);
//                }
//                tableModel.addRow(row);
//            }
//            resultSet.close();
//            statement.close();
//
//            jTable1_gastos.getColumnModel().getColumn(3).setWidth(140);
//            jTable1_gastos.getColumnModel().getColumn(3).setMinWidth(140);
//            jTable1_gastos.getColumnModel().getColumn(3).setMaxWidth(140);
//            jTable1_gastos.getColumnModel().getColumn(0).setWidth(140);
//            jTable1_gastos.getColumnModel().getColumn(0).setMinWidth(140);
//            jTable1_gastos.getColumnModel().getColumn(0).setMaxWidth(140);
//            jTable1_gastos.getColumnModel().getColumn(7).setWidth(130);
//            jTable1_gastos.getColumnModel().getColumn(7).setMinWidth(130);
//            jTable1_gastos.getColumnModel().getColumn(7).setMaxWidth(130);
//
//        } catch (Exception e) {
//
//        }
//    }
    
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
            java.util.logging.Logger.getLogger(tTabelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tTabelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tTabelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tTabelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tTabelas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
