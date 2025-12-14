package proyectofinalp1_danielsorto;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class MainFrame extends javax.swing.JFrame {
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    ArrayList<Mutacion> listaDeEnfermedades = new java.util.ArrayList<>();
    Mutacion mutacionActual;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());
    
    public MainFrame() {
        initComponents();
        cargarDatos();
        this.setLocationRelativeTo(null);
    }
    // --- sim ---
    public void iniciarSimulacion(int indiceEnfermedad) {
        this.mutacionActual = listaDeEnfermedades.get(indiceEnfermedad);
        
        //  textos
        txtInfoCaso.setText("CASO: " + mutacionActual.getNombre() + "\n\n" + mutacionActual.getDescripcion());
        
        String adnVisual = matrizAdn(mutacionActual.getSecuenciaMutada(), true);
        txtAreaADN.setText(adnVisual);

        // recursividad - para cada caso
        char baseIncorrecta = mutacionActual.getSecuenciaMutada()[mutacionActual.getPosMutacion()];
        int conteo = CRISPR.contarBaseRecursivo(mutacionActual.getSecuenciaMutada(), baseIncorrecta, mutacionActual.getSecuenciaMutada().length - 1);
        lblEstadistica.setText("Pista: Se encontraron " + conteo + " " + baseIncorrecta + " en la muestra.");

        // cambiar a pantalla
        java.awt.CardLayout card = (java.awt.CardLayout) panelPrincipal.getLayout();
        card.show(panelPrincipal, "SIMULACION"); 
    }

    // --- ver ADN ---
    public String matrizAdn(char[] secuencia, boolean mostrarIndices) {
        String output = "";
        char[][] matrizAdn = new char[2][secuencia.length];
        for(int i = 0; i< secuencia.length; i++) {
            matrizAdn[0][i] = secuencia[i];
            matrizAdn[1][i] = CRISPR.complementoDeAdn(secuencia[i]); // devuelve la base complementaria
        }
        if (mostrarIndices) {
            output += ("Indices:   ");
            for (int i = 0; i < secuencia.length; i++) output += i + " ";
            output += "\n";
        }
        output += "Cadena M:  ";
        for(int i = 0; i < 2;i++) {
            for(int j = 0; j < secuencia.length; j++) {
                output += matrizAdn[i][j] + "  ";
            }
            if(i==1) break;
            output += "\nComplem.:  ";
        }
        return output;
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
        txtAreaADN = new javax.swing.JTextArea();
        lblEstadistica = new javax.swing.JLabel();
        btnCorte = new javax.swing.JButton();
        pnlMenu = new javax.swing.JPanel();
        btnAnemia = new javax.swing.JButton();
        btnTalasemia = new javax.swing.JButton();
        btnAmiloidosis = new javax.swing.JButton();
        btnFibrosis = new javax.swing.JButton();
        btnRandom = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();

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

        pnlSimulacion.setLayout(new java.awt.BorderLayout());

        txtInfoCaso.setColumns(20);
        txtInfoCaso.setRows(5);
        jScrollPane1.setViewportView(txtInfoCaso);

        pnlSimulacion.add(jScrollPane1, java.awt.BorderLayout.NORTH);

        txtAreaADN.setColumns(20);
        txtAreaADN.setRows(5);
        jScrollPane2.setViewportView(txtAreaADN);

        pnlSimulacion.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        lblEstadistica.setText("Pista");
        pnlSimulacion.add(lblEstadistica, java.awt.BorderLayout.PAGE_END);

        btnCorte.setText("Generar Corte");
        btnCorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorteActionPerformed(evt);
            }
        });
        pnlSimulacion.add(btnCorte, java.awt.BorderLayout.LINE_END);

        panelPrincipal.add(pnlSimulacion, "SIMULACION");

        pnlMenu.setLayout(new java.awt.GridLayout(6, 1));

        btnAnemia.setText("1. Anemia Falciforme");
        btnAnemia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnemiaActionPerformed(evt);
            }
        });
        pnlMenu.add(btnAnemia);

        btnTalasemia.setText("2. Talasemia");
        btnTalasemia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTalasemiaActionPerformed(evt);
            }
        });
        pnlMenu.add(btnTalasemia);

        btnAmiloidosis.setText("3. Amiloidosis hATTR  ");
        btnAmiloidosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmiloidosisActionPerformed(evt);
            }
        });
        pnlMenu.add(btnAmiloidosis);

        btnFibrosis.setText("4. Fibrosis Quística");
        btnFibrosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFibrosisActionPerformed(evt);
            }
        });
        pnlMenu.add(btnFibrosis);

        btnRandom.setBackground(new java.awt.Color(204, 153, 0));
        btnRandom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRandom.setText("5. ¡RANDOM!");
        btnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomActionPerformed(evt);
            }
        });
        pnlMenu.add(btnRandom);

        btnReporte.setText("6. Reporte en Consola");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        pnlMenu.add(btnReporte);

        panelPrincipal.add(pnlMenu, "MENU");

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        java.awt.CardLayout card = (java.awt.CardLayout) panelPrincipal.getLayout();
        card.show(panelPrincipal, "MENU");
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorteActionPerformed

        String entrada = javax.swing.JOptionPane.showInputDialog(this,
            "Observa los indices arriba de la cadena.\nIngresa el NÚMERO donde inicia la mutación:",
            "Panel de Control Cas9",
            javax.swing.JOptionPane.QUESTION_MESSAGE);

        // val
        if (entrada != null && !entrada.isEmpty()) {
            try {
                int indiceUsuario = Integer.parseInt(entrada);

                //  comprobar
                if (indiceUsuario == mutacionActual.getPosMutacion()) {

                    // --- Lo identifico correctamente ---
                    java.awt.Toolkit.getDefaultToolkit().beep(); // sonido

                    // cadena correcta mostrada en el fondo
                    String adnSano = matrizAdn(mutacionActual.getSecuenciaCorrecta(), true);
                    txtAreaADN.setText("--- ¡CORTE EXITOSO! ---\n\nSecuencia Reparada (HDR):\n" + adnSano);
                    
                    txtAreaADN.setBackground(new java.awt.Color(200, 255, 200)); // color verde para ganador
                    javax.swing.JOptionPane.showMessageDialog(this, "¡Felicidades! Has curado la " + mutacionActual.getNombre());

                    int opcion = javax.swing.JOptionPane.showConfirmDialog(this,
                        "Misión cumplida. ¿Deseas volver al menú principal?",
                        "Sistema CRISPR",
                        javax.swing.JOptionPane.YES_NO_OPTION);

                    if(opcion == javax.swing.JOptionPane.YES_OPTION){
                        java.awt.CardLayout card = (java.awt.CardLayout) panelPrincipal.getLayout();
                        card.show(panelPrincipal, "MENU");
                        txtAreaADN.setBackground(java.awt.Color.WHITE);
                    } else System.exit(0);

                } else { // --- Corte incorrecto ---
                    txtAreaADN.setBackground(new java.awt.Color(255, 200, 200)); // color rojo para cuando no se identifica
                    javax.swing.JOptionPane.showMessageDialog(this,
                        "¡FALLO EN EL CORTE!\nIntentaste cortar en posición " + indiceUsuario +
                        "\nIntenta de nuevo",
                        "Error de Cas9", javax.swing.JOptionPane.ERROR_MESSAGE);

                    /*java.awt.CardLayout card = (java.awt.CardLayout) panelPrincipal.getLayout();
                    card.show(panelPrincipal, "MENU");
                    txtAreaADN.setBackground(java.awt.Color.WHITE);*/
                }
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error: Debes ingresar un número entero válido.");
            }
        }
    }//GEN-LAST:event_btnCorteActionPerformed

    private void btnAnemiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnemiaActionPerformed
        iniciarSimulacion(0);
    }//GEN-LAST:event_btnAnemiaActionPerformed

    private void btnTalasemiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTalasemiaActionPerformed
        iniciarSimulacion(1);
    }//GEN-LAST:event_btnTalasemiaActionPerformed

    private void btnFibrosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFibrosisActionPerformed
        iniciarSimulacion(3);
    }//GEN-LAST:event_btnFibrosisActionPerformed

    private void btnRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandomActionPerformed
        int indiceAlAzar = rnd.nextInt(listaDeEnfermedades.size());
        iniciarSimulacion(indiceAlAzar);
    }//GEN-LAST:event_btnRandomActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        System.out.println("--- Reporte ---");
        System.out.print("Seleccione una enfermedad para mostrar la respuesta(0-4): ");
        int selIdx = sc.nextInt();
        sc.nextLine();
        System.out.printf("Enfermedad: %-20s [Corte en: %d]%n", listaDeEnfermedades.get(selIdx).getNombre(), listaDeEnfermedades.get(selIdx).getPosMutacion());
        javax.swing.JOptionPane.showMessageDialog(this, "Reporte generado en la consola.");
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnAmiloidosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmiloidosisActionPerformed
        iniciarSimulacion(2);
    }//GEN-LAST:event_btnAmiloidosisActionPerformed

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
    private javax.swing.JButton btnAmiloidosis;
    private javax.swing.JButton btnAnemia;
    private javax.swing.JButton btnCorte;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnFibrosis;
    private javax.swing.JButton btnRandom;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnTalasemia;
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
    private javax.swing.JTextArea txtAreaADN;
    private javax.swing.JTextArea txtInfoCaso;
    // End of variables declaration//GEN-END:variables
    
    //  ------ Metodos ------
    public void cargarDatos() {
        char[] falciformeMutada = {'G', 'A', 'T', 'C', 'G', 'T', 'A', 'T', 'C'};
        char[] falciformeSana =   {'G', 'A', 'T', 'C', 'G', 'A', 'A', 'T', 'C'};
        listaDeEnfermedades.add(new Mutacion("Anemia Falciforme", 
            "Cambio de Timina (T) por Adenina (A).", falciformeMutada, falciformeSana, 5));

        char[] talasemiaMutada = {'A', 'T', 'G', 'A', 'A', 'C', 'T', 'A'};
        char[] talasemiaSana =   {'A', 'T', 'G', 'G', 'A', 'C', 'T', 'A'};
        listaDeEnfermedades.add(new Mutacion("Beta Talasemia", 
            "Cambio de A por G.", talasemiaMutada, talasemiaSana, 3));
 
       char[] amiloidosisMutada = {'T', 'A', 'G', 'T', 'T', 'C', 'G'};
        char[] amiloidosisSana =   {'T', 'A', 'C', 'T', 'T', 'C', 'G'};
        listaDeEnfermedades.add(new Mutacion("Amiloidosis hATTR", 
            "Cambio de G por C.", amiloidosisMutada, amiloidosisSana, 2));

        char[] fibrosisMutada = {'A', 'T', 'C', 'A', 'T', 'A', 'C', 'G'};
        char[] fibrosisSana =   {'A', 'T', 'C', 'A', 'T', 'A', 'G', 'G'};
        listaDeEnfermedades.add(new Mutacion("Fibrosis Quística", 
            "Corrección C por G.", fibrosisMutada, fibrosisSana, 6));
    }

}
