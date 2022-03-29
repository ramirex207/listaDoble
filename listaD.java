package listaDoble;
import javax.swing.JOptionPane;

public class listaD {
	private nodoD inicio,fin;
	//constructor por defecto
	public listaD() {
		inicio=fin=null;
	}
	//constructor ordinario
	public boolean estaVacia() {
		return inicio==null;
	}
	//metodo para agregar al final
	public void agregarFinal(int dato) {
		if (!estaVacia()) {
			fin= new nodoD(dato,null,fin);
			fin.ant.sig=fin;
		}else {
			inicio=fin=new nodoD(dato);
		}
	}
	//metodo para agregar al inicio
	public void agregarInicio(int dato) {
		if (!estaVacia()) {
			inicio= new nodoD(dato,inicio,null);
			inicio.sig.ant=inicio;
		}else {
			inicio=fin=new nodoD(dato);
		}
	} 
	//metodo para mostrar lista de inicio a fin 
	public void mostrarListaInicioFin() {
		if (!estaVacia()) {
			String datos="<=>";
			nodoD aux = inicio;
			while(aux!=null) {
				datos = datos + "["+aux.dato+"]<=>";
				aux=aux.sig;
			}
			System.out.println("mostrando lista de inicio a fin"+datos);			
		}
	}
	//metodo para mostrar la lista de fin a inicio
	public void mostrarListaFinInicio() {
		if (!estaVacia()) {
			String datos="<=>";
			nodoD aux = fin;
			while(aux!=null) {
				datos = datos + "["+aux.dato+"]<=>";
				aux=aux.ant;
			}
			System.out.println("mostrando lista de fin a inicio "+datos);
		}
	}
}
