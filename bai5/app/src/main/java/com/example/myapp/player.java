package com.example.myapp;

public class player {
    int diem;
    String ten;
    public void setDiem(int diem) {
        this.diem = diem;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public int getDiem() {
        return diem;
    }
    player(String ten, int diem){
        this.ten = ten;
        this.diem = diem;
    }
}
