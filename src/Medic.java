public class Medic extends Hero{

    public Medic(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    public void applySuperAbility() {
        System.out.println("Медик использвал: " + superAbility );
    }
}
