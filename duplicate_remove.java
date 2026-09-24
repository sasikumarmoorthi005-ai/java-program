class duplicate_remove{
    public static void main(String args[]){
        String name="sasi kumar";

        for(int i=0;i<=name.length()-1;i++){
            for(int j=i+1;j<=name.length()-1;j++){
                char a=name.charAt(i);
                char b=name.charAt(j);
                if(a==b){
                    name=name.replace(String.valueOf(b),"_");
                   
                }
            }
            
          

        }
          System.out.println(name);
    }
}