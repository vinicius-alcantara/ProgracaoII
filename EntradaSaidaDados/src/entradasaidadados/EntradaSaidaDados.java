package entradasaidadados;

import java.util.Locale;
import java.util.Scanner;


public class EntradaSaidaDados {
    public static void main(String[] args) {
        // Entrada de Dados
        
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.ENGLISH);
       
        
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Idade: ");
        int idade = teclado.nextInt();
        
        System.out.print("Altura: ");
        double altura = teclado.nextDouble();
        
        
        
        System.out.println(nome + " tem " + idade + " anos de idade e " + altura + " de altura!");
        
    }
    
}
