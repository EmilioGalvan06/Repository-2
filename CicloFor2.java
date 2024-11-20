import javax.swing.JOptionPane;
public class CicloFor2 {
    public static void main (String[]args){
        byte x, num,resp;
        int  fact;
        do{
            fact=1;
            //calculo del factorial
        num=Byte.parseByte(JOptionPane.showInputDialog("Ingresa un número"));
        for(x=num; x>=1;x--){
            fact*=x;
        }
            System.out.println("El factorial de " + num + " es: " +fact);
            resp=Byte.parseByte(JOptionPane.showInputDialog("Presiona 1 si deseas realizar un nuevo calculo"));
        }while (resp==1);
        
    }
}
