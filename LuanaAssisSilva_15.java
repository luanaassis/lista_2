import java.util.Scanner;
import java.util.Date;
public class LuanaAssisSilva_15 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe uma data: ");
        String data1 = (teclado.nextLine());
        System.out.print("Informe uma data: ");
        String data2 = (teclado.nextLine());
        Date d1 = new Date(data1);
        Date d2 = new Date(data2);
        if (d1.after(d2)){
            System.out.print(" A primeira data é maior. ");
        } else {
            System.out.print(" A segunda data é maior. ");
        }
    }
}
