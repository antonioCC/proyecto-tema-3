
/**
 *
 * @author amton
 */
public class jacobi {
    
    
    
    
    public static double[] Jacobi1(double[][] A, double [] b, double t, int iter, double[] x0){
	int n = A.length;
        int l = A[0].length;
        if(n!=l){
        	System.out.println("A no es una matriz cuadrada.");
            	return new double[0];
        }else{
            	double[] x = new double[n];
            	double aux;
            	int cont=0;
            	double E= t+1;
            	while(E>t && cont<=iter){
                	E=0;
                	for(int i=0;i<n;i++){
                		double suma=0;
                    		for (int j=0;j<n; j++){
                        		if (i!=j){
                            			suma=suma+A[i][j]*x0[j];
                        		}
                    		}
                    		x[i] = (b[i] - suma)/A[i][i];
                    		aux = x[i]-x0[i];
                    		E = E + Math.pow(aux,2);
                	}
                	E=Math.pow(E,0.5);
                	for (int i=0;i<n;i++){
                    		x0[i] = x[i];
                	}
                	cont=cont++;
            	}
            	if(E<t){
                	return x;
            	}else{
                	System.out.println("no se llegó a la solución en "+iter+" iteraciones");
                	return new double[0];
            	}
    	}
}
    
    /*public static void main(String[] args) {
        double [][]A={{10,3,1},{5,-10,3},{1,3,10}};
        double []b={14,-5,14};
        double error=0.0001;
        int ite=16;
        double []x0={0,0,0};
        
        double resul[];
    
    
        jacobi a = new jacobi();
        //a.Jacobi1(double A[][],double b[],double error,int ite,double x0[]);
        resul=a.Jacobi1(A,b,error,ite,x0);
        
        if (resul.length!=0){
            for(int x=0;x<3;x++){
              System.out.println(resul[x]+", ");
            }  
        }
        
        
        
    }*/
}
