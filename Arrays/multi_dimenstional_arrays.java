package Arrays;

import java.util.Scanner;

class multi_dimenstional_arrays_exp {
    int[][] a = new int[3][3];

    public multi_dimenstional_arrays_exp() {
        try{
        Scanner s = new Scanner(System.in); // Do not close: closing would close System.in
        System.out.println("enter the values: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }
    }catch(Exception e){
        System.out.println(e);
    }
        
        // intentionally not closing s
    }

    public void dis() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class multi_dimenstional_arrays {
    public static void main(String[] args) {
        multi_dimenstional_arrays_exp m = new multi_dimenstional_arrays_exp();
        m.dis();
    }
}