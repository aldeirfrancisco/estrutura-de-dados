package estrutura_aula3_lista_ligada;

public class Fila {
      private ListaLigada lista;
      
      public Fila() {
    	  lista = new ListaLigada();
      }
      
      public void adicionar(String novoValor) {
    	  lista.adicionar(novoValor);
      }
      
      public void remover() {
    	  this.lista.remover(this.get());
      }
      
      public String get() {
    	  return (String) this.lista.getPrimeiro().getValor();
      }
}
