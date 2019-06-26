package operadoreslógicos;
public class OperadoresLógicos {

    public static void main(String[] args) {
        // && (E), || (OU), ^ (OU EXCLUSIVO), ! (NÃO)
        
        String nome = "Josiane";
        boolean bonita = false;
        boolean inteligente = false;
        
        if(!bonita == true && !inteligente == true){
            System.out.println("VERDADEIRO");
        } else {
            System.out.println("FALSO");
        }
        
    }
    
}
