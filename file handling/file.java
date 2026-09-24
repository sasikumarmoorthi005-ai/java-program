import java.io.*;
public class file{
    public static void main(String args[]){
        try{
        File f1=new File("student/demo1.txt");
        if(f1.exists()){
             System.out.println("already create...");
             System.out.println("name:"+f1.getName());
                System.out.println("path:"+f1.getAbsolutePath());
                   System.out.println("length"+f1.length());
                      System.out.println("read:"+f1.canRead());
                         System.out.println("write"+f1.canWrite());

        }
        else{
             System.out.print("file create...");
        f1.createNewFile();

        }
      
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}