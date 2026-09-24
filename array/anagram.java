
class anagram{
    public static void main(String args[]){
        String a="apqle";
        String b="elaps";
int count=0;
        for(int i=0;i<a.length();i++){
            
            for(int j=0;j<b.length();j++){
                char c=a.charAt(i);
                char d=b.charAt(j);

                if(c==d){
                    // System.out.println(c);
                    //  System.out.println(d);
                count+=1;
                break;
                // System.out.println(count);
                }

            }
        }
        // System.out.println(count);
        // System.out.println(a.length());
            if(count==a.length()){
                System.out.println("anagram ");
            }
            else{
                System.out.println("not anagram");
            }
            // System.out.println(c);
        }
    
}