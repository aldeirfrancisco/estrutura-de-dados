package algoritmoLivro;

public class Recursao {
   //toda funcao recursiva tem duas parte o caso base e o caso recursivo, se não tiver vai cair no lup infinito.
  public void regressiva(int num) {
	   System.out.println(num);
	    if(num <=1) {   //caso base 
	    	
	    } else {// caso recursivo
	    	regressiva(num -1);
	    }
	  
  }
  public int fatorial(int num) {
	 	if(num <=1) {   //caso base 
	    	return 1;
	    } else {// caso recursivo
	    	
	    	return num *  fatorial(num -1);
	    }
	  
 }
}

