package JavaAdvance;
import java.text.NumberFormat;
public class NumberFormatClass {

    public static void main(String[] args) throws Exception {
        int myNumber=1_000_000;
        NumberFormat formatter=NumberFormat.getInstance();
        System.out.println(formatter.format(myNumber));
    }


}

