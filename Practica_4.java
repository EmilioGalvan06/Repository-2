import javax.swing.JOptionPane;

public class Practica_4 {
    public static void main (String [] args){
        byte prom;
        
        System.out.println("BECAS");
        prom=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu promedio"));
        if(prom>=95){
            //si
            System.out.println("Aplica para beca");
        }
        else{
            //no
            System.out.println("Espera la siguente convocatoria");  
        }
             
    }
    
}
