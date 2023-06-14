package estrutura_aula3_lista_ligada;

import java.util.Iterator;

// parei na aula 6
public class ProgramaCliente {
	public static void main(String[] args) {
		 ListaLigada<Cliente> cliente = new ListaLigada();
		    cliente.adicionar(new Cliente("1234", "joão"));
		    cliente.adicionar(new Cliente("567", "Maria"));
		    cliente.adicionar(new Cliente("8910", "Silva"));
		  
		    System.out.println("Tamanho "+cliente.getTamanho() );
		    System.out.println("Primeiro "+cliente.getPrimeiro().getValor() );
		    System.out.println("Último "+cliente.getUltimo().getValor() );
		    System.out.println("Atual "+cliente.get(2).getValor() );
		    
		    for(int i = 0; i < cliente.getTamanho(); i++) {
		    	System.out.println("valores da lista: "+ cliente.get(i).getValor());
		    }
		    System.out.println("Removendo valores da lista");
			/*
			 * cliente.remover(1); cliente.remover(2); cliente.remover(3);
			 * cliente.remover(4);
			 * 
			 * 
			 * 
			 * System.out.println("Removeu estado CE"); for(int i = 0; i <
			 * cliente.getTamanho(); i++) { System.out.println("valores da lista: "+
			 * cliente.get(i).getValor()); }
			 * System.out.println("Tamanho "+cliente.getTamanho() ); cliente.adicionar(6);
			 * System.out.println("Tamanho "+cliente.getTamanho() );
			 */
	}
  
}
