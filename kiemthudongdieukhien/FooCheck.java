package com.example.ktdongdieukhien;

public class FooCheck {
    public static String foo(int x) {
        String res;
        switch(x) {
            case 65:
                res = "A";
                break;
            case 66:
                res = "B";
                break;
            case 67:
                res = "C";
                break;
            default:
                res = "haven't check";
                break;
        }
        return res;
    }
}
