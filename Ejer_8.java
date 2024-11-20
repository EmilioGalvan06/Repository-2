import javax.swing.JOptionPane;
        
public class Ejer_8 {
    public static void main(String[]args){
       
        byte a, b,c, d;
        
        System.out.println("Bievenid@ a veterinaria Patitas Peludas");
        System.out.println("Descuentos");
        
        a=Byte.parseByte(JOptionPane.showInputDialog("1.- Perro \n 2.- Gato \n 3.- Conejo \n 4.- Cuyo"));
        
       
        
        switch(a){
            case 1 -> {
                System.out.println("El costo de la esterilzación de perrito será de $400");
            }
              
            case 2 -> {
                System.out.println("El costo de la esterilización de gatito será de $468");
            }
            case 3 -> {
                System.out.println("El costo de la esterilización de conejos será de $175");   
            }
            case 4 -> {
                System.out.println("El costo de la esterilización de cuyos será de $80");
            }
            default -> System.out.println("Lo sentimos, solo hay descuentos para esas 4 mascotas");
}
    }
    
}
        
                 
        
        
    

        
    