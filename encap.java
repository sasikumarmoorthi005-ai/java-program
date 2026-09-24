class a{
    private String name;
    private String mail;

    public void setName(String name){
        this.name=name;

    }
      public void setMail(String mail){
        this.mail=mail;

    }
      public String getName(){
        return name;

    }
      public String getMail(){
        return mail;

    }

}
public class encap{
    public static void main (String[]args){
         a obj=new a();
         obj.setName("sasi");
         obj.setMail("sasi@gmail");
          System.out.println(obj.getName());
         System.out.println(obj.getMail());
    }
}