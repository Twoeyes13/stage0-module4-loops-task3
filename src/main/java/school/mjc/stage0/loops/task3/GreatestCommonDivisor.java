package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gCD = 1;
        if (first < 1 || second < 1)
        {
            gCD = first > second ? first : second;
        } else {
            for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    if (i > gCD) {
                        gCD = i;
                    }
                }
            }
        }
        System.out.println(gCD);
    }
}
