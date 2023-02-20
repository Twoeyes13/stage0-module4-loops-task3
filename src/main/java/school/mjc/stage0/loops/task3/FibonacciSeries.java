package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstDigit = 0;
        int nextDigit = 1;
        System.out.println(firstDigit);
        System.out.println(nextDigit);
        for (int i = 3; i <= lastFibonacci; i++){
            int currentDigit = firstDigit + nextDigit;
            System.out.println(currentDigit);
            firstDigit = nextDigit;
            nextDigit = currentDigit;

        }
    }
}
