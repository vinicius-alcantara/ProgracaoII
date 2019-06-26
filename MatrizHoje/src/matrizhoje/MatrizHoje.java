
package matrizhoje;

import java.util.Scanner;

public class MatrizHoje {

    public static void main(String[] args) {
        // Estancia um objeto para receber entrada de dados
        Scanner teclado = new Scanner(System.in);
        // Instancia um array para guardar os nomes dos alunos
        String nomeAluno[] = new String[3];
        // Instancia uma matriz para gurdar as notas dos alunos
        double notasAluno[][] = new double[4][4];
        //Recebe a soma das notas dos alunos
        double soma;
        // Solicitando e guardado dados do usuário
        for(int c = 0; c <=2; c++){
            System.out.print("Nome do " + (c+1) + "° Aluno: ");
            nomeAluno[c] = teclado.next();
       
            for(int cc = 0; cc < notasAluno.length; cc++){
                System.out.print("Digite a " + (cc+1) + "° nota do aluno " + nomeAluno[c] + ": ");
                notasAluno[c][cc] = teclado.nextDouble();
            }
                System.out.println("####################################################");
        }
        
            for(int ii = 0; ii <= 2; ii++){
                System.out.print(nomeAluno[ii] + ": ");
                soma = 0;
                for(int jj = 0; jj < notasAluno[ii].length; jj++) {
                    //System.out.print(notasAluno[ii][jj] + " "); //Mostra as notas
                    
                    soma += notasAluno[ii][jj]; 
                                   
                }
                    if(soma / 4 >=7 && soma / 4 <= 10){
                    
                        System.out.println("Aprovado");
                    
                    } else if(soma / 4 < 7 && soma / 4 >= 5){
                        
                        System.out.println("Prova Final");
                    
                    } else if(soma / 4 < 5 && soma / 4 >= 3){
                        
                        System.out.println("Recuperação");
                        
                    } else {
                        System.out.println("Reprovado");
                    }
                    //System.out.print(soma/4); //Mostra a média
                    System.out.println();
            }
       
    }
    
}
