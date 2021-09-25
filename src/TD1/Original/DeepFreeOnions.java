package TD1.Original;

public class DeepFreeOnions implements FoodProduct {

    private double weight;
    private double Base_price=0.5;

    public DeepFreeOnions(double weight) {
        this.weight = weight;
    }

    @Override
    public double wight() {
        return this.weight;
    }

    @Override
    public double price() {
        return this.Base_price*this.weight;
    }

    @Override
    public double calorie_par_100g() {
        return 120;
    }

    @Override
    public double calorie() {
        return (this.calorie_par_100g()*this.wight())/100;
    }

    @Override
    public String toString() {
        return String.format("deep fried onions (%.0fg) -- %.2f€ -- %.0fkj", wight(), price(),calorie());
    }




}


