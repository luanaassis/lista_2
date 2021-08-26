import java.util.Scanner;
import static java.lang.Math.sqrt;
public class LuanaAssisSilva_4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Informe um valor para a : ");
        double a = Double.parseDouble(teclado.nextLine());
        System.out.print(" Informe um valor para b : ");
        double b = Double.parseDouble(teclado.nextLine());
        System.out.print(" Informe um valor para c : ");
        double c = Double.parseDouble(teclado.nextLine());
        if ( a == 0)  {
            System.out.print("Não é uma equação do segundo grau. ");
            if (b == 0) {
                System.out.print("Não é uma equação do primeiro grau. ");
            } else {
                double r = (-c) / b;
                System.out.print(" O resultado é: " + r);
            }
        } else {
            double d = (b*b) - (4*a*c);
            if (d<0){
                System.out.print(" Não há raízes reais. ");
            } else {
                double r1 = (-b - sqrt(d))/(2*a);
                double r2 = (-b + sqrt(d))/(2*a);
                System.out.print("As raízes da equação são: " + r1 +" e "+ r2);
            }
        }
    }
}
