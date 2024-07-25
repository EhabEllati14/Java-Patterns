public abstract class Resturant {
public Burger orderbur(){
    Burger bur = new Createbur();
    bur.prepare();
    return bur;
}
public abstract Burger Createbur();
}

