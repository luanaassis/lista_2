import java.util.Scanner;
public class LuanaAssisSilva_1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número: ");
        double num = Double.parseDouble(teclado.nextLine());
        if (num > 0){
            System.out.println(" O número é positivo. ");
        }
        else if (num < 0){
            System.out.println(" O número é negativo. ");
        }
        else {
            System.out.println(" O número é igual a zero. ");
        }
    }
}
