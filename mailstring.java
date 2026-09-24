class mailstring{
    public static void main(String args[]){
        String mail="sasiK005@gmail.com";
int count=0;
int count1=0;
        for(int i=0;i<mail.length();i++){
            char ml=mail.charAt(i);
             if(ml >='A' ){
                count++;
             }
             else if(ml>='0'&& ml <='9'){
                count1++;
             }
        }

         System.out.println(count);
      System.out.println(count1);
    }
   
}