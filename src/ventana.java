import javax.swing.*;
import java.awt.*;
class VentanaPrincipal extends JFrame{
	
	public VentanaPrincipal() {
		
		getContentPane().getLayout();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		setLocationRelativeTo(null);
		setTitle("LayoutNulo");
		setVisible(true);
		
		// Crear un nuevo marco (ventana)
        JFrame frame = new JFrame("Registro");
        
        // Establecer el tamaño del marco
        frame.setSize(300, 200);
        
        // Establecer el diseño como null
        frame.setLayout(null);
        
        // Crear y configurar un campo de texto
        JTextField textField = new JTextField();
        textField.setBounds(50, 20, 150, 25); // Establecer posición y tamaño
        
        // Añadir el campo de texto al marco
        frame.add(textField);
        
        // Crear y configurar un botón
        JButton button = new JButton("Guardar");
        button.setBounds(100, 50, 100, 30); // Establecer posición y tamaño
        
        // Añadir el botón al marco
        frame.add(button);
        
        // Crear y configurar una etiqueta
        JLabel label = new JLabel("Estado:");
        label.setBounds(20, 90, 80, 25); // Establecer posición y tamaño
        
        // Añadir la etiqueta al marco
        frame.add(label);
        
        // Hacer visible el marco
        frame.setVisible(true);
		
		
			}
	
}
public class ventana {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new VentanaPrincipal();
			}
		}
		);

	}

}
