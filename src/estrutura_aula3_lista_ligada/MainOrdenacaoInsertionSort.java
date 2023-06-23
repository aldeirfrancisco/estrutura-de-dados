package estrutura_aula3_lista_ligada;

import java.util.Scanner;
//aula 12;
public class MainOrdenacaoInsertionSort {
  public static void main(String[] args) {
	
	  int[] vetor = new int[10];
	  
	  for(int i=0; i< vetor.length; i++) {
		  vetor[i] = (int) (Math.random() * vetor.length);
		  System.out.println( vetor[i]);
	  }

	  int aux, j;
      for(int i = 0; i < vetor.length; i++){ 
          aux = vetor[i];
          j = i-1;
          while(j >= 0 && vetor[j] > aux) {
        	  vetor[j+1] = vetor[j];
        	  j--;
          }
          vetor[j+1] = aux;
      }
      System.out.println("<------------------------------>");
      for(int i = 0; i < vetor.length; i++){
          System.out.println(vetor[i]);
      }
      
	  
  }
}
