package proyectofinalp1_danielsorto;
import java.util.ArrayList;
public class MainFrame extends javax.swing.JFrame {
    ArrayList<Mutacion> listaDeEnfermedades = new java.util.ArrayList<>();
    Mutacion mutacionActual;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());
    
    
    // new form MainFrame
    public MainFrame() {
        initComponents();
        cargarDatos();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        pnlInicio = new javax.swing.JPanel();
        pnlContenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        btnEntrar = new javax.swing.JButton();
        pnlSimulacion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfoCaso = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaAdn = new javax.swing.JTextArea();
        lblEstadistica = new javax.swing.JLabel();
        btnCorte = new javax.swing.JButton();
        pnlMenu = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setLayout(new java.awt.CardLayout());

        pnlInicio.setBackground(new java.awt.Color(153, 255, 204));
        pnlInicio.setLayout(new java.awt.GridBagLayout());

        pnlContenido.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Laboratorio de Ingeniería Genética");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(102, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 0));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("¡Bienvenido al Laboratorio de Ingenieria Genetica con CRISPR-Cas9! Tu seras el **ARN Guía (gRNA)** para la proteína Cas9. Selecciona un mutacion y ve y cambia el mundo!");

        btnEntrar.setBackground(new java.awt.Color(0, 153, 153));
        btnEntrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(51, 51, 51));
        btnEntrar.setText("Ingresar al Laboratorio");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenidoLayout.createSequentialGroup()
                        .addComponent(btnEntrar)
                        .addGap(235, 235, 235))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenidoLayout.createSequentialGroup()
                        .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnEntrar)
                .addGap(73, 73, 73))
        );

        pnlInicio.add(pnlContenido, new java.awt.GridBagConstraints());

        panelPrincipal.add(pnlInicio, "card2");

        txtInfoCaso.setColumns(20);
        txtInfoCaso.setRows(5);
        jScrollPane1.setViewportView(txtInfoCaso);

        txtAreaAdn.setColumns(20);
        txtAreaAdn.setRows(5);
        jScrollPane2.setViewportView(txtAreaAdn);

        lblEstadistica.setText("jLabel2");

        btnCorte.setText("jButton1");
        btnCorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSimulacionLayout = new javax.swing.GroupLayout(pnlSimulacion);
        pnlSimulacion.setLayout(pnlSimulacionLayout);
        pnlSimulacionLayout.setHorizontalGroup(
            pnlSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(pnlSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSimulacionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(pnlSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSimulacionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(pnlSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSimulacionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblEstadistica)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(pnlSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSimulacionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnCorte)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlSimulacionLayout.setVerticalGroup(
            pnlSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(pnlSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSimulacionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(pnlSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSimulacionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(pnlSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSimulacionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblEstadistica)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(pnlSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSimulacionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnCorte)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelPrincipal.add(pnlSimulacion, "card4");

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        panelPrincipal.add(pnlMenu, "card3");

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCorteActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCorte;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblEstadistica;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlSimulacion;
    private javax.swing.JTextArea txtAreaAdn;
    private javax.swing.JTextArea txtInfoCaso;
    // End of variables declaration//GEN-END:variables
    
    //  ------ Metodos ------
    public void cargarDatos() {
        char[] falciformeMutada = {'G', 'A', 'T', 'C', 'G', 'T', 'A', 'T', 'C'};
        char[] falciformeSana =   {'G', 'A', 'T', 'C', 'G', 'A', 'A', 'T', 'C'};
        listaDeEnfermedades.add(new Mutacion("Anemia Falciforme", 
            "Cambio de Timina (T) por Adenina (A) en pos 5.", falciformeMutada, falciformeSana, 5));

        char[] talasemiaMutada = {'A', 'T', 'G', 'A', 'A', 'C', 'T', 'A'};
        char[] talasemiaSana =   {'A', 'T', 'G', 'G', 'A', 'C', 'T', 'A'};
        listaDeEnfermedades.add(new Mutacion("Beta Talasemia", 
            "Cambio de A por G en pos 3.", talasemiaMutada, talasemiaSana, 3));

        char[] amiloidosisMutada = {'T', 'A', 'G', 'T', 'T', 'C', 'G'};
        char[] amiloidosisSana =   {'T', 'A', 'C', 'T', 'T', 'C', 'G'};
        listaDeEnfermedades.add(new Mutacion("Amiloidosis hATTR", 
            "Cambio de G por C en pos 2.", amiloidosisMutada, amiloidosisSana, 2));

        char[] fibrosisMutada = {'A', 'T', 'C', 'A', 'T', 'A', 'C', 'G'};
        char[] fibrosisSana =   {'A', 'T', 'C', 'A', 'T', 'A', 'G', 'G'};
        listaDeEnfermedades.add(new Mutacion("Fibrosis Quística", 
            "Corrección C por G en pos 6.", fibrosisMutada, fibrosisSana, 6));
    }

}
