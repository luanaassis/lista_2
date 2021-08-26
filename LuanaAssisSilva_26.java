import java.awt.geom.RoundRectangle2D;
import java.util.Scanner;
public class LuanaAssisSilva_26 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Informe o salário base : ");
        double salarioB = Double.parseDouble(teclado.nextLine());
        System.out.print(" Informe o tempo de serviço em anos: ");
        int tempo = Integer.parseInt(teclado.nextLine());
        int gratif = 0;
        double imposto = 0;
        String categoria = "";
        if (salarioB<200){
             imposto = 0;
        } else if (salarioB>=200 && salarioB<=450){
             imposto = (salarioB*0.03);
        } else if (salarioB>450 && salarioB<700){
             imposto = (salarioB*0.08);
        } else if (salarioB>=700){
             imposto = (salarioB*0.12);
        }
        if (salarioB>500){
            if (tempo <=3){
                 gratif = 20;
            }else {
                 gratif = 30;
            }
        } else if (salarioB<=500){
            if (tempo <3){
                 gratif = 23;
            }else if (tempo>=3 && tempo<=6){
                 gratif = 35;
            } else{
                 gratif = 33;
            }
        }
        double salarioL = salarioB - imposto + gratif;
        if(salarioL<350){
             categoria = "A";
        } else if (salarioL>=350 && salarioL<=600){
            categoria = "B";
        } else{
            categoria = "C";
        }
        System.out.println(" O  imposto é de "+imposto+", e a gratificação é de " +gratif+", o salário líquido é de "+ salarioL+",e a  categoria é "+ categoria);
    }
}