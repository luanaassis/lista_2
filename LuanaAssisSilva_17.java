import java.util.Scanner;
public class LuanaAssisSilva_17 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Informe um valor para a : ");
        double a = Double.parseDouble(teclado.nextLine());
        System.out.print(" Informe um valor para b : ");
        double b = Double.parseDouble(teclado.nextLine());
        System.out.print(" Informe um valor para c : ");
        double c = Double.parseDouble(teclado.nextLine());
        if ((a+b)>c && (b+c)>a && (a+c)>b ) {
            if ( a==b && a==c){
                System.out.print(" É um triângulo equilátero. ");
            } else if ( a!=b && a!=c){
                System.out.print(" É um triângulo escaleno. ");
            } else {
                System.out.print(" É um triângulo isósceles. ");
            }
        } else {
            System.out.print(" Não é um triângulo. ");
        }
    }
}
