import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.PrintWriter;

public class ListaDoble {
	public NodoDoble inicio;

	public ListaDoble (){
		inicio =  null;

	}
	private File archivo;
	private FileWriter Fw;
	private BufferedWriter Bw;
	private PrintWriter Pw;

	public boolean vacia(){

		return inicio==null;
	}

	public void ListaMayor (ListaDoble lista ,ListaDoble lista2){		
		ListaDoble mayor=null;
		ListaDoble mayor2=null;		
		NodoDoble aux1 = lista.inicio;
		NodoDoble aux2 = lista2.inicio;
		int contador1=0;
		int contador2=0;

		while(aux1.getSiguiente() != null){
			aux1=aux1.getSiguiente();
			contador1++;}
		while(aux2.getSiguiente()!= null){
			aux2=aux2.getSiguiente();	
			contador2++;
		}
		if (contador1 > contador2){
			System.out.println("");

		}else if(contador1== contador2){
			if(aux1.getDato()==aux2.getDato()){
				System.out.println("");
				System.out.print(" la listas son iguales");	
			}
		}else{
			System.out.println("");
		}
		while(aux1.getDato() == aux2.getDato()&& aux1.getSiguiente()!= null){	
			if(aux1.getSiguiente()!= null && aux2.getSiguiente() != null){
				aux1= aux1.getSiguiente();
				aux2= aux2.getSiguiente();	
			}	
		}
		if (aux1.getDato() == aux2.getDato()) {
			System.out.println("");
			System.out.print("las listas tienen los mismos valores");
		}else{
			if(aux1.getDato()> aux2.getDato()){	
				System.out.println("");
				System.out.print("la lista mayor es la numero:");
				System.out.print("1");
				lista = mayor;	
			}else{	
				System.out.println("");
				System.out.print("la lista mayor es la numero:");		
				System.out.print("2");
				lista2= mayor2;
			}
		}
	}
	public boolean ListaMayor2 (ListaDoble lista ){		

		NodoDoble aux1 = lista.inicio;
		NodoDoble aux2 = this.inicio;
		int contador1=0;
		int contador2=0;	

		while(aux1.getSiguiente() != null){
			aux1=aux1.getSiguiente();		
			contador1++;}
		while(aux2.getSiguiente()!= null){
			aux2=aux2.getSiguiente();			
			contador2++;}		
		while(aux1.getDato() == aux2.getDato()&& aux1.getSiguiente()!= null){	
			if(aux1.getSiguiente()!= null && aux2.getSiguiente() != null){
				aux1= aux1.getSiguiente();
				aux2= aux2.getSiguiente();	
			}	
		}

		if (aux1.getDato() == aux2.getDato()) {
			System.out.println("son iguales");
			return false;
		}else{
			if(aux1.getDato()> aux2.getDato()){	
				System.out.println("1");
				return false;
			}else{	
				System.out.println("2");
				return true;
			}
		}
	}
	public void InsertarInicio(int elemento){
		NodoDoble nuevo = new NodoDoble(elemento);
		if (inicio == null){
			inicio = nuevo;
		}else{
			nuevo.setSiguiente(inicio);
			inicio.setAnterior(nuevo);
			inicio = nuevo;
		}
	}	
	public void InsertarFinal(int elemento){

		NodoDoble nuevo = new NodoDoble(elemento);
		if (inicio == null){
			inicio = nuevo;
		}else{
			NodoDoble aux = inicio;
			while(aux.getSiguiente()!= null){
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			nuevo.setAnterior(aux);
		}
	}			

	public void Suma(ListaDoble lista,ListaDoble lista2){

		int  suma = 0;

		ListaDoble resultado = new ListaDoble();

		NodoDoble aux = null;
		NodoDoble aux1 = lista.inicio;
		NodoDoble aux2 = lista2.inicio;	
		int contador1=1;
		int contador2=1;
		lista.InsertarInicio(0);
		lista2.InsertarInicio(0);

		while(aux1.getSiguiente() != null){
			aux1=aux1.getSiguiente();
			contador1++;}
		while(aux2.getSiguiente()!= null){
			aux2=aux2.getSiguiente();	
			contador2++;
		}

		lista2.InsertarInicio(0);
		lista2.InsertarInicio(0);

		System.out.println("");
		System.out.println("nodos en  lista 1: "+contador1);
		System.out.println("nodos en lista 2: "+contador2);

		aux = resultado.inicio;	

		int diferencia = contador1-contador2;
		diferencia= diferencia*-1;
		System.out.println("diferencia de nodos en lista: "+diferencia);
		System.out.println("suma:");


		if(contador1>contador2){	
			for(int i=0; i>=diferencia; i++){
				lista.InsertarInicio(0);
			}
		}else{
			if(contador2>contador1){
				for(int j=0; j>=diferencia; j++){
					lista2.InsertarInicio(0);
				}
			}
		}	

		lista.InsertarInicio(0);
		lista.InsertarInicio(0);
		lista2.InsertarInicio(0);
		lista2.InsertarInicio(0);

		while(aux1 != null ){
			suma=aux2.getDato() + aux1.getDato();
			if(suma>=10){
				suma = suma-10;
				resultado.InsertarInicio(suma);		
				aux1=aux1.getAnterior();
				aux2=aux2.getAnterior();
				suma=aux2.getDato() + aux1.getDato();
				if(suma>=10){
					suma= suma-10;
					resultado.InsertarInicio(suma+1);
				}else{
					suma= suma+1;
					if(suma>=10){
						suma= suma-10;		
					}					
					resultado.InsertarInicio(suma);
					if(aux1.getAnterior().getDato() == 0 ){
						resultado.InsertarInicio(1);
					}
					aux1=aux1.getAnterior();
					aux2=aux2.getAnterior();
				}
			}else{
				resultado.InsertarInicio(suma);	
				aux1=aux1.getAnterior();
				aux2=aux2.getAnterior();
				if(suma>=10){
					resultado.InsertarInicio(1);
				}
			}
		}
		resultado.mostrarDA();
	}

	public void Resta(ListaDoble lista,ListaDoble lista2){

		int  resta = 0;
		ListaDoble resultado = new ListaDoble();	
		NodoDoble aux1 = lista.inicio;
		NodoDoble aux2 = lista2.inicio;	
		int contadorres1=1;
		int contadorres2=1;

		while(aux1.getSiguiente() != null){
			aux1=aux1.getSiguiente();
			contadorres1++;}
		while(aux2.getSiguiente()!= null){
			aux2=aux2.getSiguiente();	
			contadorres2++;
		}
		int diferencia = 0;
		diferencia= contadorres1 - contadorres2;
		System.out.println("");
		
		System.out.println("");
		System.out.println("nodos en lista 1: "+contadorres1);
		System.out.println("nodos en lista 2: "+contadorres2);
		System.out.print("diferencia de nodos : "+ diferencia);
		

		while(aux1 != null ){
			resta= aux2.getDato() - aux1.getDato();				
			resultado.InsertarInicio(resta*-1);
			
			if(aux2.getAnterior()== null){				
					lista2.InsertarInicio(0);
					aux1= aux1.getAnterior();
					aux2= aux2.getAnterior();
					System.out.println("");
					System.out.print("Nodo insertado");		
			}else{
				aux1= aux1.getAnterior();
				aux2= aux2.getAnterior();
				}				
			}
		System.out.println("Resta:");	
		System.out.println("");
		resultado.mostrarDA();
	}	
	public void Multiplicacion(ListaDoble lista,ListaDoble lista2){

		int multiplicacion = 0;
		ListaDoble resul1 = new ListaDoble();
	
		NodoDoble aux1 = lista.inicio;
		NodoDoble aux2 = lista2.inicio;


		while(aux1.getSiguiente() != null){
			aux1=aux1.getSiguiente();
		}
		while(aux2.getSiguiente()!= null){
			aux2=aux2.getSiguiente();				
		}
		System.out.println("");

		while(aux1 != null && aux2 != null){		
			multiplicacion = aux1.getDato()*aux2.getDato();
			
			resul1.InsertarInicio(multiplicacion);
			aux1 = aux1.getAnterior();	
		}
		aux2= aux2.getAnterior();
		
		resul1.mostrarDA();
		System.out.println("");
		System.out.println("multiplicacion:");	
	
		resul1.mostrarDA();
		
	}    

	public int mostrarDA(){
		NodoDoble aux = this.inicio;
		NodoDoble ant = null;

		while (aux != null){
			System.out.print("");
			System.out.print(" <--["+ aux.getDato()+"]--> ");
			ant = aux;
			aux = aux.getSiguiente();
		}
		return 0;
	}	
	public boolean mostrar() {
		if(this.inicio==null)
			return false;
		else{
			NodoDoble aux = this.inicio;
			while(aux != null) {
				System.out.printf(" <--[%d]--> ", aux.getDato());
				aux = aux.getSiguiente();
			}
		}
		return false;	
	}
}