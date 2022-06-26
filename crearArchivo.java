//Este programa lo saque del video https://www.youtube.com/watch?v=2ZjjRR5R7T8

import java.io.File;


public class crearArchivo {

	public static void main(String[] args) {
		File myFile = new File("Puntajes.txt");
		try {
			if (myFile.createNewFile()) {
				System.out.println(myFile.getAbsolutePath());//devuelve la ruta en donde se creo el archivo
			
				
			}
			else {
				System.out.println("error error error ");
			}
			
		} catch (Exception e) {
			
		}

	}

}
