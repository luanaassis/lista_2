import java.util.Scanner;
public class LuanaAssisSilva_13 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o peso : ");
        double peso = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe a altura : ");
        double altura = Double.parseDouble(teclado.nextLine());
        double  imc = peso/ (altura*altura);
        if ( imc < 18.5){
            System.out.println(" Abaixo do peso. ");
        } else if (imc >= 18.5 &&  imc < 25){
            System.out.println(" Peso normal. ");
        } else if (imc >= 25 &&  imc <= 30){
            System.out.println(" Acima do peso. ");
        }else if (imc >30){
            System.out.println(" Obeso. ");
        } else {
            System.out.println(" Não se encaixa nos critérios");
        }
    }
}
