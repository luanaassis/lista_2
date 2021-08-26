import java.util.Scanner;
public class LuanaAssisSilva_19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Informe um número inteiro  de 4 dígitos: ");
        int num = Integer.parseInt(teclado.nextLine());
        String numero = new String(String.valueOf(num));
        String vetor[] = numero.split("");
        for (int i = 0; i < vetor.length; i++) {
            if (!vetor[i].equals("1") && !vetor[i].equals("0")) {
                System.out.println (" O número digitado não é da família dos binários por não se tratar apenas de 0 ou 1.");
            } else {
                System.out.println (" O número digitado é da família dos binários por se tratar apenas de 0 ou 1 .");
            }
        }
    }
}
