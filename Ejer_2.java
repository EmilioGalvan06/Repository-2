import javax.swing.JOptionPane;

public class Ejer_2{
public static void main (String [] args){

    int A, B, C;
  A=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
  B=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
  C=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer valor"));
    if (A > B){
        if(A > C){
            System.out.println("El mayor es: " +A);
        }else{
            System.out.println("El mayor es: " +C);
        }
    }else if (B > C){
        System.out.println("El mayor es: " +B);
    }else{
        System.out.println("El mayor es: " +C);
        }
        }
    }


    
                                    
                   
        
       

