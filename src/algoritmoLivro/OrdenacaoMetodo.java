package algoritmoLivro;

public class OrdenacaoMetodo {
   
	public static int[] ordenacaoPorSelecao(int[] array) {
		int[] novoArray = new int[array.length];
	
		for(int i= 0; i < array.length; i++) {
			int index = buscarIndexMenorNumero(array,i);
			trocarElementos(array, i, index);
			
		}
		for (int i = 0; i < array.length - 1; i++) {
            int indiceMenor = i;

            indiceMenor = buscarIndexMenorNumero(array,i);
 
            if (indiceMenor != i) {
                trocarElementos(array, i, indiceMenor);
            }
        }
		return array;
	}
	private static int buscarIndexMenorNumero(int[] array, int index) {
		  int menor = array[index];
          int menorIndex = index;
          for(int i = index; i < array.length; i++ ) {
        	  if(array[i] < menor ) {
        		  menor = array[i];
        		  menorIndex = i;
        		  break;
        	  }
          }
		return menorIndex;
	}
	
	 private static void trocarElementos(int[] array, int indiceA, int indiceB) {
	        int temp = array[indiceA];
	        array[indiceA] = array[indiceB];
	        array[indiceB] = temp;
	    }
}

