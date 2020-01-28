package oop;

public class OOP {

    private int angka1;
    private int angka2;

    public static void main(String[] args) {
        Kalkulator tm = new Kalkulator();

        tm.setAngka1(50);
        tm.setAngka2(10);

        System.out.println("Angka 1           = " + tm.getAngka1());
        System.out.println("Angka 2           = " + tm.getAngka2());
        System.out.println("=======================");
        System.out.println("Hasil Penjumlahan = " + tm.getHasiltambah());
        System.out.println("Hasil Pengurangan = " + tm.getHasilkurang());
        System.out.println("Hasil Perkalian   = " + tm.getHasilkali());
        System.out.println("Hasil Pembagian   = " + tm.getHasilbagi());
    }

}

//Alfain Azzaria Bustami - 6701194082