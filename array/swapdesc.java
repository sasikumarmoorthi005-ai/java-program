import java.util.Scanner;

class max1 {
    public void me(int n, Scanner sc) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter values");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

       for(int i=0;i<arr.length;i++){
         System.out.println("descending order:"+arr[i]);

       }
         
    }
  
  
}

class desc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int n = sc.nextInt();
        // System.out.println("enter value");
        // int a = sc.nextInt();

        max1 obj = new max1();
        obj.me(n,  sc);
    }
}