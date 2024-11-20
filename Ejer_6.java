import javax.swing.JOptionPane;
        
public class Ejer_6 {
    public static void main(String[]args){
        int N;
        
        N=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
        System.out.println(N);
        if(N%2 == 0)
        {
            System.out.println("ES PAR");
        }
        else
        {
            System.out.println("ES IMPAR");
        }
    }
    
}
