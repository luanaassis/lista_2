import java.util.Scanner;
public class LuanaAssisSilva_7 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um caractere: ");
        String caractere = teclado.nextLine();
        String minusculo = caractere.toLowerCase();
        if ( minusculo.equals("a") || minusculo.equals("e") || minusculo.equals("i") || minusculo.equals("o") || minusculo.equals("u")) {
            System.out.println(" O caractere é uma  vogal. ");
        } else  {
            System.out.println(" O caractere não é uma  vogal. ");
        }
    }
}
