
package funcaoaltaordem;
//@author Nathan Tagino

public class FuncaoAltaOrdem {
    interface Calculo{
        public int calcular(int a,int b);
    }
     private static int executarOperacao (Calculo calculo,int a,int b){
        return calculo.calcular(a,b);
     }
    public static void main(String[] args) {
       Calculo soma = (a,b) -> a+b;
       Calculo subtracao = (a,b) -> a-b;
       Calculo divisao = (a,b) -> a/b;
       Calculo multiplicacao =(a,b) -> a*b;
       System.out.println("Soma: " + executarOperacao(soma,3,4));
       System.out.println("Subtração: " + executarOperacao(subtracao,3,4));
       System.out.println("Divisão: " + executarOperacao(divisao,3,4));
       System.out.println("Multiplicação: " + executarOperacao(multiplicacao,3,4));
    }  
}
