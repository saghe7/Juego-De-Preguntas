import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("JUEGO DE PREGUNTAS");
		String nombre;
		//Nombre de Usuario
		System.out.println("Ingrse su nombre: ");
		nombre = input.next();
		int puntaje = 0;
		
		
		System.out.println("Buena suerte " + nombre + "!");
		System.out.println("Recuerda responder en mayusculas con la letra que corresponda");
		
		//Primera pregunta
		System.out.println("Primera pregunta, Cuando termino la Segunda Guerra Mundial?");
		String res1;
		System.out.println("A.1945");
		System.out.println("B.1939");
		System.out.println("C.1918");
		System.out.println("D.1948");
		res1 = input.next();
		
		if(res1.equalsIgnoreCase("A")) {
			puntaje += 10;
			System.out.println("Bien hecho! Ganas 10 puntos, tienes " + puntaje + " puntos");
			
		}
		else {
			puntaje -= 5;
			System.out.println("Incorrecto! La respuesta correcta era la 'A', pierdes 5 puntos, tienes " + puntaje + " puntos");
			
		}
		
		
		//Segunda pregunta
		System.out.println("Segunda pregunta, Cuantos metros mide el Monte Everest?");
		String res2;
		System.out.println("A.6,587 metros");
		System.out.println("B.8,849 metros");
		System.out.println("C.7,456 metros");
		System.out.println("D.9,945 metros");
		res2 = input.next();
		if(res2.equalsIgnoreCase("B")) {
			puntaje += 10;
			System.out.println("Bien hecho! Ganas 10 puntos, tienes "+ puntaje + " puntos");
			
		}
		else {
			puntaje -= 5;
			System.out.println("Incorrecto! La respuesta correcta era la 'B', pierdes 5 puntos, tienes "+ puntaje + " puntos");
			
		}
		
		
		//Tercera pregunta
		System.out.println("Tercera pregunta, Cual es el pais mas densidad poblacional del mundo?");
		String res3;
		System.out.println("A.China");
		System.out.println("B.Bangladesh");
		System.out.println("C.Singapur");
		System.out.println("D.India");
		res3 = input.next();
		if(res3.equalsIgnoreCase("C")) {
			puntaje += 10;
			System.out.println("Bien hecho! Ganas 10 puntos, tienes "+ puntaje + " puntos");
			
		}
		else {
			puntaje -= 5;
			System.out.println("Incorrecto! La respuesta correcta era la 'C', pierdes 5 puntos, tienes "+ puntaje + " puntos");
			
		}
		
		
		//Cuarta pregunta
		System.out.println("Cuarta pregunta, Cuantos años tiene la persona mas vieja viva?");
		String res4;
		System.out.println("A.119");
		System.out.println("B.120");
		System.out.println("C.118");
		System.out.println("D.110");
		res4 = input.next();
		if(res4.equalsIgnoreCase("C")) {
			puntaje += 10;
			System.out.println("Bien hecho! Ganas 10 puntos, tienes "+ puntaje + " puntos");
			
		}
		else {
			puntaje -= 5;
			System.out.println("Incorrecto! La respuesta correcta era la 'C', pierdes 5 puntos, tienes "+ puntaje + " puntos");
			
		}
		
		System.out.println("Tu puntaje final es " + puntaje + ", se agregara a la base de datos");
		//se añade el puntaje a la "base de datos(archivo .txt)"
		try {
			FileWriter Write = new FileWriter("C:\\Users..."/*Ruta del archivo de puntajes*/, true/*para que no borre y escriba sobre lo que ya este escrito en el archivo*/);
			Write.write("\n" + "Nombre: " + nombre + " Puntaje: " + puntaje);
			Write.close();
		} catch (Exception e) {
			System.out.println("error al agregar el nombre a la base de datos");
		}
		//Se muestran los puntajes anteriores
		try {
			BufferedReader Reader = new BufferedReader(new FileReader("C:\\Users..."/*Ruta del archivo de puntajes*/));
			System.out.println("Puntajes anteriores: \n");
			String line;
			while ((line = Reader.readLine()) != null) {
				System.out.println(line);
				
			}
			
			Reader.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
