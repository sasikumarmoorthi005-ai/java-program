import java.util.Scanner;

class ex1{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("enter array value");
int n=sc.nextInt();

int ar[]=new int[n];

for(int i=0;i<n;i++){
    System.out.println("enter  value "+i);
ar[i]=sc.nextInt();


}
for(int i=0;i<ar.length;i++){
    System.out.println(ar[i]);
}
    }
}