package TD1.Original;

public enum MeatType implements Food{
    BEEF,FISH;

    public double price()
    {
        double price;
        switch (this){
            case BEEF :
                price= 6;
            case FISH:
            default:
                price= 4;
      }
      return price;
    }

    @Override
    public double calorie_par_100g() {
        double calories;
        switch (this){
            case BEEF :
                calories= 320;
            case FISH:
            default:
                calories= 382;
        }
        return calories;
    }
}
