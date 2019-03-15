package com.example.myapp;

public class card {
   private int diem;
   private int ten;

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public int getTen() {
        return ten;
    }

    public void setTen(int ten) {
        this.ten = ten;
    }
    card(int diem, int ten){
        this.diem = diem;
        this.ten = ten;
    }
}
