package pl.rakowiecki;

import java.util.Scanner;

public class Main extends NumberFormatException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz zdanie: ");
        String sentence = scanner.nextLine();

        int leftBracket = 0;
        int rightBracket = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == '('){
                leftBracket++;
            }
            else if(sentence.charAt(i) == ')'){
                rightBracket++;
            }
        }

        if(rightBracket == leftBracket){
            System.out.println("Ilość nawiasów z zdaniu jest poprawna");
        }
        else{
            System.out.println("Ilość nawiasow w zdaniu jest niepoprawna");
        }




    }
}


