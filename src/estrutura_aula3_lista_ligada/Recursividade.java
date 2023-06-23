package estrutura_aula3_lista_ligada;

import java.util.Scanner;
//aula 14;
public class Recursividade {
  public static void main(String[] args) {
	
	  int[] vetor = new int[10];
      
      for(int i=0; i < vetor.length; i++){
          vetor[i] = (int) (Math.random() * vetor.length);
      }
      
      System.out.println("<------------------->");
      for(int i=0; i < vetor.length; i++){
          System.out.println(vetor[i]);
      }
      
      
      System.out.println("Soma");
      System.out.println(somar(0, 0, vetor));
  }
  
  private static int somar(int soma, int posicao, int[] vetor){
      if (posicao < vetor.length){
          soma += vetor[posicao];
          return somar(soma, posicao+1, vetor);
      }else{
          return soma;
      }
  }
}