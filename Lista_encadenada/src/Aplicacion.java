
public class Aplicacion {

	public static void main(String[] args) {
		
		SlinkedList lista_e= new SlinkedList();
		lista_e.insertarAlFrente("Miguel");
		lista_e.insertarAlFrente("Dario");
		lista_e.insertarAlFrente("Daniel");
		lista_e.insertarAlFinal("David");
		lista_e.insertarAlFinal("Pamela");
		
		
	System.out.println(lista_e.toString());
	String elemABuscar="Dario";	
	
	if(lista_e.buscarElemento(elemABuscar)==null){
		System.out.println("No existe el elemento en la lista");
		}else{
			System.out.println(lista_e.buscarElemento(elemABuscar).toString());
	}}

}
