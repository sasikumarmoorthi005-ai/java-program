import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
class date{
    public static void main(String args[]){
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        LocalDateTime dt=LocalDateTime.now();

        System.out.println(date);
          System.out.println(date.getYear());
            System.out.println(date.getMonth());
              System.out.println(time);
              System.out.println(dt);
              

    }
}