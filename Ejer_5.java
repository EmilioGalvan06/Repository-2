import javax.swing.JOptionPane;

public class Ejer_5 {
    public static void main(String[]args){
        float R;
        float volumen;
	float H;		
        float area;
        
        R=Float.parseFloat(JOptionPane.showInputDialog("Digita el radio del cilindro"));
        H=Float.parseFloat(JOptionPane.showInputDialog("Digita la altura del cilindro"));
        
        area = (float) (2*(Math.PI)*(R*H));
        volumen = (float) ((Math.PI)*(Math.pow(R,2)*H));
        
        System.out.println("El area del cilindro es: " +area+"Cm^2");
        System.out.println("El volumen del cilindro es: " +volumen+"Cm^3");
        
        
        
    }
    
    
    
}
