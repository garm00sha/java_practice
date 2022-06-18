package festine_weekly_practice.week1;

public class Task4_Swap_Without_3rdVariable {
    /*
    4) Numbers - Swap Numbers
Swap two variable' values without using a third variable

     */
    public static void main(String[] args) {
        swapNums(3,5);
    }

    public static void swapNums (int a , int b){
        a = a +b;
        b = a- b;
        a = a - b;
        System.out.println("a after swap = " +a );
        System.out.println("b after swap = " + b);
    }
}
