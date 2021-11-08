package lab2.ch1;

public class Fighter {
    private static int counter;
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
        counter++;
    }


    public void attack(Fighter f){
        f.health = f.health - damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public static int getNumberOfFighters(){
        return counter;
    }
}
