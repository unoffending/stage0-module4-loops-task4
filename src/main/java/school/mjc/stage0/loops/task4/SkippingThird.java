package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
    int i = 0;
            while(i < lastPrinted) {
                i++;
                if(i % 3 == 0) {
                    continue;
                }
                System.out.println(i);
            }
    }
}
