import java.util.Scanner;
public class LuanaAssisSilva_21 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Informe o ano : ");
        int ano = Integer.parseInt(teclado.nextLine());
        if (ano>0){
            if(ano%4==0 && (ano%100!=0 || ano%400 ==0)){
                System.out.println(" O ano é bissexto. ");
            } else {
                System.out.println(" O ano não é bissexto. ");
            }
        } else{
            System.out.print(" Informe um ano válido. ");
        }
    }
}
