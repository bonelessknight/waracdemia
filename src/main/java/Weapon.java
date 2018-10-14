public class Weapon {

    private String weaponName;
    private Stats weaponStats;


    public Weapon(String newName, Stats newSats){

        this.weaponName = newName;
        this.weaponStats = newSats;

    }

    public String getName(){
        return weaponName;
    }

    public void setName(String name){
        this.weaponName = name;
    }

    public Stats getWeaponStats(){
        return weaponStats;
    }

    public void setWeaponStats(Stats newweaponstats){

        this.weaponStats = newweaponstats;

    }
}
