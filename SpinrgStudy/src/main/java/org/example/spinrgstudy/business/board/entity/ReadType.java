package org.example.spinrgstudy.business.board.entity;

public enum ReadType {
    R("Read"),
    W("Write");

    private String value;

    ReadType(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
