package operadoresatribuição;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class OperadoresAtribuição {
    public static void main(String[] args) {
        // Operadores de Atribuição
        
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.ENGLISH);
        
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Altura: ");
        double altura = teclado.nextDouble();
        
        System.out.println(nome + " tem " + altura + " de altura!");
        
    }
    
}
