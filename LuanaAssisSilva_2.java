import java.util.Scanner;
public class LuanaAssisSilva_2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número: ");
        double num = Double.parseDouble(teclado.nextLine());
        if (num%2==0){
            System.out.println(" O número é par. ");
        }
        else {
            System.out.println(" O número é ímpar. ");
        }
    }
}
