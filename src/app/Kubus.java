package app;

import java.util.Scanner;

public class Kubus {
    public static void main(String[] args) {
        float sisi;

        Scanner Input = new Scanner(System.in);

        System.out.println("Program Untuk Menghitung Luas dan Volume Kubus");
        System.out.println("Sisi ? ");
        sisi = Input.nextFloat();
        
        float Luas = 6 * (sisi*sisi);
        float Volume = sisi*sisi*sisi;

        System.out.println("Luas Permukaan kubus adalah : " + Luas);
        System.out.println("Volume kubus adalah : " + Volume);
    }
}
