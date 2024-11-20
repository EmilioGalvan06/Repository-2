import javax.swing.JOptionPane;

public class Ejer_4 {
   
     public static void main(String [] args) {
        double C1,C2;
        // Pedir al usuario los valores de los catetos
       C1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del cateto a"));
       C2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del cateto b"));
        

        // Calcular la hipotenusa usando el teorema de Pitágoras
        double hipotenusa = Math.sqrt(Math.pow(C1, 2) + Math.pow(C2, 2));

        // Mostrar el resultado al usuario
        System.out.println("La hipotenusa del triángulo es: " + hipotenusa);
    }
}
   