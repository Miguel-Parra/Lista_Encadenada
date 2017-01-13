
public class SlinkedList {
	
	protected Nodo cabeza;
	protected long tama�o;
	
	
	public SlinkedList(){
		cabeza=null;
		tama�o=0;
	}
	
	public boolean estaVacia(){
		return cabeza==null;
	}
	
	
	
	public void insertarAlFrente(String nombre){
		if (estaVacia()){
		cabeza= new Nodo(nombre);
		tama�o+=1;
		}else{
		cabeza= new Nodo(nombre,cabeza);	
		tama�o+=1;
		}
		
	}
	
	
	
public void insertarAlFinal(String n){
	if (estaVacia()){
		cabeza= new Nodo(n);
		tama�o+=1;
	}else{
	Nodo m;
	Nodo q=null;
	m=cabeza;
	while(m!=null){
		q=m;
		m=m.getSiguiente();	
	}
	m=new Nodo(n);
	q.setSiguiente(m);
	tama�o+=1;
	}}	

public Nodo buscarElemento(String busqueda){
	Nodo a;
	for(a=cabeza;a!=null;a=a.getSiguiente()){
		if (busqueda.compareToIgnoreCase(a.getElemento())==0){
		return a;	
		}}
	return null;
	}
	
	

@Override
public String toString() {
	String salida="";
	if(estaVacia()){
		salida="La lista esta vacia";
	}else{
	salida= "La lista tiene los siguientes datos:\n";
	Nodo n= cabeza;
	while(n !=null){
		salida+=n.getElemento()+"\n";
		n=n.getSiguiente();
	}}
	return salida+"tama�o= "+tama�o;
		
	}
			
}