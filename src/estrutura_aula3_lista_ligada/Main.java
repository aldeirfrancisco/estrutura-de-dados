package estrutura_aula3_lista_ligada;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	
	  int[] vetor = new int[1000];
	  
	  for(int i=0; i< vetor.length; i++) {
		  vetor[i] = i * 2;
		  System.out.println( vetor[i]);
	  }
	  System.out.println("Qual número vc buscar?");
	  Scanner leitor = new Scanner(System.in);
	  int buscado = leitor.nextInt();
	  
	   boolean isAchou = false;
	   int inicio = 0;
	   int fim = (vetor.length -1);
	   int meio;
	   int contador = 0;
	   while (inicio <= fim) {
			meio = (int)((inicio + fim) / 2);
			contador++;
			 if(vetor[meio] == buscado) {
				 isAchou = true;
				 break;
			 } else if(vetor[meio] < buscado) {
				 inicio = (meio + 1);
				 
			 } else {
				 fim = (meio - 1);
			 }
	}
	   System.out.println("quantidade de testes: "+ contador);
	  if(isAchou) {
		  System.out.println("achou!!!");
	  } else {
		  System.out.println("não achou!!!");	  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		/*
		 * boolean isEncontrou = false; for(int i=0; i < vetor.length; i++) {
		 * if(vetor[i] ==buscado) { isEncontrou = true; break; } else { isEncontrou =
		 * false; } } if(isEncontrou) { System.out.println("achou !!! "); } else {
		 * System.out.println("não existe!!! ");
		 * 
		 * }
		 */
}
}
