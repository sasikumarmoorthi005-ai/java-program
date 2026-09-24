import java.io.*;
public class fi1{
    
    public static void main(String args[]){
        try{
        File f1=new File("studentFolder");
        f1.mkdir();
        System.out.print("folder create...");
        }
        catch(ioException){
            System.out.println(e);
        }
    }
}