import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
	public static void main(String ... args) throws VaciaException, IOException {

		ListaDoble lista = new ListaDoble();
		ListaDoble lista2 = new ListaDoble();
		ListaDoble resultado = new ListaDoble();
		FileReader Datos;

		File output = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
				
		
		Scanner scanner;
		int digito;
		int digito2;

		try{

			Datos = new FileReader("Input.txt");
			scanner = new Scanner(Datos);
			scanner.useDelimiter("");
			while(scanner.hasNextInt()) {
				digito = scanner.nextInt();
				lista.InsertarFinal(digito);
			
			}
			
			scanner.nextLine();
			while(scanner.hasNextInt()){
				digito2 = scanner.nextInt();
				lista2.InsertarFinal(digito2);
			}
		
			
			lista.mostrar();
			System.out.println("");
			lista2.mostrar();
		}catch(FileNotFoundException e){
			e.printStackTrace();   

		}
		
		 lista.ListaMayor(lista, lista2);
		lista.Suma(lista, lista2);        
		lista.Resta(lista, lista2);
		lista.Multiplicacion(lista, lista2);

	}

}

