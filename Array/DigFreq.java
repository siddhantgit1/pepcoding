package Array;

import java.util.Scanner;

public class DigFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int cnt = 0;
        while(n != 0){
            int r = n%10;
            if(r == d) cnt++;
            n = n/10;
        }
        System.out.println(cnt);
    }

}
