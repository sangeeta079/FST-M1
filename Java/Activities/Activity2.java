package Activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] arrayNum1 = {10, 77, 10, 54, -11, 10};
        int iSearchNum = 10;
        int iTotalSum = 30;

       boolean xyz = Myresult (arrayNum1, iSearchNum, iTotalSum);

        System.out.println("Results: "+ xyz);
    }

    private static boolean Myresult (int[] array1, int iSearchNum, int iTotalSum) {

        int tempSum = 0;

        for (int x : array1){
            if (x==iSearchNum){
                tempSum += iSearchNum;
                if (tempSum >= iTotalSum) {
                    break;
                }
            }
        }
        return tempSum == iTotalSum;
    }
}


