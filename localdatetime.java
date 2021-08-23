
package datas;
//primeiro passo, importar o pacote datetime
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class LocalDateandTime {
    public static void main(String[] args){
//A partir do 8 java surgiram novas classes para simplificaro tratamento de data
    LocalDate hoje = LocalDate.now();
    System.out.println("Data atual: " + hoje);
//Exemplo 1: Manipulação de datas com localdate 
    LocalDate ontem = hoje.minusDays(1);
    System.out.println("Data de ontem: " + ontem + "/n");
//Exemplo 2: Agora usaremos localtime pra manipular o horario
LocalTime hora = LocalTime.now();
System.out.println("horario atual: " + hora);
LocalTime maisUmaHora = hora.plusHours(1);
System.out.println("horario atual +1 hora: " + maisUmaHora);
//Exemplo 3: Agora usaremos os dois juntos, com a clase LocalDateTime
LocalDateTime datahora = LocalDateTime.now();
System.out.println("Data e hora: " + datahora);
LocalDateTime futuro = datahora.plusHours(1).plusDays(2).plusSeconds(12);
System.out.println("No fururo: " + futuro);
     
        
        
        
}

  
}