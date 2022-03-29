package listaDoble;

public class nodoD {
	public int dato;
	nodoD sig, ant;
	//constructor por defecto
	public nodoD(int d) {
		dato=d;
		sig=null;
		ant=null;
	}
	//constructor ordinario
	public nodoD(int d, nodoD s, nodoD a) {
		dato=d;
		sig=s;
		ant=a;
	}
}
