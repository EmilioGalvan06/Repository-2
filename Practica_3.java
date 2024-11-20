//Importacion de paquetes
import javax.swing.JOptionPane;


public class Practica_3 {
    public static void main (String [] args){
        //Declarcion de variables
        byte b,h;
        float area;
        
        System.out.println("AREA DEL TRIANGULO");
        b=Byte.parseByte(JOptionPane.showInputDialog("Ingresa base"));
        h=Byte.parseByte(JOptionPane.showInputDialog("Ingresa altura"));
        area=(b*h)/2;
        System.out.println("EL AREA DEL TRIANGULO ES " + area);
    }
}
