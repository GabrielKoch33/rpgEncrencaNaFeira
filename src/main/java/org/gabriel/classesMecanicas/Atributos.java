package org.gabriel.classesMecanicas;

public class Atributos {
    private int vitalidade;
    private int dano;
    private int agilidade;
    private int resistenciaFisica;
    private int resistenciaMentalMagica;
    private int mana;
    private int carisma;
    private int sorte;

    /** ATRIBUTO  | ESCALA: <br>
     * vitalidade: 0 à 100 <br>
     * dano:       0 à 100 <br>
     * agilidade:  0 à 100 <br>
     * resistencia física: 0 à 100 <br>
     * resistencia mágica: 0 à 100 <br>
     * mana:       0 à 100 <br>
     * carisma:    0 à 10 <br>
     * sorte:      0 à 10
     * */
    public Atributos(String role) {
        switch (role) {
            case "Guerreiro":
                this.vitalidade = 80;
                this.dano = 50;
                this.agilidade = 18;
                this.resistenciaFisica = 35;
                this.resistenciaMentalMagica = 10;
                this.mana = 0;
                this.carisma = 9;
                this.sorte = 2;
                break;

            case "Feiticeiro":
                this.vitalidade = 60;
                this.dano = 30;
                this.agilidade = 60;
                this.resistenciaFisica = 40;
                this.resistenciaMentalMagica = 90;
                this.mana = 100;
                this.carisma = 5;
                this.sorte = 7;
                break;

            case "Bandido":
                this.vitalidade = 70;
                this.dano = 30;
                this.agilidade = 80;
                this.resistenciaFisica = 70;
                this.resistenciaMentalMagica = 30;
                this.mana = 0;
                this.carisma = 8;
                this.sorte = 7;
                break;

            case "Arqueiro":
                this.vitalidade = 70;
                this.dano = 50;
                this.agilidade = 40;
                this.resistenciaFisica = 30;
                this.resistenciaMentalMagica = 20;
                this.mana = 0;
                this.carisma = 10;
                this.sorte = 6;
                break;
            //-----------------------------------//
            case "Goblin":
                this.vitalidade = 50;
                this.dano = 50;
                this.agilidade = 40;
                this.resistenciaFisica = 30;
                this.resistenciaMentalMagica = 20;
                this.mana = 0;
                break;

            case "Ogro":
                this.vitalidade = 70;
                this.dano = 50;
                this.agilidade = 40;
                this.resistenciaFisica = 30;
                this.resistenciaMentalMagica = 20;
                this.mana = 0;
                break;

            case "Ritualista":
                this.vitalidade = 60;
                this.dano = 50;
                this.agilidade = 40;
                this.resistenciaFisica = 30;
                this.resistenciaMentalMagica = 20;
                this.mana = 0;
                break;

            case "Chefe":
                this.vitalidade = 100;
                this.dano = 70;
                this.agilidade = 40;
                this.resistenciaFisica = 30;
                this.resistenciaMentalMagica = 20;
                this.mana = 0;
                break;
            default:
                break;
        }
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getResistenciaFisica() {
        return resistenciaFisica;
    }

    public void setResistenciaFisica(int resistenciaFisica) {
        this.resistenciaFisica = resistenciaFisica;
    }

    public int getResistenciaMentalMagica() {
        return resistenciaMentalMagica;
    }

    public void setResistenciaMentalMagica(int resistenciaMentalMagica) {
        this.resistenciaMentalMagica = resistenciaMentalMagica;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getSorte() {
        return sorte;
    }

    public void setSorte(int sorte) {
        this.sorte = sorte;
    }
}
