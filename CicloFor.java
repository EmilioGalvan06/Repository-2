import javax.swing.JOptionPane;
public class CicloFor {
    public static void main(String[]args){
        int alumno;
        float c1,c2,c3,c4,c5,prom;
        System.out.println("Calculadora de promedios con for");
        for(alumno=1;alumno<=34;alumno++){
            System.out.println("Alumno no.: "+(alumno));
            c1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificación del primer parcial"));
            c2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificación del segundo parcial"));
            c3=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificación del tercer parcial"));
            c4=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificación del cuarto parcial"));
            c5=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificación del quinto parcial"));
            prom=(c1+c2+c3+c4+c5)/5;
            System.out.println("Tu promedio es: "+prom);
        }
    }
    
}