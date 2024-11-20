import javax.swing.JOptionPane;

public class Ejer_7 {
    public static void main(String[]args){
        int C;
        
        C=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu calificación"));
        if(C==19|| C==20){
        System.out.println("Tu nota es A");
    }else{
            if(C>=16&&C<=18){
                System.out.println("Tu nota es B");
            }else{
                if(C>=13&&C<=15){
                    System.out.println("Tu nota es C");
                }else{
                    if(C>=10&&C<=12){
                        System.out.println("Tu nota es D");
                    }else{
                        if(C>=1&&C<=9){
                            System.out.println("Tu nota es E");
                        }
                        else{
                            System.out.println("Fuera de rango(0-20)");
                        }
                    }
                        
                }
            }
            
        }
    }
    
    
}
