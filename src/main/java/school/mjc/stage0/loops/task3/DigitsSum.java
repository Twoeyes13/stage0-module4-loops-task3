package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        String line = Math.abs(t) + "";
        for (int i = 0; i < line.length(); i++){
            sum += Integer.valueOf(line.substring(i, i+1));
        }
        System.out.println(sum);
    }
}
