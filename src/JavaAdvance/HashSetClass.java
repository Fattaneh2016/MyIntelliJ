package JavaAdvance;
import java.util.HashSet;

import olives.Kalamata;
import olives.Ligurio;
import olives.Olive;
import olives.Picholine;
public class HashSetClass {



    public class Main {

        public static void main(String[] args) {

            Olive lig=new Ligurio();
            Olive kal=new Kalamata();
            Olive pic=new Picholine();
            HashSet<Olive> set=new HashSet<>();
            set.add(lig);
            set.add(kal);

            System.out.println("There are set " +  set.size() + " Olives in the set");
            set.add(pic);
            System.out.println("There are set " +  set.size() + " Olives in the set");
            set.add(null);
            System.out.println("There are set " +  set.size() + " Olives in the set");

            set.remove(lig);
        }

    }

}
