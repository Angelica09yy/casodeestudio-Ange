/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.de.estudio1;

import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class CasoDeEstudio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menuPrincipal();

    }

    public static void menuPrincipal() {
        int opcion = 0;

        while (opcion != 4) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu pricnipal\n"
                    + "1. Verificar la edad de unna persona\n"
                    + "2. Calcular factorial\n"
                    + "3. Calcular monto total de un credito\n"
                    + "4. Salir\n\n"
                    + "Digite una opcion:"
            ));

            switch (opcion) {
                case 1:{
                    Persona persona1 = new Persona();
                }
                    break;
                case 2:
                    int num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero positivo: "));
                    calcularFactorial(num);
                    break;
                case 3:
                    credito credito1 = new credito();
                    credito1.tomarDatos();
                    credito1.mostrarDatos();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");

            }
        }
    }

    public static void calcularFactorial(int n) {
        if (n <= 0) {
            JOptionPane.showMessageDialog(null, "El número no es entero positivo");
            return;
        }

        int factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }

        JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + factorial);
    }
}
