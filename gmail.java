class gmail{
    public static void main(String args[]){
        String mail="sasimsk@gmail.com";
        int a=mail.indexOf("@");
     
        String name=mail.substring(0,a);
        System.out.println(name);
    }
}