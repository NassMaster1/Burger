package TD1.Original;

public enum SauceType implements Food{
    BURGER,BARBUCUE,ALGERIENNE;

    @Override
    public double calorie_par_100g() {
        double calories;
        switch (this){
            case BURGER:
                calories= 20;
            case BARBUCUE:
                calories=30;
            case ALGERIENNE:
            default:
                calories= 34;
        }
        return calories;
    }
}
