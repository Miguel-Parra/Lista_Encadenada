
public class Nodo {
	
	private String elemento;
	private Nodo siguiente;
	
	
	public Nodo (String e){
		this.elemento= e;
		this.siguiente=null;
		}
	
	
	public Nodo(String e, Nodo n) {
		this.elemento = e;
		this.siguiente = n;
	}

	public String getElemento() {
		return elemento;
	}

	

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	@Override
	public String toString() {
		return "Elemento: " + elemento + " siguiente nodo --> " + siguiente;
	}


	
	
	
	
	
	

}
