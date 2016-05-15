package com.kevinmichie;

import java.util.Scanner;

public class ChangeCombination {

    public int numberOfCombinations(int valueInCents){
        int numberOfCombinations = 0;

        if(valueInCents == 0){
            return numberOfCombinations;
        }

        for(int i = 0; i <= valueInCents; i++) { //Incrementing Pennies
            for (int j = 0; j <= valueInCents; j += 5) { //Incrementing Nickels
                for (int k = 0; k <= valueInCents; k += 10) { //Incrementing Dimes
                    for (int l = 0; l <= valueInCents; l += 25) { //Incrementing Quarters
                        for (int m = 0; m <= valueInCents; m += 50) { //Incrementing Half-Dollars
                            int valueHolder = m + l + k + j + i;
                            if (valueHolder == valueInCents) {
                                numberOfCombinations++;
                            }
                        }
                    }
                }
            }
        }
        return numberOfCombinations;
    }

    public static void main(String[] args) {
        ChangeCombination combo = new ChangeCombination();
        Scanner scanner = new Scanner(System.in);
        int valueInCents = scanner.nextInt();

        int numberOfCombinations = combo.numberOfCombinations(valueInCents);
        System.out.println(numberOfCombinations);
    }
}

