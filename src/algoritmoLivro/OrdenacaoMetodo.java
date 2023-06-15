package algoritmoLivro;

public class OrdenacaoMetodo {
   
	public static int[] ordenacaoPorSelecao(int[] array) {
		int[] novoArray = new int[array.length];
		int a = 1;
		int[] novoAr = array;
		 int indiceRemover = 0;
		for(int i= 0; i < array.length; i++) {
			
			int[] novoArr = new int[novoArray.length -a ];
			int index = buscarMenor(array);
			novoArray[i]= array[index];
			indiceRemover = index;
		
			 for (int j = 0; j < indiceRemover; j++) {
		            novoArr[j] = array[j];
		        }
			 for (int d = indiceRemover + 1; d < array.length; d++) {
		            novoArr[d - 1] = array[d];
		        }
			 a = 0;
       		array = novoArr;
		}
		
		return novoArray;
	}
	private static int buscarMenor(int[] array) {
		  int menor = array[0];
          int menorIndex = 0;
          for(int i = 1; i < array.length; i++ ) {
        	  if(array[i] < menor && array[i] > 0) {
        		  menor = array[i];
        		  menorIndex = i;
        	  }
          }
		return menorIndex;
	}
}

