import java.util.Scanner;

class max1 {
    public void me(int n, Scanner sc) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter values");
            arr[i] = sc.nextInt();
        }
int max=arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
               max=arr[i];
            }
        }

       
          System.out.println("maximum number"+max);
    }
  
  
}

class max {
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