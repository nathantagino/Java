
package datas;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Calendario {
    public static void main(String[] args) {
     //Exemplo número 1: Mostra os dados de data e hora atual.
        System.out.println("Data atual:");
        Calendar agora = Calendar.getInstance();
        System.out.println(agora + "\n" );        
        //Manipulação com datas
        System.out.println("Trabalhando com manipulação de datas: \n");
        //Exemplo número 2: Manipulação de datas a partir da data atual.
        Calendar dataatual = Calendar.getInstance();
        System.out.println("A data atual é: " + dataatual.getTime());
        //importante dizer que as manipulações são acumulativas
        dataatual.add(Calendar.DATE,-15);
        System.out.println("15 dias atrás: " + dataatual.getTime());
        //voltamos 15 dias antes da data atual
        dataatual.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + dataatual.getTime() );
        //depois de voltar 15 dias avançamos 4 meses, os 15 continuam valendo
        dataatual.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + dataatual.getTime() + "\n" );
        //depois de voltar 15 dias e avançar 4 meses, avançamos 2 anos
        //Impressão de data e hora
        System.out.println("Trabalhando com impressão de data e hora: de formas diferentes: \n");
        Calendar datahora = Calendar.getInstance();
        System.out.printf("%tc\n",datahora);
        System.out.printf("%tF\n",datahora);
        System.out.printf("%tD\n",datahora);
        System.out.printf("%tr\n",datahora);
        System.out.printf("%tT\n",datahora + "/n");
        //Formatação da saida de data e hora:
        System.out.println("Trabalhando com formatação de data e hora, usando Date format \n");
        Date dataformatada = new Date();
        String dateToStr = DateFormat.getInstance().format(dataformatada);
        System.out.println(dateToStr);
        
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(dataformatada);
        System.out.println(dateToStr + "/n");
        System.out.println("Trabalhando com formatação de data e hora, usando Simple date format \n");
        Date datasimples = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatter.format(datasimples);
        System.out.println(dataFormatada);
    }
}
