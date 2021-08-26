import java.util.Scanner;
public class LuanaAssisSilva_11 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor para X : ");
        double x = Double.parseDouble(teclado.nextLine());
        if ( x <= 1){
            double f = 1;
            System.out.println(" O valor de f(x) é " + f );
        } else if ( x > 1 && x <= 2 ){
            double f = 2;
            System.out.println(" O valor de f(x) é " + f );
        } else if ( x > 2 && x <= 3 ) {
            double f = x * x;
            System.out.println(" O valor de f(x) é " + f );
        } else {
            double f = x*x*x;
            System.out.println(" O valor de f(x) é " + f );
        }
    }
}
