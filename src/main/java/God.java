public class God extends Person {

    private Weapon weapon;


    public God(String name, double weight, double height, BodyType bodyType, Stats stats) {
        super(name, weight, height, bodyType, stats);

        weapon = new Weapon("starter pole", new Stats(100,100,100,100));
    }
}
