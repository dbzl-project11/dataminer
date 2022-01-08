package com.dbzl.dataminer.moves;

public class MeleeMove {

        /**
     *
     * format seems to be in a 48 byte format.
     * Rush Attack 1 (first combo) Health damage - byte 5-6
     * Rush Attack 1 (first combo) unknown - byte 6-7
     * Rush Attack 1 (first combo) Ki damage - byte 9-10
     * Rush Attack 1 (first combo) ki gain - byte 11-12
     * Rush Attack 1 (first combo) health absorb - byte 13-14
     * Rush Attack 1 (first combo) ki absorb - byte 15-16
     * placeholder (settings demarcation?)
     * Rush Attack 1 (first combo) horizontal knockback - byte 22
     * Rush Attack 1 (first combo) vertical knockback - byte 23
     * Rush Attack 1 (first combo) Armor break - byte 45
     * Rush Attack 1 (first combo) sound effect - byte 37
     * Rush Attack 1 (first combo) special effect - byte 28
     * Rush Attack 1 (first combo) visual effect - byte 36
     *
     *
     *
     */

        int healthDamage;
        int unknown;
        int kiDamage;
        int kiGain;
        int healthAbsorbtion;
        int kiAbsorbtion;
        int horizontalKnockback;
        int verticalKnockback;
        boolean armorBreak;

    public MeleeMove() {
    }

    public int getHealthDamage() {
        return healthDamage;
    }

    public void setHealthDamage(int healthDamage) {
        this.healthDamage = healthDamage;
    }

    public int getUnknown() {
        return unknown;
    }

    public void setUnknown(int unknown) {
        this.unknown = unknown;
    }

    public int getKiDamage() {
        return kiDamage;
    }

    public void setKiDamage(int kiDamage) {
        this.kiDamage = kiDamage;
    }

    public int getKiGain() {
        return kiGain;
    }

    public void setKiGain(int kiGain) {
        this.kiGain = kiGain;
    }

    public int getHealthAbsorbtion() {
        return healthAbsorbtion;
    }

    public void setHealthAbsorbtion(int healthAbsorbtion) {
        this.healthAbsorbtion = healthAbsorbtion;
    }

    public int getKiAbsorbtion() {
        return kiAbsorbtion;
    }

    public void setKiAbsorbtion(int kiAbsorbtion) {
        this.kiAbsorbtion = kiAbsorbtion;
    }

    public int getHorizontalKnockback() {
        return horizontalKnockback;
    }

    public void setHorizontalKnockback(int horizontalKnockback) {
        this.horizontalKnockback = horizontalKnockback;
    }

    public int getVerticalKnockback() {
        return verticalKnockback;
    }

    public void setVerticalKnockback(int verticalKnockback) {
        this.verticalKnockback = verticalKnockback;
    }

    public boolean isArmorBreak() {
        return armorBreak;
    }

    public void setArmorBreak(boolean armorBreak) {
        this.armorBreak = armorBreak;
    }

    @Override
    public String toString() {
        return "Move{" +
                "healthDamage=" + healthDamage +
                ", unknown=" + unknown +
                ", kiDamage=" + kiDamage +
                ", kiGain=" + kiGain +
                ", healthAbsorbtion=" + healthAbsorbtion +
                ", kiAbsorbtion=" + kiAbsorbtion +
                ", horizontalKnockback=" + horizontalKnockback +
                ", verticalKnockback=" + verticalKnockback +
                ", armorBreak=" + armorBreak +
                '}';
    }
}
