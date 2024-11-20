import javax.swing.JOptionPane;
public class CicloIMC {
    public static void main (String [] args){
        float peso,estatura,imc;
        byte resp=1;
        
        do{
        peso=Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu peso"));
        estatura=Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu estatura en formato de metros"));
        imc=(peso/ (estatura*estatura));
        
         JOptionPane.showMessageDialog(null, "El indice de masa corporal es: "+imc);
         
         if(imc<18.49){
             System.out.println("PESO BAJO");
             
         }else if(imc>=18.50 && imc<=24.99){
             System.out.println("PESO NORMAL");
             
         }else if(imc>=25 &&imc<=29.99){
             System.out.println("SOBREPESO");
             
         }else if(imc>=30 && imc<=34.99){
             System.out.println("OBESIDAD GRADO 1");
             
         }else if(imc>=35 && imc<=39.99){
             System.out.println("OBESIDAD GRADO 2");
             
         }else
             System.out.println("OBESIDAD MORBIDA");
   
        
    resp=Byte.parseByte(JOptionPane.showInputDialog("Escribe 1 si deseas realizar un nuevo calculo"));
} while(resp==1);

    }
}


