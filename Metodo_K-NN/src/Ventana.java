// //package Metodo_knn;
// package Metodo_knn;

// import javax.swing.*;
// import java.awt.Color;
// import java.awt.Graphics;
// import java.util.ArrayList;
// import java.util.Random;

// public class Ventana extends JFrame{
//     //crando variables de entorno
//         int x, y;
//         int clases = 1;
//         int k = 1;
//         int items = 100;
//         JButton salir;
//         Met_Knn algoritmo;
//         Random r;
//         ArrayList<Color> colores;

//     //constructor  de ventana
//     public Ventana() {
//         setSize(979,900); //asignando tamaño
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//         setTitle("Metodo de Knn "); //texto de mi GUi
//         setLocationRelativeTo(null);
//         setLayout(null);
//         initComponents();
//         initComponents2();
//         x = -1;
//         y = -1;
//         r = new Random(); //numerops ramdom para generar posicion en panel1
//     }

//     private void initComponents() {
//         panel1 = new JPanel();
//         panel1.setLayout(null);

//         identifi_vecinos = new JTextField();
//         identifi_num_puntos = new JTextField();
//         identifi_num_clases = new JTextField();
//         btnDate = new JButton();
//         vecinos = new JLabel("Numero de Vecinos");
//         punt_clase = new JLabel("Numero de puntos por clase");
//         clase = new JLabel("clases");
//         G_panel1 = new JButton();
//         G_panel1.setText("Generar panel");
//         btnLimpiar = new JButton();
//         salir = new JButton("Salir ");

        
//         //agregando elementos al panel
//         add(vecinos);
//         add(punt_clase);
//         add(clase);
//         add(G_panel1);
//         add(salir);
//         // add(jTextc);
//         // add(jTextk);
//         // add(jTextt);
//         // add(panel1);

//         salir.setBounds(890,820,63,18); //boton salir

//         identifi_vecinos.setText("100"); //numero de vecinos 
//         // identifi_vecinos.addActionListener(new java.awt.event.ActionListener() {
//         //     public void actionPerformed(java.awt.event.ActionEvent evt) {
//         //         identifi_vecinosActionPerformed(evt);
//         //     }
//         // });

//         identifi_num_puntos.setText("1000"); //numero de puntos inciales por clase
//         identifi_num_puntos.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 identifi_num_puntosActionPerformed(evt);
//             }
//         });

//         identifi_num_clases.setText("5"); //numero de clases iniciales

//         btnDate.setText("Identificar a que clase pertenece");
//         btnDate.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 btnDateActionPerformed(evt);
//             }
//         });

//         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //cerrar GUI
//         panel1.setBackground(new java.awt.Color(155, 155, 155)); //cambiar el color del panel1 generado

//         GroupLayout panel1Layout = new GroupLayout(panel1);
//         panel1.setLayout(panel1Layout);
//         panel1Layout.setHorizontalGroup(
//             panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING) //generando ancho y alto del panel1
//             .addGap(600, 600, Short.MAX_VALUE)
//         );
//         panel1Layout.setVerticalGroup(
//             panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));

//         //G_panel1.setText("Generar panel1");
//         G_panel1.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 G_panel1ActionPerformed(evt);
//             }
//         });

//         btnLimpiar.setText("Reiniciar"); 
//         btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 btnLimpiarActionPerformed(evt);
//             }
//         });

//         salir.addActionListener(new java.awt.event.ActionListener() { //boton y funcion para slair
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//               System.exit(1);
//             }
//           });


//         GroupLayout layout = new GroupLayout(getContentPane());
//         getContentPane().setLayout(layout);
//         layout.setHorizontalGroup(
//             layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//             .addGroup(layout.createSequentialGroup()
//                 .addGap(23, 23, 23)
//                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
//                     .addComponent(G_panel1)
//                     .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
//                 .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
//                 .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
//                     .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
//                         .addGroup( GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                             .addComponent(identifi_num_clases,  GroupLayout.PREFERRED_SIZE, 71,  GroupLayout.PREFERRED_SIZE)
//                             .addGap(25, 25, 25))
//                         .addGroup(layout.createSequentialGroup()
//                             .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
//                                 .addComponent(identifi_num_puntos,  GroupLayout.PREFERRED_SIZE, 71,  GroupLayout.PREFERRED_SIZE)
//                                 .addComponent(identifi_vecinos,  GroupLayout.PREFERRED_SIZE, 71,  GroupLayout.PREFERRED_SIZE))
//                             .addContainerGap()))
//                     .addGroup(layout.createSequentialGroup()
//                         .addComponent(punt_clase)
//                         .addGap(25, 25, 25))
//                     .addGroup(layout.createSequentialGroup()
//                         .addComponent(clase)
//                         .addGap(39, 39, 39))
//                     .addGroup(layout.createSequentialGroup()
//                         .addComponent(vecinos)
//                         .addGap(55, 55, 55))
//                     .addGroup(layout.createSequentialGroup()
//                         .addComponent(btnDate)
//                         .addGap(25, 25, 25))
//                     .addGroup(layout.createSequentialGroup()
//                         .addComponent(btnLimpiar)
//                         .addGap(25, 25, 25))))
//         );
//         layout.setVerticalGroup(
//             layout.createParallelGroup( GroupLayout.Alignment.LEADING)
//             .addGroup(layout.createSequentialGroup()
//                 .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
//                     .addGroup(layout.createSequentialGroup()
//                         .addGap(23, 23, 23)
//                         .addComponent(panel1,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                     .addGroup(layout.createSequentialGroup()
//                         .addGap(17, 17, 17)
//                         .addComponent(vecinos)
//                         .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
//                         .addComponent(identifi_vecinos,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
//                         .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
//                         .addComponent(punt_clase)
//                         .addGap(4, 4, 4)
//                         .addComponent(identifi_num_puntos,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
//                         .addGap(18, 18, 18)
//                         .addComponent(clase)
//                         .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
//                         .addComponent(identifi_num_clases,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
//                         .addGap(34, 34, 34)
//                         .addComponent(btnLimpiar)
//                         .addGap(0, 40, Short.MAX_VALUE)))
//                 .addGap(18, 18, 18)
//                 .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
//                     .addComponent(btnDate)
//                     .addComponent(G_panel1))
//                 .addGap(30, 30, 30))
//         );
//         // add(vecinos);
//         // add(punt_clase);
//         // add(clase);
//         // add(G_panel1);
//         // add(salir);
//         //pack();
//     }

        
//  //----------------------------------------------------------------------------------------------------------------------
//     //funciones del mause
//     private void initComponents2(){ //generando funcion de mause
//         colores = new ArrayList<>();
//         panel1.addMouseListener(new java.awt.event.MouseAdapter() {
//             @Override
//             public void mouseClicked(java.awt.event.MouseEvent evt){
//                 formMouseClicked(evt);            
//             }
//         });
//     }

//     private void formMouseClicked(java.awt.event.MouseEvent evt){ //metodo del mause
//            this.x = evt.getX();
//            this.y = evt.getY();
//            algoritmo.x = this.x;
//            algoritmo.y = this.y;
//            paintPunto(panel1.getGraphics());
//            //panel1.updateUI();
//     }//formMouseClicked
    
   
//         @Override
//     public void update(Graphics g) {
//         super.update(g);
//     }
// //----------------------------------------------------------------------------------------------------------------------
//     public void paintXY(Graphics g){ //generando panel cartesiano
//         int alto_panel1 = panel1.getHeight(); //alto
//         int ancho_panel1 = panel1.getWidth(); //ancho
//         g.drawLine(0, alto_panel1/2, ancho_panel1, alto_panel1/2);
//         g.drawLine(ancho_panel1/2, 0, ancho_panel1/2, alto_panel1);
//         //g.drawLine(50, 100, 50, 100);
//     }
// //----------------------------------------------generando funcion de crear clases pintar------------------------------------------------------------------------- g
//     public void generaClases(){
//         this.k = Integer.parseInt(identifi_vecinos.getText());
//         this.clases = Integer.parseInt(identifi_num_clases.getText());
//         this.items = Integer.parseInt(identifi_num_puntos.getText());
//         algoritmo = new Met_Knn(k,clases,items,this.x,this.y,panel1.getWidth(),panel1.getHeight());
        
//     }

//     public void printClases(){ //genera color 
//         System.out.println("Vecinos: " + algoritmo.k);
//         System.out.println("clase: " + algoritmo.clases);
//         System.out.println("Numero de puntos: " + algoritmo.items);
//         System.out.println("x: " + algoritmo.x);
//         System.out.println("y: " + algoritmo.y);
//     }
    
//     public void paintClases(Graphics g){
//         for (int i=0; i<clases;i++){
//             Color c = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
//             colores.add(c);
//             g.setColor(c);
//             for(int n=0;n<items;n++){
//                 g.fillOval(algoritmo.itemsArray.get((items*i)+n).x,algoritmo.itemsArray.get((items*i)+n).y,2,2);
//             }
//         }
//     }
//  //----------------------------------------------------------------------------------------------------------------------   
//     public void paintPunto(Graphics g){//generando color del punto apra identificar vecino
//         System.out.println("Iniciando funcion pintando puntos ");
//         if(this.x >=0 && this.y>=0){
//             g.setColor(Color.BLACK);
//             g.fillOval(this.x,this.y,5,5);
//         }
//     }

//     public void clasifica(Graphics g){//generando la clasificacion de punto y colorearlo
//         if(this.x >=0 && this.y>=0){
//             g.setColor(colores.get(algoritmo.pertenece));
//             g.fillOval(this.x,this.y,5,5);
//         }
//     }
//  //----------------------------------------------------------------------------------------------------------------------   
//     private void identifi_num_puntosActionPerformed(java.awt.event.ActionEvent evt) {
//     }

//     private void btnDateActionPerformed(java.awt.event.ActionEvent evt) {
//         algoritmo.calculaCercano();
//         //JOptionPane.showMessageDialog(this, " Pertenece a la clase: " + colores.get(algoritmo.pertenece));
//         clasifica(panel1.getGraphics());
//     }

//     private void G_panel1ActionPerformed(java.awt.event.ActionEvent evt) {
//         paintXY(panel1.getGraphics());
//         generaClases();
//         printClases();
//         paintClases(panel1.getGraphics());
//     }

//     // private void identifi_vecinosActionPerformed(java.awt.event.ActionEvent evt) {
//     // }

//     private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
//         update(this.getGraphics());
//         this.colores.clear();
//     }

//     public static void main(String args[]) {
//         try {
//             for ( UIManager.LookAndFeelInfo info :  UIManager.getInstalledLookAndFeels()) {
//                 if ("Nub".equals(info.getName())) {
//                      UIManager.setLookAndFeel(info.getClassName());
//                     break;
//                 }
//             }
//         } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |  UnsupportedLookAndFeelException ex) {
//             java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         }

//         /* Crear y mostrar el formulario */
//         java.awt.EventQueue.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 new Ventana().setVisible(true);
//             }
//         });
//     }

//     // Variables declaration - do not modify//GEN-BEGIN:variables
//     JButton btnDate;
//     JButton G_panel1;
//     JButton btnLimpiar;
//     JTextField identifi_num_clases;
//     JTextField identifi_num_puntos;
//     JTextField identifi_vecinos;
//     JLabel vecinos;
//     JLabel punt_clase;
//     JLabel clase;
//     JPanel panel1;
//     // fin de las variables declaration
// }
