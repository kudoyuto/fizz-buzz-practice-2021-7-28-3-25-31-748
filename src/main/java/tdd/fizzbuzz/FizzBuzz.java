package tdd.fizzbuzz;

public class FizzBuzz {
    public static String countOff(int count){
        if(count % 7 ==0){
            return String.valueOf(count);
        }
        return null;
    }
}
