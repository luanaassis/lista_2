import java.util.Scanner;
public class LuanaAssisSilva_5 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o custo de fábrica do veículo : ");
        double custoF = Double.parseDouble(teclado.nextLine());
        if ( custoF < 28000){
            double custoC = custoF + (custoF * 0.05);
            System.out.println(" O custo ao consumidor é " + custoC);
        }
        else if (28000 <= custoF && custoF <= 45000 ){
            double custoC = custoF + (custoF * 0.1) + (custoF * 0.15);
            System.out.println(" O custo ao consumidor é " + custoC);
        }
        else {
            double custoC = custoF + (custoF * 0.15) + (custoF * 0.2);
            System.out.println(" O custo ao consumidor é " + custoC);
        }
    }
}
