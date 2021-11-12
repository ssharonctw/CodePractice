package com.example.CodewarsPractice.sixkyu;

import java.util.stream.IntStream;

public class Multiple3or5 {
    /*
    * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
    * The sum of these multiples is 23.
    * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).
    * Note: If the number is a multiple of both 3 and 5, only count it once.
    * */
    public int solution(int number){
        if (number < 0) return 0;
        int sum = 0;
        for(int i=0; i<number; i++){
            if(i % 3 == 0 || i%5 == 0){sum=sum+i;}
        }
        return sum;
    }

    public int bestSolution(int number){
        /*
        * Intstream
        *
        * n-> (n%3==0) || (n%5 ==0) is a lambda expression where parameter -> codeblock
        * parameter will receive the value immediately returned by the code block
        * .filter() receives boolean and filter only value of true
        * .sum() aggregates the value
        * */
        return IntStream.range(0, number)
                        .filter(n -> (n%3 == 0 ) || (n%5 == 0))
                        .sum();
    }
}
