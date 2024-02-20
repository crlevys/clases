import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame{

	private final JTextField textField1; // text field with set size
	private final JTextField textField2; // text field with text
	private final JTextField textField3; // text field with text and size
	private final JPasswordField passwordField; // password field with text

	public TextFieldFrame() {
		super("Testing JTextField and JPaswordField");
		setLayout(new FlowLayout());

		textField1 = new JTextField(10);
		add(textField1);
		textField2 = new JTextField("Enter Text Here!");
		add(textField2);
		textField3 = new JTextField("Texto no editable!", 21);
		textField3.setEditable(false);
		add(textField3);
		passwordField = new JPasswordField("Hiden Text");
		add(passwordField);

		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener(handler);
	}
	private class TextFieldHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event){
			String string="";
			if (event.getSource() == textField1)
				string = String.format("textField1: %s", event.getActionCommand());

			JOptionPane.showMessageDialog(null, string);
		}
	}
}
