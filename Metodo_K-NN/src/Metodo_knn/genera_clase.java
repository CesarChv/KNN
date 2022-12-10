package Metodo_knn;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public final class genera_clase{
    //private int x,y;
    private int clases=1;
    //private int k=1;
    private int items=100;
    private Met_Knn algoritmo;
    private Random r; //variable random generadar
    private ArrayList<Color> colores;

    public void generaClases(){
        this.clases = Integer.parseInt(fieldClases.getText());
        this.items = Integer.parseInt(fieldItems.getText());
        //algoritmo = new Knn(k,clases,items,this.x,this.y,plano.getWidth(),plano.getHeight());
    }

    public void printClases(){ //genera color 
        System.out.println("Vecinos: " + algoritmo.k);
        System.out.println("clase: " + algoritmo.clases);
        System.out.println("Numero de puntos: " + algoritmo.items);
        System.out.println("x: " + algoritmo.x);
        System.out.println("y: " + algoritmo.y);
    }

    public void paintClases(Graphics g){
        for (int i=0; i<clases;i++){
            Color c = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
            colores.add(c);
            g.setColor(c);
            for(int n=0;n<items;n++){
                g.fillOval(algoritmo.itemsArray.get((items*i)+n).x,algoritmo.itemsArray.get((items*i)+n).y,2,2);
            }
        }
    }
    private javax.swing.JTextField fieldClases;
    private javax.swing.JTextField fieldItems;
    //private javax.swing.JTextField fieldK;
}