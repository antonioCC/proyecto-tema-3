import javax.swing.*;
public class tabla extends JFrame {

      //costructor
    public tabla() {
        setLocation(585,405);
        initComponents();
    }

//aqui solo utilisamos un objeto que es un tabla para mostrar la platica completa se inicializa la tabla y se define con todo y sus caracteriticas
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        setTitle("Tabla");

        jTable1.setForeground(new java.awt.Color(0,0,255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
                {null, null,null,null,null,null,null},
            },
            new String [] {
                "i", "x1","y1","z1","es x","es y","es z"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
         jTable1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }
//metodo que recibe la palabra a guardar y su respectiva fila y columna  toma cont como fila y con1 como columna esto tenlo siempre presente heee
    public static void ven0 (double a,int cont,int cont1)
    {


      jTable1.setValueAt(a, cont,cont1);


    }
 //clasica clase main
    

    //y como ves solo se necesito de un objeto que tiene q ser publico para que otras clases la puedan usar
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;


}
