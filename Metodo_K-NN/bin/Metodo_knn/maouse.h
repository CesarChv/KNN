import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public final class maouse {
    private int x,y;
    private Knn algoritmo;
    private ArrayList<Color> colores;

    private void initComponents2(){ //generando funcion de mause
        colores = new ArrayList<>();
        plano.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt){
                formMouseClicked(evt);            
            }
        });
                
    }
    
    private void formMouseClicked(java.awt.event.MouseEvent evt){ //metodo del mause
           this.x = evt.getX();
           this.y = evt.getY();
           algoritmo.x = this.x;
           algoritmo.y = this.y;
           paintPunto(plano.getGraphics());
           //plano.updateUI();
    }//formMouseClicked
    

}