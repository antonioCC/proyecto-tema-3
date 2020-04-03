
public class Corte {
  
    int n=1;
    static double x (double a[],double x1,double y1,double z1)
{     return (a[3]-(a[1]*y1)-(a[2]*z1))/a[0];
}
static double y (double a[],double x1,double y1,double z1)
{      return (a[3]-(a[0]*x1)-(a[2]*z1))/a[1];
}
static double z (double a[],double x1,double y1,double z1)
{     return (a[3]-(a[1]*y1)-(a[0]*x1))/a[2];
}

       public  double [] calcularCorte(double x1,double y1, double z1,double uno[],double dos[],double tres[],int ban, int ban2,int ban3,double ea){
        double res[]=new double[3];
        double es1=1,es2=1,es3=1;
       

           while(es1>ea|es2>ea|es3>ea)
    {
        double aux1=0,aux2=0,aux3=0;
        aux1=x1; aux2=y1; aux3=z1;


         if(ban==1)
       {
      x1=redondeo(x(uno,x1,y1,z1));
        es1=Math.abs((x1-aux1)/x1);
        //System.out.println(" "+x1);


       }
       if(ban==2)
       {
     x1=redondeo(x(dos,x1,y1,z1));
        es1=Math.abs((x1-aux1)/x1);
       // System.out.println(" "+x1);

       }
        if(ban==3)
       {
      x1=redondeo(x(tres,x1,y1,z1));
        es1=Math.abs((x1-aux1)/x1);
        //System.out.println(" "+x1);
               }
        //segunda ecuacion
        if(ban2==1)
       {
        y1=redondeo(y(uno,x1,y1,z1));
        es2=Math.abs((y1-aux2)/y1);
        //System.out.println(" "+y1);

       }
       if(ban2==2)
       {
       y1=redondeo(y(dos,x1,y1,z1));
        es2=Math.abs((y1-aux2)/y1);
       // System.out.println(" "+y1);

       }
        if(ban2==3)
       {
        y1=redondeo(y(tres,x1,y1,z1));
        es2=Math.abs((y1-aux2)/y1);
        //System.out.println(" "+y1);

       }
        //tercera ecuacion

       if(ban3==1)
       {
        z1=redondeo(z(uno,x1,y1,z1));
        es3=Math.abs((z1-aux3)/z1);
        //System.out.println(" "+z1);

       }
       if(ban3==2)
       {
         z1=redondeo(z(dos,x1,y1,z1));
        es3=Math.abs((z1-aux3)/z1);
        //System.out.println(" "+z1);

       }
        if(ban3==3)
       {
        z1=redondeo(z(tres,x1,y1,z1));
        es3=Math.abs((z1-aux3)/z1);
        //System.out.println(" "+z1);

       }
       
//hasta aqui para saber que mandar
         tabla.ven0(n, n, 0);
        tabla.ven0(x1, n, 1);
        tabla.ven0(y1, n, 2);
        tabla.ven0(z1, n, 3);
        tabla.ven0(es1, n, 4);
        tabla.ven0(es2, n, 5);
        tabla.ven0(es3, n, 6);
        n++;
        //System.out.println("\n"+n+" "+x1+" "+y1+" "+" "+z1);
      
        res[0]=x1;
        res[1]=y1;
        res[2]=z1;
           }//fin del while
          
                return res;
       }

//simple metodo para redondear los valores
double redondeo(double xx)
{

return (Math.rint(xx*100000))/100000;
}
}
