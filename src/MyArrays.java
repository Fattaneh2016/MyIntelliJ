import java.util.Arrays;

public class MyArrays {
    int[] a = new int[5];
    double[] b = new double[10];
    char[] c = new char[20];
    int aLength = a.length; // returns 5
    int bLength = b.length; // returns 10
    int cLength = c.length; // returns 20

    public static void twoDArray(){


        char[][] arr = new char[5][5];
        System.out.print(Arrays.toString(arr));
    }

    public void myArrayList(){

        ArrayList<Integer> myList = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            sum += myList.get(i);
        }
    }
}

