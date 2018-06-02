package JavaAdvance;

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

        Random generator=new Random();
        int index=generator.nextInt(3);

        System.out.println("Random Value" +  " " + index);


        Olive o=olives2.get(index);

        switch (o.oliveName) {
            case "Kalamata":
                System.out.println("this is Greek");
                break;
            case "Picholine":
                System.out.println("this is Franch");
                break;

            case "Ligurio":
                System.out.println("this is Italian");
                break;

            default:
                System.out.println("I don't know");
                break;
        }


    }
}
