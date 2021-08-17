
package Strings;
 //@author Nathan Tagino

public class Main {
    public static void main(String[] args) {
       var nome ="Nathan";
       var sobreNome ="Tagino";
       final var nomeCompleto = nome + sobreNome;
       
       System.out.println(nome);
       System.out.println("Nome do cliente: "+ nome);
       System.out.println("Nome completo do cliente: "+nomeCompleto);
       //outra forma de trabalhar com strings:
       var string = " Minha String ";
       // a variável string dentro do pacote java lang possui metodos.
       // os principais são:
       System.out.println("Char da posicao: " + string.charAt(5));
       System.out.println("Quantidade de caracteres: " + string.length());
       //quantidade de caractes inclui os espaços vazios
       System.out.println("sem trim ["+string+"]");
       System.out.println("Coom trim ["+string.trim()+"]");
       //metodo trim é responsável por tirar espaços em branco antes e depois da string
       System.out.println("Lower: "+string.toLowerCase());
       System.out.println("Upper: "+string.toUpperCase());
       //métodos para deixar uma palavra inteiramente com letras minusculas/maiusculas
       System.out.println("Contem M?"+string.contains("M"));
       System.out.println("Contem M?"+string.contains("X"));
       //métodos usados pra saber se a palabra contém uma determinada letra.
       System.out.println("Replace" + string.replaceAll("n","%"));
       //método usado para substituir uma letra por outra
       System.out.println("Equals?" + string.equals(" Minha String "));
       System.out.println("EqualsIgnoreCase?" + string.equalsIgnoreCase(" Minha sTrIng "));
       //usado pra saber se o conteudo do da string eh igual
       //ignore case ve se é igual mesmo se for maiusculo e minusculo
       System.out.println("Substring(1,6) : " + string.substring(1,6));
       //retorna apernas uma parte da variavel string
       
        
        
       
       
    }
    
}
