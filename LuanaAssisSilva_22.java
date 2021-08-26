import java.util.Scanner;
public class LuanaAssisSilva_22 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Informe um número: ");
        double num1 = Double.parseDouble(teclado.nextLine());
        System.out.print(" Informe um número: ");
        double num2 = Double.parseDouble(teclado.nextLine());
        System.out.print(" Informe um número: ");
        double num3 = Double.parseDouble(teclado.nextLine());
        if ( num1>num2 && num1>num3){
            if (num2>num3){
                System.out.println(" A ordem crescente e decrescente são respectivamente: "+ num1 +" , "+ num2+" , "+num3 +" e " +num3 +" , "+num2+" , "+ num1);
            }else if (num3>num2){
                System.out.println(" A ordem crescente e decrescente são respectivamente: "+ num1 +" , "+ num3+" , "+num2 +" e " +num2+" , " +num3+" , "+ num1);
            }
        } else if ( num2>num1 && num2>num3){
            if (num1>num3){
                System.out.println(" A ordem crescente e decrescente são respectivamente: "+ num2 +" , " + num1+" , "+num3 +" e " +num3+" , " +num1+" , "+ num2);
            }else if (num3>num1){
                System.out.println(" A ordem crescente e decrescente são respectivamente: "+ num2 + num3+num1 +" e " +num1 +num3+ num2);
            }
        } else if ( num3>num1 && num3>num2){
            if( num1>num2){
                System.out.println(" A ordem crescente e decrescente são respectivamente: "+ num3 +" , "+ num1+" , "+num2 +" e " +num2 +" , "+num1+" , "+ num3);
            }if( num2>num1){
                System.out.println(" A ordem crescente e decrescente são respectivamente: "+ num3 +" , "+ num2+" , "+num1 +" e " +num1+" , " +num2+" , "+ num3);
            }
        }
        else {
            System.out.print(" Algum dos números que você digitou são iguais. ");
        }
    }
}
