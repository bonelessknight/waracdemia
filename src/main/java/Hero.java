public class Hero extends Person {

    private Weapon weapon;


    public Hero(String name, double weight, double height, BodyType bodyType, Stats stats) {
        super(name, weight, height, bodyType, stats);

        weapon = new Weapon("starter pole", new Stats(10,10,10,10));
    }
}
