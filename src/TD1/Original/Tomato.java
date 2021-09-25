package TD1.Original;

public class Tomato implements FoodProduct{

    private double weight;
    private double Base_price=1;

    public Tomato(double weight) {
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
    public double calorie() {
        return (this.calorie_par_100g()*this.wight())/100;
    }

    @Override
    public double calorie_par_100g() {
        return 140;
    }

    @Override
    public String toString() {
        return String.format("Tomate  (%.0fg) -- %.2f€ -- %.0fkj", wight(), price(),calorie());
    }
}
