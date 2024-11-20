public class CicloTablasdeMultiplicar {
   public static void main(String[]args){
       
      int multiplicando,multiplicador,producto;
      
for(multiplicando=1;multiplicando<=10;multiplicando++){
    System.out.println("Tabla de multiplicar de: "+ multiplicando);
    
    for (multiplicador=1;multiplicador<=10;multiplicador++){
        producto=multiplicando*multiplicador;
        System.out.println(multiplicando + "x" +  multiplicador + "="+ producto);
    }
    System.out.println();
        }
}
}


