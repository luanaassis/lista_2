import java.util.Scanner;
public class LuanaAssisSilva_12 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Informe a idade do atleta : ");
        int idade = Integer.parseInt(teclado.nextLine());
        if (idade>=5 && idade<=7){
            System.out.println(" A  categoria do atleta é INFANTIL ");
        } else if (idade>=8 && idade<=10){
            System.out.println(" A  categoria do atleta é JUVENIL ");
        }else if (idade>=11 && idade<=15){
            System.out.println(" A  categoria do atleta é ADOLESCENTE ");
        }else if (idade>=16 && idade<=40){
            System.out.println(" A  categoria do atleta é ADULTO ");
        }else if (idade>40){
            System.out.println(" A  categoria do atleta é SÊNIOR ");
        } else {
            System.out.println(" Não há categoria para esta idade. ");
        }
    }
}
