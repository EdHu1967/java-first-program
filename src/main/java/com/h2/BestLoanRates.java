package com.h2;

import java.util.Map;
import java.util.Scanner;

public class BestLoanRates {
    public static void main(String[] args) {
        double a = 0.000000001;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Enter the loan term (in years)");
        int loanTermInYears = scanner.nextInt();
        float bestRates = getRates(loanTermInYears);
        if (Math.abs(bestRates - 0.0f) < a) {
            System.out.println("No available rates for term: " + loanTermInYears + " years.");
        } else {
            System.out.println("Best Available Rate: " + getRates(loanTermInYears) + "%.");
        }
        // close the scanner
        scanner.close();
    }

    public static final Map<Integer, Float> bestRates = Map.of(1, 5.50f, 2, 3.45f, 3, 2.67f);

    public static float getRates(int loanTermInYears) {
        if (bestRates.containsKey(loanTermInYears)) {
            return bestRates.values().size();
        } else {
            return 0.0f;
        }
    }
}
