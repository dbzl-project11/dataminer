package com.dbzl.dataminer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class B1ParamFile implements ParamFile{
/*Type (Magic value) - byte 17-18
B1 stock usage - byte 149
Effect size - bytes 49-52
1st VFX time (frames) - 85-86
2nd VFX time (frames) - 87-88
3rd VFX time (frames) - 89
Animation type - 101

Strong armor - 9
(false courage flag 2, 1 above additive) - 8

Stat buff duration type -103
Attack buff 151
Defense buff - 155
Ki buff - 153
Super buff - 157
Stun effect - 35-36
health regained - 169
Ki bars restored - 177-180

hits - 51
damage - 133-136
damage while blocking - 141-144
damage per hit - 49
effect on opponent 1 - 105
effect on opponent 2 - 106
duration of opponent effect - 163
knockback - 119-120*/

    int attackBuff;
    int defenseBuff;
    int kibuff;
    int superBuff;
    int stuneffect;
    int healthRegained;
    int kiBarsRestored;
    int hits;
    int damage;
    int damageWhileBlocking;
    int damageDivider;
    int effectOpponent1;
    int effectOpponent2;
    int durationEffect;
    int knockback;
    int b1cost;

    int attackBuff_2;
    int defenseBuff_2;
    int kibuff_2;
    int superBuff_2;
    int stuneffect_2;
    int healthRegained_2;
    int kiBarsRestored_2;
    int hits_2;
    int damage_2;
    int damageWhileBlocking_2;
    int damageDivider_2;
    int effectOpponent1_2;
    int effectOpponent2_2;
    int durationEffect_2;
    int knockback_2;
    int b1cost_2;
    int b1Type_2;


    B1ParamFile(byte[] rawBytes){
        attackBuff = getInt(rawBytes, 150);
        defenseBuff = getInt(rawBytes, 154);
        kibuff = getInt(rawBytes, 152);
        superBuff = getInt(rawBytes, 156);
        stuneffect = getIntFromBytes(rawBytes, 34);
        healthRegained = getIntFromBytes(rawBytes, 168);
        kiBarsRestored = getIntFromBytes(rawBytes, 176);
        hits = getShortFromSingleByte(rawBytes, 66);
        damage = getIntFromBytes(rawBytes, 132);
        damageWhileBlocking = getIntFromBytes(rawBytes, 140);
        damageDivider = getInt(rawBytes, 64);
        effectOpponent1 = getInt(rawBytes, 104);
        effectOpponent2 = getInt(rawBytes, 105);
        durationEffect = getShortFromTwoBytes(rawBytes, 162);
        knockback = getIntFromBytes(rawBytes, 118);
        b1cost = getInt(rawBytes, 148);


        attackBuff_2 = getInt(rawBytes, 151);
        defenseBuff_2 = getInt(rawBytes, 155);
        kibuff_2 = getInt(rawBytes, 153);
        superBuff_2 = getInt(rawBytes, 157);
        stuneffect_2 = getIntFromBytes(rawBytes, 34);
        healthRegained_2 = getIntFromBytes(rawBytes, 172);
        kiBarsRestored_2 = getIntFromBytes(rawBytes, 180);
        hits_2 = getShortFromSingleByte(rawBytes, 67);
        damage_2 = getIntFromBytes(rawBytes, 140);
        damageWhileBlocking_2 = getIntFromBytes(rawBytes, 144);
        damageDivider_2 = getInt(rawBytes, 66);
        effectOpponent1_2 = getInt(rawBytes, 112);
        effectOpponent2_2 = getInt(rawBytes, 113);
        durationEffect_2 = getShortFromTwoBytes(rawBytes, 170);
        knockback_2 = getIntFromBytes(rawBytes, 120);
        b1cost_2 = getInt(rawBytes, 149);
        b1Type_2 = getInt(rawBytes, 103);
    }


    @Override
    public String toString() {
        return "First B1{" +
                "attackBuff=" + attackBuff +
                ", defenseBuff=" + defenseBuff +
                ", kibuff=" + kibuff +
                ", superBuff=" + superBuff +
                ", stuneffect=" + stuneffect +
                ", healthRegained=" + healthRegained +
                ", kiBarsRestored=" + kiBarsRestored +
                ", hits=" + hits +
                ", damage=" + damage +
                ", damageWhileBlocking=" + damageWhileBlocking +
                ", damageDivider=" + damageDivider +
                ", knockback=" + knockback +
                ", b1cost=" + b1cost + "}\n Second B1 {" +
                ", attackBuff_2=" + attackBuff_2 +
                ", defenseBuff_2=" + defenseBuff_2 +
                ", kibuff_2=" + kibuff_2 +
                ", superBuff_2=" + superBuff_2 +
                ", stuneffect_2=" + stuneffect_2 +
                ", healthRegained_2=" + healthRegained_2 +
                ", kiBarsRestored_2=" + kiBarsRestored_2 +
                ", hits_2=" + hits_2 +
                ", damage_2=" + damage_2 +
                ", damageWhileBlocking_2=" + damageWhileBlocking_2 +
                ", damageDivider_2=" + damageDivider_2 +
                ", knockback_2=" + knockback_2 +
                ", b1cost_2=" + b1cost_2 +
                '}';
    }
}
