import java.util.Scanner;
public class LuanaAssisSilva_8 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o salário : ");
        double salario = Double.parseDouble(teclado.nextLine());
        if ( salario   < 700) {
            double nSalario = salario + (salario * 0.3);
            System.out.print(" O novo salário é " + nSalario);
        } else if ( salario  >= 700) {
            double nSalario = salario + (salario * 0.1);
            System.out.print(" O novo salário é " + nSalario);
        }
    }
}
