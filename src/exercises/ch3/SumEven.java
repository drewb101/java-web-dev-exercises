package exercises.ch3;

import java.util.ArrayList;

public class SumEven {
    public static int getSum(ArrayList<Integer> numList) {
        int sum = 0;

        for(int num : numList){
            if(num%2 == 0){
                sum += num;
            }
        }
        return sum;
    }
}
