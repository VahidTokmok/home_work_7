public class Main {
    public static void main(String[] args) {

        Warrior warrior = new Warrior(500, 50, "CRITICAL DAMAGE");
        Magic magic = new Magic(450, 45, "FIERY RAIN");
        Medic medic = new Medic(40, 0, "INSTANT HEALING");

        Hero[] fight = {warrior, magic, medic};
            for (int i = 0; i < fight.length; i++) {
                fight[i].applySuperAbility();
            }
    }
}