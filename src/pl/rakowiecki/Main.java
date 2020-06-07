package pl.rakowiecki;

import java.util.Scanner;

public class Main extends NumberFormatException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz zdanie: ");
        String sentence = scanner.nextLine();

        System.out.println("Co chcesz zrobić?\n1. Zamień litery na wielkie\n2. Zamień litery na małe");

        int choose = scanner.nextInt();

        


    }
}


