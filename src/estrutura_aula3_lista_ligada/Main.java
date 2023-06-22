package estrutura_aula3_lista_ligada;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	
	  int[] vetor = new int[8];
	  
	  for(int i=0; i< vetor.length; i++) {
		  vetor[i] = (int) (Math.random() * 10);
	  }
	  System.out.println("Qual número vc buscar?");
	  Scanner leitor = new Scanner(System.in);
	  int buscado = leitor.nextInt();
	  boolean isEncontrou = false;
	  for(int i=0; i < vetor.length; i++) {
		  if(vetor[i] ==buscado) {
			  isEncontrou = true;
		    break;
		  } else  {
			  isEncontrou = false;
		  }
	  }
	  if(isEncontrou) {
		  System.out.println("achou !!! ");
	  } else  {
		  System.out.println("não existe!!! ");
		  
	  }
}
}
