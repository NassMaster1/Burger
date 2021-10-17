package TD1.Original;

import java.util.List;

public class Burger implements FoodProduct {
    private String name;
    private List<FoodProduct>liste_product;

    public Burger(String name, List<FoodProduct> liste_product) {
        this.name = name;
        this.liste_product = liste_product;
    }

    @Override
    public double wight() {
     return liste_product.stream().map(Product::wight).reduce(0.0,Double::sum);
    }

    @Override
    public double price(){
        return liste_product.stream().map(Product::price).reduce(0.0,Double::sum);
    }


    @Override
    public double calorie_par_100g() {
        return liste_product.stream().map(Food ::calorie_par_100g).reduce(0.0,Double::sum);
    }


    @Override
    public double calorie() {

        return liste_product.stream().map(Food ::calorie_par_100g).reduce(0.0,Double::sum);
    }

  public String toString(){
        StringBuilder buffer=new StringBuilder();
      for (Object item : liste_product) {
          buffer.append(String.format("- %s\n", item));
      }
      buffer.append(String.format("price:         %.2f\t", price()));
      buffer.append(String.format("Calorie:         %.0f\n", calorie()));

      return buffer.toString();
     }


}
