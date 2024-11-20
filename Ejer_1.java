import javax.swing.JOptionPane;

public class Ejer_1{
  public static void main(String[] args) {
      int a;
      int b;
  
  a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor: "));
 
  b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
   
  if (a > b) {
  System.out.println("El primer valor es mayor: " + a);
  } else if (b > a) {
  System.out.println("El segundo valor es mayor: " + b);
  } else {
  System.out.println("Ambos valores son iguales: " + a);
  }
  }
}