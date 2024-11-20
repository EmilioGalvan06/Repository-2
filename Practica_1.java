import javax.swing.JOptionPane;

//Esto es un comentario de una sola linea
/*Emilio Francisco Galvan Chavero
Fundamentos de Programación
3012*/
public class Practica_1 {//clase
    public static void main(String args[]){//motodo principal
        System.out.println("Hola mundo");
        JOptionPane.showMessageDialog(null,"Bienvenid@s");
        
        Practica_2 obj1 = new Practica_2();
        //Invocar al metodo capturarDatos
        System.out.println("Adios" + obj1.capturarDatos());
    }
}

class Practica_2{
    public String capturarDatos(){
        String nombre;
        nombre=JOptionPane.showInputDialog("Escribe tu nombre");
        return nombre;
    }
}   
        