import java.io.*;
import java.util.Scanner;
class JosephusSurvivor {

    public static void main(String[] args) {
        
        int n,a;

        Scanner scanner = new Scanner(System.in);
        System.out.println("****The Josephus Survivor****");
        System.out.println("Enter Sequence, K being the starting number and N being the ending number\n");
        System.out.println("Enter n: \n");
        n = scanner.nextInt();
        System.out.println("Enter a: \n");
        a=scanner.nextInt();

        System.out.println("The Survivor is: "+josephus(a,n));
    }


static int josephus(int a, int n) 
{ 
if (a <= 1 || n <= 1) 
    return 1;    
else
  
    return (josephus(a - 1, n) + n-1) % a + 1; 
}

}

