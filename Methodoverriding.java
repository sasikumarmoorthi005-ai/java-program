final class animal{
    int a=20;
void soun(String name){
    System.out.println("Animals are: "+name);
}
}
class dog extends animal{
    public void soun(String x){
        // if we need to use paraent class we need to declear or print 
        super.soun(x);
      System.out.println("dog is barking"+x);
    }
}
class cat extends animal {
    public void soun(String name){
        System.out.println(" meeoow! meeeow!"+" "+name);
    }
}
class rat extends animal{
    int a1=20;
    // if we need to use paraent class we need to declear or print 
    int b=super.a;
    public void soun(){
        int c=a1+b;
        System.out.println("rat is quch quch");
        System.out.println("addition"+" "+c);
    }

}

public class Methodoverriding {
    public static void main(String[] args) {
        cat c=new cat();
        dog d=new dog();
        rat r=new rat();
        d.soun("java");
        c.soun("kala");
        r.soun();
      
    }
    
}