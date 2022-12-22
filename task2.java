
public class task2 {
    public static void main(String[] args) {
        try {
            int[] intArray = {2,4,6,2,1,6,8,5,3};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

}
