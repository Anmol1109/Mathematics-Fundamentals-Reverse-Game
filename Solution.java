import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i = 1; i <= t;i++){
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);
        
        if(k < n/2)
            System.out.println((k + 1) * 2 - 1);
        else
            System.out.println((n - 1 - k) * 2);
            }
    }
        
}
