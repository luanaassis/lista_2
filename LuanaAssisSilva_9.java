import java.util.Scanner;
public class LuanaAssisSilva_9 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Informe o ano de fabricação do carro : ");
        double anoFabricacao = Double.parseDouble(teclado.nextLine());
        System.out.print(" Informe o valor do carro : ");
        double valor = Double.parseDouble(teclado.nextLine());
        double imposto;
        if (anoFabricacao < 1990) {
            imposto = valor * 0.01;
        } else {
            imposto = valor * 0.015;
        }
        System.out.println(" O imposto a ser pago é de: " + imposto);
    }
}
