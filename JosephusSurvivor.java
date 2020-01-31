import java.io.*;
import java.util.Scanner;
class JosephusSurvivor {

    public static void main(String[] args) {
        
        int k,n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("****The Josephus Survivor****");
        System.out.println("Enter Sequence, K being the starting number and N being the ending number\n");
        System.out.println("Enter K: \n");
        k = scanner.nextInt();
        System.out.println("Enter N: \n");
        n=scanner.nextInt();

        System.out.println("The Survivor is: "+josephus(n,k));
    }


static int josephus(int n, int k) 
{ 
if (n <= 1 || k <= 1) 
    return 1;    
else
  
    return (josephus(n - 1, k) + k-1) % n + 1; 
}

}

