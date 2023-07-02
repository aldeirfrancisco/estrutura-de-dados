package estrutura_aula3_lista_ligada;

public class ElementoArv<T> {
  
	private T valor;
	private ElementoArv<T> esquerda;
	private ElementoArv<T> direita;
	
	public ElementoArv(T valor) {
		  this.valor = valor;
		  this.esquerda = null;
		  this.direita = null;
	}
	
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}

	public ElementoArv<T> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(ElementoArv<T> esquerda) {
		this.esquerda = esquerda;
	}

	public ElementoArv<T> getDireita() {
		return direita;
	}

	public void setDireita(ElementoArv<T> direita) {
		this.direita = direita;
	}
	
	
}
