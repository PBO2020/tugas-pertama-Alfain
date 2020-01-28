package oop;

public class Kalkulator {

    private int angka1;
    private int angka2;
    private int hasiltambah;
    private int hasilkurang;
    private int hasilkali;
    private int hasilbagi;

    public void setAngka1(int angka1) {
        this.angka1 = angka1;
    }

    public int getAngka1() {
        return this.angka1;
    }

    public void setAngka2(int angka2) {
        this.angka2 = angka2;
    }

    public int getAngka2() {
        return this.angka2;
    }

    public void setHasiltambah(int hasiltambah) {
        this.hasiltambah = hasiltambah;
    }

    public int getHasiltambah() {
        hasiltambah = angka1 + angka2;
        return hasiltambah;
    }

    public void setHasilkurang(int hasilkurang) {
        this.hasilkurang = hasilkurang;
    }

    public int getHasilkurang() {
        hasilkurang = angka1 - angka2;
        return hasilkurang;
    }

    public void setHasilkali(int hasilkali) {
        this.hasilkali = hasilkali;
    }

    public int getHasilkali() {
        hasilkali = angka1 * angka2;
        return hasilkali;
    }

    public void setHasilbagi(int hasilkali) {
        this.hasilbagi = hasilbagi;
    }

    public int getHasilbagi() {
        hasilbagi = angka1 / angka2;
        return hasilbagi;
    }

}

//Alfain Azzaria Bustami - 6701194082