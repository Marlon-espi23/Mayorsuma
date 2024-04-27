import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

         Scanner scanner = new Scanner(System.in);
        
        double[] numeros = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            numeros[i] = scanner.nextDouble();
        }
        
        double suma = sumarDosMasPequenos(numeros);
        double resta = restarDosMasGrandes(numeros);
        double mayor = encontrarMayor(numeros);
        
        System.out.println("La suma de los dos números más pequeños es: " + suma);
        System.out.println("La resta de los dos números más grandes es: " + resta);
        System.out.println("El mayor de los tres números es: " + mayor);
    }
    
    public static double sumarDosMasPequenos(double[] numeros) {
        double menor1 = numeros[0];
        double menor2 = numeros[1];
        
        for (double num : numeros) {
            if (num < menor1) {
                menor2 = menor1;
                menor1 = num;
            } else if (num < menor2) {
                menor2 = num;
            }
        }   
          
        return menor1 + menor2;
    }
    
    public static double restarDosMasGrandes(double[] numeros) {
        double mayor1 = numeros[0];
        double mayor2 = numeros[1];
        
        for (double num : numeros) {
            if (num > mayor1) {
                mayor2 = mayor1;
                mayor1 = num;
            } else if (num > mayor2) {
                mayor2 = num;
            }
        }
        
        return mayor1 - mayor2;
    }
    
    public static double encontrarMayor(double[] numeros) {
        double mayor = numeros[0];
        
        for (double num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
        }
        
        return mayor;
    }
}