import javax.swing.JOptionPane;

public class pasword {

	public static void main(String[] args) {
	

		  String password = JOptionPane.showInputDialog(null, "Ingrese la contraseña:");
		  String letraObjetivoInput = JOptionPane.showInputDialog(null, "Ingrese la letra objetivo:");
		  char letraObjetivo = letraObjetivoInput.charAt(0);
	}

}
