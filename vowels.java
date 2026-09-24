class vowels{
    public static void main(String args[]){
        String mail="sasik005@gmail.com";
int count=0;
int count1=0;
int num=0;
int spl=0;
        for(int i=0;i<mail.length();i++){
            char ml=mail.charAt(i);
            if(ml>='a' && ml<='z'){
             if(ml =='a' || ml=='e' || ml=='i' || ml=='o' || ml=='u'){
                 
                 count++;
             }
             
             else{
                 count1++;
             }}

            else if(ml>='0' && ml<='9'){
                 
                 num++;
             }
            else{
                spl++;
             }
            
        }

         System.out.println("vowels count:"+count);
      System.out.println("constant:"+count1);
       System.out.println("number count:"+num);
      System.out.println("special count"+spl);
    }
   
}