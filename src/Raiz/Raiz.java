package Raiz;

public class Raiz {
	
	private double a;
	private double b;
	private double c;
	
	/**
	 * Ecuacion de 2º grado
	 */
	public Raiz (double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
   }
	
	  public void obtenerRaiz() {
		  
		  if(tieneRaiz()==true) {
			  leerArray1(); 
	     }else {
	    	 System.out.println("No tiene solucion");
	     }
  }
	  
	  
	  public void ObtenerRaiz() {
		  
		  if (tieneRaiz() == true) {
			  leerArray1();
		  } else if (tieneRaiz() == true) {
			  System.out.println("La ecuacuion tiene do soluciones");
			 
		  } else {
			  System.out.println("La ecuacion no tiene soluciom");
		  }
	  }
	  
	  //Una unica funcion
	  
	  public double getDiscriminsnte() {
		  
		  return (Math.pow(b, 2) - 4 * a *c);
	  }
	  
	  
	  public boolean tieneRaices()  {
		  
		  if(getDiscriminsnte()>= 0) {
			  return true;
			}
		  return false;
	  }
	  
	  public boolean tieneRaiz() {
		  
		  if(getDiscriminsnte() == 0) {
			  return true;
		  }
		  return false;
	  }
	  
	  public void calcular() {
		  if (tieneRaiz() == true) {
			  System.out.println("La ecuacion tiene una solucion");
			  leerArray1();
		  } else if (tieneRaices() == true) {
			  System.out.println("La ecucacion tiene dos soluciones");
			  leerArray1();
		  } else {
			  System.out.println("La ecuacion no tiene solucion");
			  leerArray1();
		  }
	  }
		  
	  
	  //El metode no va acer operaciones
	  
	 private double [] mates() {
		 
		 double num[] =new double[2];
		 num[0] = (-b + Math.sqrt(getDiscriminante())) /(2 * a);
		 num[1] = (-b - Math.sqrt(getDiscriminante())) /(2 * a);
		 
	    return num;
	 }
	 
	 
	 private void leerArray1() {
		 
		 double calc[] = mates();
		 if (tieneRaices() == true) {
			 System.out.println((1)+" resultado: " +calc[0]);
	 
		 } else {
			 for (int i=0; i < calc.length; i++) {
				 System.out.println((i + 1) + " resultado: " +calc[i]);

		   }
        }
     }

	double getDiscriminante() {
		// TODO Auto-generated method stub
		return (Math.pow(b, 2)- 4 * a * c);
	}
}