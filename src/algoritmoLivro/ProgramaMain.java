package algoritmoLivro;

public class ProgramaMain {
   public static void main(String[] args) {
	   int[] numero = {0,45,3,5,85,4,1,65,34};
	   int[] numerosOrdenados = OrdenacaoMetodo.ordenacaoPorSelecao(numero);
	   for(int elem: numerosOrdenados) {
		   
		   System.out.println(elem);
	   }
	   
   }
}
