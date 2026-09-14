package org.gabriel.classesMonstros;

public class MonstroBase {
    private int     life;
    private int     defense;
    private int     damage;
    private int     magicDefense;
    private int     manna;
    private String  debuffName;
    private double  debuffPercentage;
    private boolean isBoss;

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMagicDefense() {
        return magicDefense;
    }

    public void setMagicDefense(int magicDefense) {
        this.magicDefense = magicDefense;
    }

    public int getManna() {
        return manna;
    }

    public void setManna(int manna) {
        this.manna = manna;
    }

    public String getDebuffName() {
        return debuffName;
    }

    public void setDebuffName(String debuffName) {
        this.debuffName = debuffName;
    }

    public double getDebuffPercentage() {
        return debuffPercentage;
    }

    public void setDebuffPercentage(double debuffPercentage) {
        this.debuffPercentage = debuffPercentage;
    }

    public boolean isBoss() {
        return isBoss;
    }

    public void setBoss(boolean boss) {
        isBoss = boss;
    }
}
