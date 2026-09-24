import java.time.LocalDate;
class expirydate{
    public static void main(String args[]){
        LocalDate expiry=LocalDate.of(2026,9,20);
        LocalDate today=LocalDate.now();

        if(today.isAfter(expiry)){
            System.out.println("expiry date");
        }
        else{
             System.out.println("not expiry date");
        }

    }
}