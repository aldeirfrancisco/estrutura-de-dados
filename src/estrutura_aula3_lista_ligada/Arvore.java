package estrutura_aula3_lista_ligada;

public class Arvore<T extends Comparable>  {
	   private ElementoArv<T> raiz;
	    
	    public Arvore(){
	        this.raiz = null;
	    }
	    
	    public void adicionar(T valor){
	        ElementoArv<T> novoElementoArv = new ElementoArv<T>(valor);
	        if (raiz == null){
	            this.raiz = novoElementoArv;
	        }else{
	            ElementoArv<T> atual = this.raiz;
	            while(true){
	                if (novoElementoArv.getValor().compareTo(atual.getValor()) == -1){
	                    if (atual.getEsquerda() != null){
	                        atual = atual.getEsquerda();
	                    }else{
	                        atual.setEsquerda(novoElementoArv);
	                        break;
	                    }
	                }else{ //se for maior ou igual
	                    if (atual.getDireita() != null){
	                        atual = atual.getDireita();
	                    }else{
	                        atual.setDireita(novoElementoArv);
	                        break;
	                    }
	                }
	            }
	        }
	    }

	    public ElementoArv<T> getRaiz() {
	        return raiz;
	    }
	    
	    public void emOrdem(ElementoArv<T> atual){
	        if (atual != null){
	            emOrdem(atual.getEsquerda());
	            System.out.println(atual.getValor());
	            emOrdem(atual.getDireita());
	        }        
	    }
	    
	    public void preOrdem(ElementoArv<T> atual){
	        if (atual != null){
	            System.out.println(atual.getValor());
	            preOrdem(atual.getEsquerda());            
	            preOrdem(atual.getDireita());
	        }        
	    }
	    
	    public void posOrdem(ElementoArv<T> atual){
	        if (atual != null){            
	            posOrdem(atual.getEsquerda());            
	            posOrdem(atual.getDireita());
	            System.out.println(atual.getValor());
	        }        
	    }
	    
	    public boolean remover(T valor){
	        //buscar o ElementoArv na árvore
	        ElementoArv<T> atual = this.raiz;
	        ElementoArv<T> paiAtual = null;
	        while(atual != null){
	            if (atual.getValor().equals(valor)){
	                break;                
	            }else if (valor.compareTo(atual.getValor()) == -1){ //valor procurado é menor que o atual 
	                paiAtual = atual;
	                atual = atual.getEsquerda();
	            }else{
	                paiAtual = atual;
	                atual = atual.getDireita();
	            }
	        }
	        //verifica se existe o ElementoArv
	        if (atual != null){
	            
	            //ElementoArv tem 2 filhos ou ElementoArv tem somente filho à direita
	            if (atual.getDireita() != null){
	                
	                ElementoArv<T> substituto = atual.getDireita();
	                ElementoArv<T> paiSubstituto = atual;
	                while(substituto.getEsquerda() != null){
	                    paiSubstituto = substituto;
	                    substituto = substituto.getEsquerda();
	                }
	                substituto.setEsquerda(atual.getEsquerda());
	                if (paiAtual != null){
	                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
	                        paiAtual.setEsquerda(substituto);
	                    }else{
	                        paiAtual.setDireita(substituto);
	                    }
	                }else{ //se não tem paiAtual, então é a raiz
	                    this.raiz = substituto;
	                    paiSubstituto.setEsquerda(null);
	                    this.raiz.setDireita(paiSubstituto);
	                    this.raiz.setEsquerda(atual.getEsquerda());
	                }
	                
	                //removeu o ElementoArv da árvore
	                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1){ //substituto < paiSubstituto
	                    paiSubstituto.setEsquerda(null);
	                }else{
	                    paiSubstituto.setDireita(null);
	                }
	                
	            }else if (atual.getEsquerda() != null){ //tem filho só à esquerda
	                ElementoArv<T> substituto = atual.getEsquerda();
	                ElementoArv<T> paiSubstituto = atual;
	                while(substituto.getDireita() != null){
	                    paiSubstituto = substituto;
	                    substituto = substituto.getDireita();
	                }
	                if (paiAtual != null){
	                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
	                        paiAtual.setEsquerda(substituto);
	                    }else{
	                        paiAtual.setDireita(substituto);
	                    }
	                }else{ //se for a raiz
	                    this.raiz = substituto;
	                }
	                
	                //removeu o ElementoArv da árvore
	                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1){ //substituto < paiSubstituto
	                    paiSubstituto.setEsquerda(null);
	                }else{
	                    paiSubstituto.setDireita(null);
	                }
	            }else{ //não tem filho
	                if (paiAtual != null){
	                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
	                        paiAtual.setEsquerda(null);
	                    }else{
	                        paiAtual.setDireita(null);
	                    }
	                }else{ //é a raiz
	                    this.raiz = null;
	                }
	            }
	            
	            return true;
	        }else{
	            return false;
	        }        
	    }
	}
