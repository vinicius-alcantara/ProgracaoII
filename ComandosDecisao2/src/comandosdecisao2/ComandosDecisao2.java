package comandosdecisao2;

import java.util.Scanner;

public class ComandosDecisao2 {

    public static void main(String[] args) {
        /* Cardapio
        * 1 - Xtudo
        * 2 - Xsalada
        * 3 - Xcalabresa
        * 4 - Big Lanche Feliz
        * 5 - XIgnorância 
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Número do Itém do menu: ");
        int numLanche = teclado.nextInt();
        
        switch(numLanche){
            case 1:
                System.out.println("Xtudo");
                break;
            case 2:
                System.out.println("Xsalada");
                break;
            case 3:
                System.out.println("Xcalabresa");
                break;
            case 4:
                System.out.println("Big Lanche Feliz");
                break;
            case 5:
                System.out.println("XIgnorância");
                break;
        
        }
        
    }
    
}
