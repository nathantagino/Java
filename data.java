package datas;
//Primeiro passo: importar o pacote Date para manipulação de datas
import java.util.Date;
//Segundo passo: importar o pacote instant para a marcação temporal
import java.time.Instant;
import java.util.Calendar;

public class Datas {

    public static void main(String[] args) {
        //Exemplo número 1: Mostra a data atual
        Date atualData = new Date();
        System.out.println("Data e hora atual: " + atualData);
        //Exemplo número 2: Testaremos com base no System.currentTimeMillis()
        //Esse método estático retorna o milissegundo mais próximo usando o S.O
        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Usando currentTime Millis: " + currentTimeMillis);
        Date novaData = new Date(currentTimeMillis);
        System.out.println("Data e hora com base no S.O: " + novaData+"\n \n");
        System.out.println("Agora trabalharemos com métodos: \n \n ");
        
        //Uso  de métodos:
        //Exemplo 2: Antes e Depois
        System.out.println("Usando métodos para a comparação entre datas: \n ");
        System.out.println("Exemplo1: ");
        Date dataNoPassado = new Date(1513124807691L);
        System.out.println("A primeira data: " + dataNoPassado);
        Date dataNoFuturo = new Date(1613124807691L);
        System.out.println("A segunda data: " + dataNoFuturo);
        //Usaremos o metodo before pra saber se a primeira data é anterior
        boolean IsBefore = dataNoPassado.before(dataNoFuturo);
        System.out.println("A primeira data é anterior? " + IsBefore);
        //Usando método After pra saber se  a data 1 é posterior a data 2
        boolean IsAfter = dataNoPassado.after(dataNoFuturo);
        System.out.println("A primeira data é posterior?" + IsAfter + "\n \n");
        //Exemplo 3: Comparação entre datas
        System.out.println("Exemplo 2: ");
        Date dataNascimento = new Date(1513124807691L);
        Date dataEntradaEscola = new Date(1613124807691L);
        Date dataMatriculaEscola = new Date (1613124807691L);
        //comparando se as Datas são iguais:
        boolean isEquals = dataEntradaEscola.equals(dataMatriculaEscola);
        System.out.println("A data de matricula é igual a da primeira aula? " + isEquals);
        int compareCase1 = dataNascimento.compareTo(dataEntradaEscola);
        int compareCase2 = dataEntradaEscola.compareTo(dataNascimento);
        int compareCase3 = dataMatriculaEscola.compareTo(dataEntradaEscola);
        System.out.println("-1 corresponde ao passado, 0 mesma data, 1 futuro:");
        System.out.println("A data do Nascimento ocorreu antes da Entrada? " + compareCase1);
        System.out.println("A data da Entrada ocorreu depois do nascimento? " + compareCase2);
        System.out.println("A data da Matricula corresponde a data da entrada? " + compareCase3+"\n");
        System.out.println("Agora trabalharemos com Instant: \n");
        //instant é usado pra marcação temporal, sua forma de apresentação é mais amigavel.
        Date dataBruta = new Date(1513124807691L);
        System.out.println("Data antes do instant: " + dataBruta);
        //usando instant:
        Instant instant = dataBruta.toInstant();
        System.out.println("Data depois do uso do instant " + instant);
        
        
        
        
        
    }
    
}
