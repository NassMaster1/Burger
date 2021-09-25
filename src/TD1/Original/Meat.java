package TD1.Original;

public class Meat implements FoodProduct{

    private double weight;
    private MeatType type;

    public Meat(MeatType type,double weight) {
        this.weight = weight;
        this.type=type;
    }

    @Override
    public double wight() {
        return this.weight;
    }

    @Override
    public double price() {
        return this.weight*this.type.price();
    }


    @Override
    public double calorie_par_100g() {
        return type.calorie_par_100g();
    }

    @Override
    public double calorie() {
        return (this.calorie_par_100g()*this.wight())/100;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€ -- %.0fkj", type, wight(), price(),calorie());
    }


}
