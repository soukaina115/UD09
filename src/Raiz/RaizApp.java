package Raiz;

public abstract class RaizApp {
      public static void main(String[] args) {
    	  
    	  Raiz raices1 = new Raiz (-1, 7, -10);
    	  Raiz raices2 = new Raiz (-1, 0, -10);
    	  Raiz raices3 = new Raiz (1, -2, 1);
    	  
    	  
    	  //La ecuació te 2 solucions
    	  System.out.println("Pruebas 1r objecto");
    	  raices1.obtenerRaiz();
    	  raices2.obtenerRaiz();
    	  raices3.calcular();
    	  System.out.println(raices1.getDiscriminante());
    	  
    	  //La ecuació no te solucio
    	  System.out.println("\n\nPruebas 2n objeto.");
    	  raices2.obtenerRaiz();
    	  raices2.calcular();
    	  System.out.println(raices2.getDiscriminante());
    	  
    	  //La ecuacuió te una soluio
    	  System.out.println("\n\nPruebas 3r objeto.");
    	  raices3.obtenerRaiz();
    	  raices3.obtenerRaiz();
    	  raices3.calcular();
    	  System.out.println(raices3.getDiscriminante());
    	 

      
     }
}
    	  
    	 