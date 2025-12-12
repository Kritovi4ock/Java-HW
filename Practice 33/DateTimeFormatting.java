import java.util.Calendar;
import java.util.Formatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        
        Formatter fmt = new Formatter();
        
        // 1. %tY - год в четырёхзначном формате
        fmt.format("Year (4-digit): %tY%n", now);
        
        // 2. %tB - полное название месяца
        fmt.format("Full month: %tB%n", now);
        
        // 3. %tH:%tM:%tS - время в формате ЧЧ:ММ:СС
        fmt.format("Time: %tH:%tM:%tS%n", now, now, now);
        
        // 4. %tA - полное название дня недели
        fmt.format("Day of week: %tA%n", now);
        
        // 5. %td.%tm.%tY - дата в формате ДД.ММ.ГГГГ
        fmt.format("Date: %td.%tm.%tY%n", now, now, now);
        
        System.out.print(fmt);
        fmt.close();
    }
}