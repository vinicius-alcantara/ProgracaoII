package comandodecisao;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ComandoDecisao {

    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.ENGLISH);
        
        System.out.print("Nome: ");
        String nomeAluno = teclado.nextLine();
        
        System.out.print("Noata1: ");
        double nota1 = teclado.nextDouble();
        
        System.out.print("Noata2: ");
        double nota2 = teclado.nextDouble();
        
        double mediaNotas = (nota1 + nota2) / 2;
        
        if(mediaNotas >=7 && mediaNotas <= 10){
            System.out.println("A média do aluno é: " + df.format(mediaNotas) + " e está aprovado");
        } else if(mediaNotas < 7 && mediaNotas >= 5) {
            System.out.println("A média do aluno é: " + df.format(mediaNotas) + 
                    " e está de prova final");
        } else if(mediaNotas < 5 && mediaNotas >= 3){
            System.out.println("A média do aluno é: " + df.format(mediaNotas) + 
                    " e está de recuperação");
        } else if(mediaNotas < 3){
            System.out.println("A média do aluno é: " + df.format(mediaNotas) + 
                    " e está reprovado");
        }
        
        
        
    }
    
}
