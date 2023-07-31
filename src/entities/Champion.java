package entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public void takeDamage(int damage) {
        int receivedDamage = Math.max(damage - armor, 1);
        life = Math.max(life - receivedDamage, 0);
    }

    public String status() {
        if (life == 0) {
            return name + ": 0 de vida (morreu)";
        } else {
            return name + ": " + life + " de vida";
        }
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLife(int life) {
        this.life = life;
    }

}
