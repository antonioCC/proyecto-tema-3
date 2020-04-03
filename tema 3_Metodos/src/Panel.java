
import java.awt.*;
import javax.swing.*;
public class Panel extends JPanel {
    public Panel()
    {
    setVisible(true);
    setSize(550,480);
    }

public void paint(Graphics g)
    {
    super.paint(g);
    g.drawImage(Imagenes.cargaImagen("ayuda.jpg"),0,0,this);
    g.setColor(new Color(100,0,255));
     setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
    g.drawString("Paso 1:Iniciar los valores con los que comenzara el metodo  ", 10, 90);
    g.drawString("el programa por defecto comenzara con X=0, Y=0, Z=0", 10,110);
    g.drawString("Paso 2: Inserta Es como error aproximado a alcanzar", 10, 170);
       g.drawString("Paso 3: Inserta la ecuacion de la forma AX+BY+CZ=D", 10, 230);
          g.drawString("Paso 4: Click en el icono de la calculadora y listo", 10, 290);
              g.drawString("resultado en la tabla", 10, 310);

               g.setColor(Color.RED);
                g.drawString("nota :*puede introducir las ecuaciones en la forma que quiera", 10, 390);
                 g.drawString("el programa se encargara de ordenarlo, respete los signos", 10, 410);
                 g.drawString("el + es solo para comservarlos", 10,430);



    }
public static void main(String aa[])
{ Panel a=new Panel();
}
}
