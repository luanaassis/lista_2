import java.util.Scanner;
public class LuanaAssisSilva_24 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Informe o código de entrada do produto : ");
        int codigo = Integer.parseInt(teclado.nextLine());
        System.out.print(" Informe a quantidade do produto : ");
        int qtd = Integer.parseInt(teclado.nextLine());
        int  a = 0,  b = 0, c=0 , d=0;
        if (qtd>0) {
            if (codigo >= 1 && codigo <= 10) {
                 a = 10;
                 b = qtd *10;
            }
            else if (codigo >= 11 && codigo <= 20) {
                 a = 20;
                 b = qtd *20;
            } else if (codigo >= 21 && codigo <= 30) {
                 a = 30;
                 b = qtd *30;
            } else if (codigo >= 31 && codigo <= 40) {
                 a = 40;
                 b = qtd *40;
            }
        } else {
            System.out.println(" Informe uma quantidade válida para o produto. ");
        }
        if (b<250){
           c = (int) (b * 0.05);
           d= b - c;
        }else if (b>=250 && b<=500){
            c = (int) (b * 0.1);
            d= b - c;
        }else if (b>=500) {
            c = (int) (b * 0.15);
            d = b - c;
        }
        System.out.println("O preço unitário é "+a+", o preço total da nota é: "+b+", o valor do desconto é "+c+", e o preço final é "+d);
    }
}