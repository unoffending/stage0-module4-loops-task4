package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(numberToSkip > lastInRow) {
        System.out.println("number to skip is bigger than the last");
    } else if(lastInRow < 0) {
        System.out.println("last number in row is negative");
    } else if(numberToSkip == lastInRow) {
        System.out.println("skipped sum is number");
    } else {
        for(int i = 0; i <= lastInRow; i++) {
            if(i == numberToSkip) {
                continue;
            } 
            System.out.println(i);
        }
    }
    }
}
