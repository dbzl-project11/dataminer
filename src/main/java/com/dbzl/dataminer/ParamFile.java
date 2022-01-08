package com.dbzl.dataminer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface ParamFile {


    default int getIntFromBytes(byte[] rawBytes, int startIndex){
        byte[] bytes = {rawBytes[startIndex], rawBytes[startIndex+1], rawBytes[startIndex+2], rawBytes[startIndex+3]};
		return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }

    default float getDoubleFromBytes(byte[] rawBytes, int startIndex){
        byte[] bytes = {rawBytes[startIndex], rawBytes[startIndex+1], rawBytes[startIndex+2], rawBytes[startIndex+3]};
		return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getFloat();
    }

    default int getShortFromSingleByte(byte[] rawBytes, int startIndex){
        byte[] bytes = {rawBytes[startIndex], 00};
        return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getShort();
    }

    default int getShortFromTwoBytes(byte[] rawBytes, int startIndex){
        byte[] bytes = {rawBytes[startIndex], rawBytes[startIndex+1]};
        return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getShort();
    }

    default int getInt(byte[] rawBytes, int startIndex){
        return Integer.valueOf(rawBytes[startIndex]);
    }

    default boolean getBooleanFromByte(byte[] rawBytes, int index){
        return rawBytes[index] !=0;
    }

}
