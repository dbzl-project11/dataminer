package com.dbzl.dataminer;

import com.dbzl.dataminer.moves.MeleeMove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeleeParamFile implements ParamFile{

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

    List<MeleeMove> parsedMoves = new ArrayList<>();

    MeleeParamFile(byte[] rawBytes){

        for(int i =0; i < rawBytes.length;i+=48 ){
            int endIndex = i +48;
            byte[] subArray = Arrays.copyOfRange(rawBytes, i, endIndex);
            MeleeMove move = new MeleeMove();
            move.setHealthDamage(getShortFromTwoBytes(subArray, 4));
            move.setHealthAbsorbtion(getShortFromTwoBytes(subArray, 12));
            move.setKiDamage(getShortFromTwoBytes(subArray, 8));
            move.setKiGain(getShortFromTwoBytes(subArray, 10));
            move.setKiAbsorbtion(getShortFromTwoBytes(subArray, 14));
            move.setArmorBreak(getBooleanFromByte(subArray, 44));
            parsedMoves.add(move);
        }



    }


    @Override
    public String toString() {
        return "MeleeParamFile{" +
                "parsedMoves=" + parsedMoves +
                '}';
    }
}
