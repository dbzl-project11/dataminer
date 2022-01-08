package com.dbzl.dataminer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class GeneralParamFile implements ParamFile{

    /*byte 1 = unknown
byte 2 = ki charge SFX
byte 3 = weight
byte 4 = aura
byte 5-8 = collision X
byte 9-12 = collision Y
byte 13-16 = collision Z
byte 65 = max blast stocks
byte 201 = evilness
byte 41-42 = passively charged ki bars
byte 45-46 = ki bars to recover when guard crushed
byte 49-50 = active ki charge
byte 53-54 = active ki charge (underwater)
byte 57-58 = passive ki charge
byte 61-62 = passive ki charge (guard crushed)
byte 69-70 = b1 charge rate
byte 77-78 = ki counter charge usage
bytes 81-84 = full to max charge speed multiplier
bytes 85-88 = MPM duration
bytes 97-100 = knockback time when smashed
bytes 101-104 = switch gauge charge speed (seconds)
bytes 117-120 = smash attack charging speed
bytes 125-128 = damage taken (defense)
*/
    int blastStocks;
    int evilness;
    int baseKiPower;
    int kiRecoveredGuardCrush;
    int activeKiCharge;
    int underwaterKiCharge;
    int passiveKiCharge;
    int passiveKiChargeCrushed;
    int b1ChargeRate;
    int kiCounterKiUsage;
    float fullToMPMChargeSpeed;
    float MPMdurationSec;
    float knockbackTime;
    float tagBarTimer;
    float smashAttackCharge;
    float damageTaken;

    GeneralParamFile(byte[] rawBytes){
        fullToMPMChargeSpeed = getDoubleFromBytes(rawBytes, 80);
        MPMdurationSec= getDoubleFromBytes(rawBytes, 84);
        knockbackTime = getDoubleFromBytes(rawBytes, 96);
        tagBarTimer = getDoubleFromBytes(rawBytes, 100);
        smashAttackCharge = getDoubleFromBytes(rawBytes, 116);
        damageTaken = getDoubleFromBytes(rawBytes, 124);

        blastStocks = getIntFromBytes(rawBytes, 64);
        evilness = getIntFromBytes(rawBytes, 199);
        baseKiPower = getIntFromBytes(rawBytes, 40);
        kiRecoveredGuardCrush = getIntFromBytes(rawBytes, 44);
        activeKiCharge = getIntFromBytes(rawBytes, 48);
        underwaterKiCharge = getIntFromBytes(rawBytes, 52);
        passiveKiCharge = getIntFromBytes(rawBytes, 56);
        passiveKiChargeCrushed = getIntFromBytes(rawBytes, 60);
        b1ChargeRate = getIntFromBytes(rawBytes, 68);
        kiCounterKiUsage = getIntFromBytes(rawBytes, 76);
    }



    @Override
    public String toString() {
        return "GeneralParamFile{" +
                "blastStocks=" + blastStocks +
                ", evilness=" + evilness +
                ", baseKiPower=" + baseKiPower +
                ", kiRecoveredGuardCrush=" + kiRecoveredGuardCrush +
                ", activeKiCharge=" + activeKiCharge +
                ", underwaterKiCharge=" + underwaterKiCharge +
                ", passiveKiCharge=" + passiveKiCharge +
                ", passiveKiChargeCrushed=" + passiveKiChargeCrushed +
                ", b1ChargeRate=" + b1ChargeRate +
                ", kiCounterKiUsage=" + kiCounterKiUsage +
                ", fullToMPMChargeSpeed=" + fullToMPMChargeSpeed +
                ", MPMdurationSec=" + MPMdurationSec +
                ", knockbackTime=" + knockbackTime +
                ", tagBarTimer=" + tagBarTimer +
                ", smashAttackCharge=" + smashAttackCharge +
                ", damageTaken=" + damageTaken +
                '}';
    }


}
