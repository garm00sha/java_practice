package festine_weekly_practice.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task5_RemoveSomeValues {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(11,2,3,4,5,6,6,9322,5,1231,2,654,21,35,1531351,1,531,13,21));
        System.out.println(removeSomeValues(arrayList));
    }
    public static ArrayList<Integer> removeSomeValues(ArrayList<Integer> arrayList){
        Iterator<Integer> it = arrayList.iterator();

        while(it.hasNext()){ // or we can use  (( list.removeIf(each -> each >= num)))
            if (it.next()>100){
                it.remove();
            }
        }
        return arrayList;
    }
}
/*
26) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */

