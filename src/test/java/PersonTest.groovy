import org.junit.Before

public class PersonTest {

    Person person;
    BodyType bodyType;
    Stats stats;

    @Before
    public void setup(){

        bodyType = new BodyType("Small")
        stats = new Stats(1000,1000,10000,100000);

        person = new Person("Deku",120.00,5.5,bodyType,stats)
    }
}
