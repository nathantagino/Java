
package tiposprimitivos;
//o java por padrão não possui entrada de dados, precisamos importar o pacote:
import java.util.Scanner;


public class TiposPrimitivos {

    public static void main(String[] args) {
     //precisamos criar um objeto para entrada dos dados
     //System.in identifica a entrada padrão, no caso o teclado.
     Scanner teclado = new Scanner(System.in);
     // antes da entrada do nome, vamos exibir uma mensagem.
     System.out.println("Por Favor digite o nome do aluno");
     // nextLine le o tipo string
     String nome = teclado.nextLine();
     System.out.println("Por favor digite a nota do Aluno");
     //nextFloat le o tipo float
     float nota = teclado.nextFloat();
     //outros tipos: nextInt(),nextFloat, etc...
     //primeira forma de saida:
     System.out.println("A nota é: " + nota);
     //saida com formatação, \n pula linha
     System.out.printf("Sua nota é %f \n", nota);
     //saida com formatação para duas casas decimais
     System.out.printf("A nota de %s é %.2f \n", nome,nota);
     //outra forma de escrever a saida com formatação
     System.out.format("A nota de %s é %.2f \n", nome,nota);
    }
    
}
