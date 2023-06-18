package estrutura_aula3_lista_ligada;

public class IteratorListaLigada<TIPO> {
   private Elemento<TIPO> elemento;
   
   public IteratorListaLigada(Elemento<TIPO> atual) {
	  this.elemento = atual;
   }

	public boolean TemPoximo() {
		   if(this.elemento.getProximo() == null) {
			   return false;
		   } else {
			   return true;
		   }
	   }
	   
	   public Elemento<TIPO> getProximo(){
		    this.elemento = this.elemento.getProximo();
		   return this.elemento;
	   }
}
