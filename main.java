import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("JUEGO DE PREGUNTAS");
		System.out.println("Se le hara una pregunta, conteste con la letra correcta");
		String nombre;
		System.out.println("Ingrse su nombre");
		nombre = input.next();
		int puntaje = 0;
		
		
		System.out.println("Buena suerte " + nombre + "!");
		System.out.println("Recuerda responder en mayusculas con la letra que corresponda");
		System.out.println("Primera pregunta, Cuando termino la Segunda Guerra Mundial?");
		String res1;
		System.out.println("A.1945");
		System.out.println("B.1939");
		System.out.println("C.1918");
		System.out.println("D.1948");
		res1 = input.next();
		
		if(res1.endsWith("A")) {
			puntaje += 10;
			System.out.println("Bien hecho! Ganas 10 puntos, tienes " + puntaje + " puntos");
			
		}
		else {
			puntaje -= 5;
			System.out.println("Incorrecto! La respuesta correcta era la 'A', pierdes 5 puntos, tienes " + puntaje + " puntos");
			
		}
		
		System.out.println("Segunda pregunta, Cuantos metros mide el Monte Everest?");
		String res2;
		System.out.println("A.6,587 metros");
		System.out.println("B.8,849 metros");
		System.out.println("C.7,456 metros");
		System.out.println("D.9,945 metros");
		res2 = input.next();
		if(res2.endsWith("B")) {
			puntaje += 10;
			System.out.print("Bien hecho! Ganas 10 puntos, tienes "+ puntaje + " puntos");
			
		}
		else {
			puntaje -= 5;
			System.out.println("Incorrecto! La respuesta correcta era la 'B', pierdes 5 puntos, tienes "+ puntaje + " puntos");
			
		}
		
		
		System.out.println("Tercera pregunta, Cual es el pais mas densidad poblacional del mundo?");
		String res3;
		System.out.println("A.China");
		System.out.println("B.Bangladesh");
		System.out.println("C.Singapur");
		System.out.println("D.India");
		res3 = input.next();
		if(res3.endsWith("C")) {
			puntaje += 10;
			System.out.print("Bien hecho! Ganas 10 puntos, tienes "+ puntaje + " puntos");
			
		}
		else {
			puntaje -= 5;
			System.out.println("Incorrecto! La respuesta correcta era la 'C', pierdes 5 puntos, tienes "+ puntaje + " puntos");
			
		}
		
		
		System.out.println("Cuarta pregunta, Cuantos años tiene la persona mas vieja viva?");
		String res4;
		System.out.println("A.119");
		System.out.println("B.120");
		System.out.println("C.118");
		System.out.println("D.110");
		res4 = input.next();
		if(res4.endsWith("C")) {
			puntaje += 10;
			System.out.print("Bien hecho! Ganas 10 puntos, tienes "+ puntaje + " puntos");
			
		}
		else {
			puntaje -= 5;
			System.out.println("Incorrecto! La respuesta correcta era la 'C', pierdes 5 puntos, tienes "+ puntaje + " puntos");
			
		}
		
		System.out.println("Tu puntaje final es " + puntaje);
	}

}
