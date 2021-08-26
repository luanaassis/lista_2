import java.util.Scanner;
public class LuanaAssisSilva_20 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número: ");
        double num1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe um número: ");
        double num2 = Double.parseDouble(teclado.nextLine());
        if (num1%num2==0){
            System.out.println( num1 +" é múltiplo de " + num2);
        }
        else {
            System.out.println( num1 +" não é múltiplo de " + num2);
        }
    }
}

