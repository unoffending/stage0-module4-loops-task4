package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
       if(numberToGoUntil < toBreakWith) {
       System.out.println("iterating till the end");
       for(int i = 0; i <= toBreakWith; i++) {
           System.out.println(i);
       } 
       } else if (numberToGoUntil > toBreakWith) { 
               for(int i = toBreakWith; i <= numberToGoUntil; i++) {
               System.out.println(i);
               }
        }
    }
}
