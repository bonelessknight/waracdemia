public class Person {

    private String name;
    private double weight;
    private double height;
    private BodyType bodyType;
    private Stats stats;

    public Person(String name, double weight, double height, BodyType bodyType, Stats stats){
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.bodyType = bodyType;
        this.stats = stats;
    }

}
