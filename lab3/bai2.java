package lab3;

import java.util.Scanner;

public class bai2 {
    public void bangCuuChuong() {

       for (int k = 1; k < 10; k++) {
        for (int i = 2; i <=10; i++) {
            System.out.printf("%d x %d = %d ",k,i,k*i);
        }
        System.out.println();
       }
    }
}
