import java.util.Scanner;
public class LuanaAssisSilva_25 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o sexo (F ou M): ");
        String sexo = teclado.nextLine();
        System.out.print("Informe a altura: ");
        double altura = Double.parseDouble(teclado.nextLine());
        if (sexo.equals("F")){
            double pesoIdeal = (62.1 * altura)-44.7;
            System.out.print(" O peso ideal é "+ pesoIdeal);
        } else if (sexo.equals("M")){
            double pesoIdeal = (72.7 * altura)-58;
            System.out.print(" O peso ideal é "+ pesoIdeal);
        } else {
            System.out.print("Algo informado não foi aceito. ");
        }
    }
}
