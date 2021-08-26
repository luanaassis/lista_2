import java.util.Scanner;
public class LuanaAssisSilva_10 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a idade: ");
        int idade = Integer.parseInt(teclado.nextLine());
        System.out.print("Informe o peso: ");
        double peso = Double.parseDouble(teclado.nextLine());
        if (idade>=12) {
            if (peso >= 60) {
                double gotas = 1000 * 0.04;
                System.out.println(" A quantidade de gotas são : " + gotas);
            } else {
                double gotas = 875 * 0.04;
                System.out.println(" A quantidade de gotas são : " + gotas);
            }
        } else if (idade<12) {
            if (peso >=5 && peso <=9){
                double gotas = 125 * 0.04;
                System.out.println(" A quantidade de gotas são : " + gotas);
            } else if (peso >=9.1 && peso <=16){
                double gotas = 250 * 0.04;
                System.out.println(" A quantidade de gotas são : " + gotas);
            } else if (peso >=16.1 && peso <=24){
                double gotas = 375 * 0.04;
                System.out.println(" A quantidade de gotas são : " + gotas);
            }else if (peso >=24.1 && peso <=30){
                double gotas = 500 * 0.04;
                System.out.println(" A quantidade de gotas são : " + gotas);
            }else if (peso > 30){
                double gotas = 750 * 0.04;
                System.out.println(" A quantidade de gotas são : " + gotas);
            } else {
                System.out.println(" Não há indicação para este peso. ");
            }
            }
        }
    }
