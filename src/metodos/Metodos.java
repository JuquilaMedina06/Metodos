/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

/**
 *
 * @author juqui
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String correo1="tics666kofioriloco@gmail.com";
        String correo2="demonslayer@hotmail.com";
        
        System.out.println("¿Es un correo de gmail?" + ValidacionCorreo.esGmail(correo1));
        System.out.println("¿Es un correo de gmail?" + ValidacionCorreo.esGmail(correo2));
        
        double radio=20;
        System.out.println("El area del circulo es " + CalculoArea.calcularAreaCirculo(radio));
        
        //prueba contador vocales
        System.out.println("Vocales en 'Hola mundo': " + ContadorVocales.contadorVocales("Hola mundo"));
        
        System.out.println("7 es numero primo?" + NumeroPrimo.esPrimo(7));
        
        System.out.println("10 es numero primo?" + NumeroPrimo.esPrimo(10));
        
        System.out.println("125 mminutos son: " + ConversorTiempo.convertirMinutos(125));
    }
    
    public class ValidacionCorreo{
        public static boolean esGmail(String correo){
            return correo.toLowerCase().endsWith("@gmail.com");
            /*toLowerCase() nos ayuda a convertir a minuscula,
             * endsWith dice kare q no sabe para q sirve
             */
        }
        
    }
        
       public class CalculoArea{
           public static double calcularAreaCirculo(double radio){
               return Math.PI*Math.pow(radio,2);
           }
       }
       
       public class ContadorVocales{
           public static int contadorVocales(String palabra){
               int contador=0;
               palabra=palabra.toLowerCase();
               for(char c: palabra.toCharArray()){
                   if("aeiou".indexOf(c) != -1){
                       contador++;
                   }
               }
               return contador;
           }
       }
       
       public class NumeroPrimo{
           public static boolean esPrimo(int numero){
               if (numero<2)return false;
               for(int i=2;i<=Math.sqrt(numero);i++){
                   if (numero%i==0)return false;
               }
               return true;
           }
       }
       
       public class ConversorTiempo{
           public static String convertirMinutos (int minutos){
               int horas=minutos/60;
               int minutosRestantes = minutos%60;
               return horas+ "horas" + minutosRestantes + "minutos";
           }
       }
}
