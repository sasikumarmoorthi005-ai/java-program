class details{
    String name;
    String email;
    static int age;
    static String NO;

    public void display(){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        System.out.println(NO);
    }


}
class instanceex{
    public static void main(String args[]){
        details obj=new details();

        obj.name="sasi";
        obj.email="sasi@gmail";
        details.age=20;
        details.NO="8190878045";

        obj.display();
    }
}