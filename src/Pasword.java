import javax.swing.JOptionPane;

public class Pasword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String usuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
		String contraseña = JOptionPane.showInputDialog("Ingrese su contraseña:");
		// Verificar si el usuario y la contraseña son correctos
        if (usuario.equals("abimael") && contraseña.equals("12345")) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. ¡Bienvenido, " + usuario + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos. Por favor, inténtelo nuevamente.");
        }
	}
}
