
package operadoresecondicionais;

public class OperadoresECondicionais {

    public static void main(String[] args) {
        final var condicao =true;
        
        if (condicao){
            System.out.println("A condição é verdadeira");
        }else{
            System.out.println("A condição é falsa");
        }
        
      //quando usamos somente o if, podemos escrever desse jeito:
      if(condicao)
            System.out.println("Uma unica linha");
      //outra forma de escrita de if
      final var ternario = condicao ? "é verdadeira" : "é falsa";
      System.out.println(ternario);
      
      //condicionais usando equals
      
      var letra ="b";
      if ("A".equals(letra)){
          System.out.println("É A!!!");
      }
      if (!letra.equals("A")){
          System.out.println("Não é A!!!");
      }
      
      //operadores matematicos
        System.out.println(1+1);
        System.out.println(1-1);
        System.out.println(1*1);
        System.out.println(8/2);
        System.out.println(9%2);
        
        float  numero = 10;
        numero = numero *2;
        System.out.println(numero);
      
       //operadores lógicos
       var opnumero = 15;
       var opletra ="A";
       //and
       if(opnumero > 5 && opletra.equals("A")){
           System.out.println("Atende a condição");
       }
       //or
        if(opnumero > 5 || opletra.equals("A")){
           System.out.println("Atende a condição");
       }
      
       
     
        
        
    }
    
}
