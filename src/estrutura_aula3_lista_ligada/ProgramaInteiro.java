package estrutura_aula3_lista_ligada;

import java.util.Iterator;

// parei na aula 6
public class ProgramaInteiro {
	public static void main(String[] args) {
		 ListaLigada<Integer> numeros = new ListaLigada();
		    numeros.adicionar(1);
		    numeros.adicionar(2);
		    numeros.adicionar(3);
		    numeros.adicionar(4);
		    System.out.println("Tamanho "+numeros.getTamanho() );
		    System.out.println("Primeiro "+numeros.getPrimeiro().getValor() );
		    System.out.println("Último "+numeros.getUltimo().getValor() );
		    System.out.println("Atual "+numeros.get(2).getValor() );
		    
		    for(int i = 0; i < numeros.getTamanho(); i++) {
		    	System.out.println("valores da lista: "+ numeros.get(i).getValor());
		    }
		    System.out.println("Removendo valores da lista");
		    numeros.remover(1);
		    numeros.remover(2); 
		    numeros.remover(3);
		    numeros.remover(4);


		    
		    System.out.println("Removeu estado CE");
		    for(int i = 0; i < numeros.getTamanho(); i++) {
		    	System.out.println("valores da lista: "+ numeros.get(i).getValor());
		    }
		    System.out.println("Tamanho "+numeros.getTamanho() );
		    numeros.adicionar(6);
		    System.out.println("Tamanho "+numeros.getTamanho() );
	}
  
}
