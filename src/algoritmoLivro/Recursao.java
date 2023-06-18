package algoritmoLivro;

public class Recursao {
   //toda funcao recursiva tem duas parte o caso base e o caso recurivo, se não tiver vair cair no lup infinito.
  public void regressiva(int num) {
	   System.out.println(num);
	    if(num <=1) {   //caso base 
	    	
	    } else {// caso re
	    	regressiva(num -1);
	    }
	  
  }
}

