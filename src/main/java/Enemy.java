public class Enemy extends Person {

    private Weapon weapon;

    public Enemy(String name, double weight, double height, BodyType bodyType, Stats stats) {
        super(name, weight, height, bodyType, stats);

        weapon = new Weapon("starter pole", new Stats(10,10,10,10));
    }
}
