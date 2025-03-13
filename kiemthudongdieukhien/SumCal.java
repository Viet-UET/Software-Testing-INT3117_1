package com.example.ktdongdieukhien;

public class SumCal {
    public static int Sum(int[] a, int n) {
        int total = 0;
        int i;
        for (i = 0; i < n; i++) {
            total = total + a[i];
        }
        return total;
    }
}
