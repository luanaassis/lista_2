import java.util.Scanner;
public class LuanaAssisSilva_14 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o diâmetro: ");
        double d = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe a  carga: ");
        double q = Double.parseDouble(teclado.nextLine());
        if (d>100){
            double s = (4*q/Math.PI * Math.pow(d, 2) * 2);
            System.out.print(" A tensão é de : " + s);
        }  else if (d < 50) {
            double s = (4*q/Math.PI * Math.pow(d, 2) * 6);
            System.out.print(" A tensão é de : " + s);
        } else {
            double s = (4*q/Math.PI * Math.pow(d, 2) * 4);
            System.out.print(" A tensão é de : " + s);
        }
    }
}
