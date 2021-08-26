import java.util.Scanner;
public class LuanaAssisSilva_3 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Informe um número: ");
        double num1 = Double.parseDouble(teclado.nextLine());
        System.out.print(" Informe um número: ");
        double num2 = Double.parseDouble(teclado.nextLine());
        if (num1 > num2) {
            double quadrado = Math.pow(num2, 2);
            if (num1 >= 0) {
                double raiz = Math.sqrt(num1);
                System.out.println( "Os resultados são: " + raiz + ", e, " + quadrado);
            } else {
                System.out.println( "Não há raiz real do maior número, e o quadrado do menor é , " + quadrado);
            }
        } else if ( num2 > num1) {
            double quadrado = Math.pow(num1, 2);
            if (num2 >= 0) {
                double raiz = Math.sqrt(num2);
                System.out.println( "Os resultados são: " + raiz + ", e, " + quadrado);
            } else {
                System.out.println("Não há raiz real do maior número, e o quadrado do menor é , " + quadrado);
            }
        } else {
            System.out.println(" Os números têm valores iguais.");
        }
    }
}
