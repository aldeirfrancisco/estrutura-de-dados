package algoritmoLivro;

public class RecursaoSoma {
   //toda funcao recursiva tem duas parte o caso base e o caso recursivo, se não tiver vai cair no lup infinito.
	public static int somar(int soma, int posicao, int[] vetor){
	      if (posicao < vetor.length){
	          soma += vetor[posicao];
	          return somar(soma, posicao+1, vetor);
	      }else{
	          return soma;
	      }
	  }
 
}

