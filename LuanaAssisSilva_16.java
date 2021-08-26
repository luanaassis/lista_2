import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class LuanaAssisSilva_16 {
    public static void main(String args[]) throws ParseException {
        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Informe a data do voto: ");
        Date dataVoto = formato.parse(teclado.nextLine());
        System.out.print("Informe a data de nascimento: ");
        Date dataNascimento = formato.parse(teclado.nextLine());
        long diferenca = (TimeUnit.DAYS.convert((dataVoto.getTime() - dataNascimento.getTime()), TimeUnit.MILLISECONDS)) / 360;
        if ( diferenca < 16){
            System.out.print(" Não vota. ");
        } else if (diferenca >= 16 && diferenca < 18 || diferenca > 70 ){
            System.out.print(" Facultativo. ");
        } else {
            System.out.print(" Obrigatório. ");
        }
    }
}
