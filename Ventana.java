import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class Ventana extends JFrame{

	public Ventana() {
		setSize(500, 500);//definir tamaño de ventana
		setLocationRelativeTo(null);//establacer la ventana en el centro(cuando se use null)
		setTitle("JUEGO DE PREGUNTAS");//definir titulo de la ventana
		this.getContentPane().setBackground(Color.gray);//definir color para la ventana
		
		iniciarComponentes();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//terminar programa al cerrar la ventana
	}
	
	private void iniciarComponentes() {
		JPanel panel = new JPanel();//crear panel
		panel.setBackground(Color.white);//establecer color del panel
		this.getContentPane().add(panel);//agregar panel a la ventana
		JLabel etiqueta = new JLabel();//Crear etiqueta con texto
		etiqueta.setText("JUEGO DE PREGUNTAS");//definimos el texto para la etiqueta
		panel.add(etiqueta);
	}

}
