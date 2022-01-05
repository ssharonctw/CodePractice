package com.example.CodePractice.DataStructureAlgorithm.RunTimeCalculation;

public class Main {
    //nano second = 10^(-9) second
    //hence to represent in ms (10^(-3)), we need to multiply the duration (which was in ns) by 10^6
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();
        // -------- program --------

        Thread.sleep(3000);

        // -------------------------------
        long duration = (System.nanoTime() - start)/1000000;
        System.out.println(duration + " ms");

    }
}
