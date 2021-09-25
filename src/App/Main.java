package App;

import TD1.Original.Burger;
import TD1.Original.Cheddar;
import TD1.Original.Meat;
import TD1.Original.MeatType;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        Burger Nacer=new Burger("MENU FISH", List.of(new Meat(MeatType.FISH,2),
                                                            new Cheddar(2)));


       System.out.println(Nacer);



    }
}
