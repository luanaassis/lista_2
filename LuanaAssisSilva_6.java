import java.util.Scanner;
public class LuanaAssisSilva_6 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Informe um número : ");
        double a = Double.parseDouble(teclado.nextLine());
        System.out.print(" Informe um número : ");
        double b = Double.parseDouble(teclado.nextLine());
        System.out.print(" Informe a operação : ");
        String operador = teclado.nextLine();
        switch (operador) {
            case "+":
                double operacao = (a + b);
                System.out.print(" O resultado da operação é " + operacao);
                break;
            case "-":
                operacao = (a - b);
                System.out.print(" O resultado da operação é " + operacao);
                break;
            case "*":
                operacao = (a * b);
                System.out.print(" O resultado da operação é " + operacao);
                break;
            case "/":
                operacao = (a / b);
                System.out.print(" O resultado da operação é " + operacao);
                break;
            default:
                System.out.print(" Operação inválida.");
        }
    }
}
