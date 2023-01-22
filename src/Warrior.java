public class Warrior extends Hero{

    public Warrior(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    public void applySuperAbility() {
        System.out.println("Воин использвал: " + superAbility);
    }
}
