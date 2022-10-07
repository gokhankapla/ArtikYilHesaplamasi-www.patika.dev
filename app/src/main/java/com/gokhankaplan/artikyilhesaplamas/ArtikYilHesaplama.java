package com.gokhankaplan.artikyilhesaplamas;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int yil, artkyil, artkyil2;
        System.out.println("Yılı giriniz: ");
        Scanner input = new Scanner(System.in);
        yil = input.nextInt();
        artkyil = yil % 4;
        artkyil2 = yil % 400;
        if (artkyil == 0 && artkyil2 == 0) {
            System.out.println(yil + " bir artık yıldır.");
        }
        else {
            if (artkyil2 != 0){
                System.out.println(yil + " bir artık yıl değildir.");
            }
            else if (artkyil == 0) {
                System.out.println(yil + " bir artık yıldır.");
            }
        }

    }
}
