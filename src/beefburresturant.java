public class beefburresturant extends Resturant{
    @Override
    public Burger Createbur() {
        return new BeefBurger();
    }
}
