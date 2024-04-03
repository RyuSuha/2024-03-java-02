package com.green.day15;

public class StarTest {
    public static void main(String[] args) {
        Star star = new Star();
        star.singlePrint(10); //***** (개행)
        star.singlePrint(7); //******* (개행)
        System.out.println("--------------------");
        star.squarePrint(3);
        System.out.println("--------------------");
        star.trianglePrint(8);
        //*
        //**
        //***
        //****
    }
}

class Star {
    void trianglePrint(int n) {
        for(int i=1; i<=n; i++) {
            singlePrint(i); // i는 1부터 n까지 1씩 증가하므로 singlePrint(i)
        }
    }

    void squarePrint(int n) {
        for(int i=0; i<n; i++) {
            singlePrint(n);
        }
    }
    void singlePrint(int n) {
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
