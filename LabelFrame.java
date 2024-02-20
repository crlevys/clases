import java.awt.FlowLayout; // especifica cómo se van a ordenar los componentes
import javax.swing.JFrame; // proporciona las características básicas de una ventana
import javax.swing.JLabel; // muestra texto e imágenes
import javax.swing.SwingConstants; // constantes comunes utilizadas con Swing
import javax.swing.Icon; // interfaz utilizada para manipular imágenes
import javax.swing.ImageIcon; // carga las imágenes

public class LabelFrame  extends JFrame {
	private JLabel etiqueta1;
	private JLabel etiqueta2; //JLabel construida con tex     add( etiqueta1 );to y un icono
        private JLabel etiqueta3; //JLabel con texto adicional e icono
	public LabelFrame(){
		super("Prueba de JLabel");
		setLayout(new FlowLayout() );
		
		etiqueta1 = new JLabel("CAmbio este texto");
		etiqueta1.setToolTipText( "Esta es una etiqueta" );
		add( etiqueta1 );

		// Constructor de JLabel con argumentos de cadena, Icono y alineación
	      Icon insecto = new ImageIcon( getClass().getResource( "bug1.gif" ) );
	      etiqueta2 = new JLabel( "Etiqueta con texto e icono", insecto,
              SwingConstants.LEFT );
              etiqueta2.setToolTipText( "Esta es etiqueta2" );
              add( etiqueta2 ); // agrega etiqueta2 a JFrame

              etiqueta3 = new JLabel(); // Constructor de JLabel sin argumentos
              etiqueta3.setText( "Etiqueta con icono y texto en la parte inferior" );
              etiqueta3.setIcon( insecto ); // agrega icono a JLabel
              etiqueta3.setHorizontalTextPosition( SwingConstants.CENTER );
              etiqueta3.setVerticalTextPosition( SwingConstants.BOTTOM );
              etiqueta3.setToolTipText( "Esta es etiqueta3" );
              add( etiqueta3 ); // agrega etiqueta3 a JFrame
	}
}
