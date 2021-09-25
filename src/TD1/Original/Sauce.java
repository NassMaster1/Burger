package TD1.Original;

public class Sauce implements FoodProduct {

    private double weight;
    private double Base_price=0.5;
    private SauceType type;

    public Sauce(SauceType type,double weight) {
        this.weight = weight;
        this.type=type;
    }

    @Override
    public double wight() {
        return this.weight;
    }

    @Override
    public double price() {
        return this.Base_price;
    }

    @Override
    public double calorie() {
        return (this.calorie_par_100g()*this.wight())/100;
    }

    @Override
    public double calorie_par_100g() {
        return type.calorie_par_100g()*this.wight() ;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€ -- %.0fkj", type, wight(), price(),calorie());
    }

}


