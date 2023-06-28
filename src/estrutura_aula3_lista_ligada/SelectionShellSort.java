package estrutura_aula3_lista_ligada;

import java.util.Scanner;
//aula 19;
public class SelectionShellSort {
  public static void main(String[] args) {
	
	  int[] vetor = new int[10];
      
      for(int i=0; i < vetor.length; i++){
          vetor[i] = (int) (Math.random() * vetor.length);
      }
      
      System.out.println("<------------------->");
      for(int i=0; i < vetor.length; i++){
          System.out.println(vetor[i]);
      }
      
      int h = 1;
      int n = vetor.length;
      while(h < n){
          h = h * 3 + 1;
      }
      
      int elemento, j;
      while(h > 0){
          for(int i = h; i < n; i++){
              elemento = vetor[i];
              j = i;
              while(j >= h && vetor[j - h] > elemento){
                  vetor[j] = vetor[j - h];
                  j = j - h;
              }
              vetor[j] = elemento;
          }
          h = h / 2;
      }
      
      System.out.println("Vetor ordenado");
      for(int i=0; i < vetor.length; i++){
          System.out.println(vetor[i]);
      }
  }
}
