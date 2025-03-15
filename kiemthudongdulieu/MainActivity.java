package com.example.myproblem;

public class MainActivity {
    public static String evaluateLoanOffer(int income, int creditScore, int workYears) {
        if (income < 5000000 || creditScore < 300 || workYears < 0) {
            return "X"; // Không đủ điều kiện
        } else if (income >= 50000000 && creditScore >= 750 && workYears >= 10) {
            return "A"; // Ưu đãi đặc biệt
        } else if (income >= 30000000 && creditScore >= 700 && workYears >= 5) {
            return "B"; // Ưu đãi cao
        } else if (income >= 15000000 && creditScore >= 600 && workYears >= 3) {
            return "C"; // Ưu đãi khá
        } else if (income >= 10000000 && creditScore >= 500 && workYears >= 1) {
            return "D"; // Ưu đãi trung bình
        } else if ((income >= 5000000 && income < 10000000) || (creditScore >= 300 && creditScore < 500) || (workYears == 0)) {
            return "E"; // Ưu đãi thấp
        } else {
            return "X"; // Không đủ điều kiện
        }
    }
}