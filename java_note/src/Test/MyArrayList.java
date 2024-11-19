package Test;

import java.util.Iterator;
import java.util.ArrayList;

public class MyArrayList {
    public static void Do(){

        ArrayList<Integer>ints = new ArrayList<>();
        int sum = 0;
        for(int i = 0;i<=100;i++){
            if(i%4!=0||i%5!=0){
                ints.add(i);
                System.out.println(sum);
            }
        }
    }
}
