import java.io.*;

class josephus {

    public static void main(String[] args) {
        
        int k = 2;
        int n = 14;

        System.out.println(j(n,k));
    }




static int j(int n, int k) 
{ 
if (n == 1) 
    return 1; 
else
    /* The position returned by josephus(n - 1, k)  
    is adjusted because the recursive call  
    josephus(n - 1, k) considers the original  
    position k%n + 1 as position 1 */
    return (j(n - 1, k) + k-1) % n + 1; 
}

}

