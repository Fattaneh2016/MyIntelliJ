package JavaAdvance;

import com.lynda.olivepress.olives.Olive;

import java.util.ArrayList;

public class SwitchTest {

    public static void main(String[] args){

        String key="One";

        switch (key) {
            case "One":
System.out.print("The value is one");
                break;

            default:
                System.out.print("The value is not one");
                break;
        }

        Olive o1 = new Olive("Kalamata", 0x000000);
        Olive o2 = new Olive("Picholine", 0x00FF00);
        Olive o3 = new Olive("Ligurio", 0x000000);

        Olive[] olives = {o1, o2, o3};
        ArrayList<Olive> olives2=new AyyarList<>();
        olives2.add(o1);
        olives2.add(o2);
        olives2.add(o3);

        System.out.println(olives2);

    }
}
