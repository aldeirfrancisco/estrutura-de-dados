package estrutura_aula3_lista_ligada;

import java.util.Iterator;

// parei na aula 4
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
		    System.out.println("Atual "+lista.get(2).getValor() );
		    
		    for(int i = 0; i < lista.getTamanho(); i++) {
		    	System.out.println("valores da lista: "+ lista.get(i).getValor());
		    }
		    System.out.println("Removendo valores da lista");
		    lista.remover("CE");
		    lista.remover("BA");
		    lista.remover("AC");
		    lista.remover("DF");
		    
		    System.out.println("Removeu estado CE");
		    for(int i = 0; i < lista.getTamanho(); i++) {
		    	System.out.println("valores da lista: "+ lista.get(i).getValor());
		    }
		    System.out.println("Tamanho "+lista.getTamanho() );
		    lista.adicionar("SP");
		    System.out.println("Tamanho "+lista.getTamanho() );
	}
  
}
