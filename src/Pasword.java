import javax.swing.JOptionPane;

public class Pasword {

	public static void main(String[] args) {
		 // Obtener la contraseña del usuario utilizando JOptionPane
        String password = JOptionPane.showInputDialog(null, "Ingrese la contraseña:");

        // Obtener la letra objetivo utilizando JOptionPane
        String letraObjetivoInput = JOptionPane.showInputDialog(null, "Ingrese la letra objetivo:");
        char letraObjetivo = letraObjetivoInput.charAt(0);

        // Convertir la contraseña a un arreglo de caracteres
        char[] arregloPassword = password.toCharArray();

        // Verificar si la letra objetivo está presente en el arreglo
        boolean letraEncontrada = false;
        for (char A : arregloPassword) {
            if (A== letraObjetivo) {
                letraEncontrada = true;
                break;
            }
        }

        // Mostrar el resultado utilizando JOptionPane
        if (letraEncontrada) {
            JOptionPane.showMessageDialog(null, "La contraseña contiene la letra objetivo.");
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña no contiene la letra objetivo.");
        }
    }
}