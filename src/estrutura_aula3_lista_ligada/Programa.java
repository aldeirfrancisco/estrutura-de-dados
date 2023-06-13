package estrutura_aula3_lista_ligada;

public class Programa {
	public static void main(String[] args) {
		 ListaLigada lista = new ListaLigada();
		    lista.adicionar("AC");
		    lista.adicionar("BA");
		    lista.adicionar("CE");
		    lista.adicionar("DF");
		    System.out.println("Tamanho "+lista.getTamanho() );
		    System.out.println("Primeiro "+lista.getPrimeiro().getValor() );
		    System.out.println("Último "+lista.getUltimo().getValor() );
	}
  
}
