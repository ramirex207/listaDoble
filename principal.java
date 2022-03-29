package listaDoble;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listaD lisD= new listaD();
		int dato;
		Scanner leer = new Scanner(System.in);
		int op;
		do {
        System.out.println("****************OPERACIONES CON UNA LISTA ENLAZADA DOBLE**************************\n\n");
        System.out.println("**********************************************************");
        System.out.println("1. agregar nodo al inicio");
        System.out.println("2. agregar nodo al final");
        System.out.println("3. mostrar lista de inicio a fin");
        System.out.println("4. mostrar lista de fin a inicio");
        System.out.println("0. Salir");
        System.out.println("***********************************************************");
        op = leer.nextInt();
	        switch(op) {
			case 1:
				 System.out.println("ingresa un numero");
				 dato=leer.nextInt();
				 lisD.agregarInicio(dato);
				break; 
			case 2:	
				System.out.println("ingresa un numero");
				dato=leer.nextInt();
				lisD.agregarFinal(dato);
				break;
			case 3:
				if(!lisD.estaVacia()) {
					lisD.mostrarListaInicioFin();
				}
				else {
					System.out.println("la lista esta vacia");	
				}
				break;
			case 4:
				if(!lisD.estaVacia()) {
					lisD.mostrarListaFinInicio();
				}
				else {
					System.out.println("la lista esta vacia");	
				}
				break;
	        }
	        
		}while (op!=0); 
	}

}
