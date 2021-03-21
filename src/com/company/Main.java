package com.company;
import java.util.Random;
import java.util.Scanner;
//new line inserted

public class Main {
    private int value1;
    private int value2;
    private String operator;
    int correct;
    static String optResponse="";

    public Main(String op) {
        Random rand = new Random();
        value1 = rand.nextInt(15);
        value2 = rand.nextInt(5);
        this.operator = op;

    }

    public void showQuestion() {
        if (operator.equals("+")) {
            System.out.printf("What is %d + %d ?\n", value1, value2);

        }
        else if (operator.equals("-")) {
            System.out.printf("What is %d - %d ?\n", value1, value2);

        } else
        {
            System.out.print("OPERATOR UNKNOWN....");
        }


    }

    public static void operation() {
        System.out.print("Enter which operation to perform + or - : ");
        Scanner input1 = new Scanner(System.in);
        optResponse = input1.next();

    }

    public boolean checkAnswer(int response) {
// TODO: check response against value1+value2...


        if (operator.equals("+")) {

            correct = value1 + value2;
        }
        else if (operator.equals("-")) {

            correct = value1 - value2;
        } else
        {
            System.out.print("OPERATOR NOT RECOGNIZED....");
        }

        if (response == correct) {
            System.out.printf("  Yes! Well Done... \n");
            return true;
        } else {
            System.out.printf("  No, the answer is %d.\n", correct);
            return false;
        }

    }

    public static void main(String[] args) {
        // write your code here
        operation();
        float x = System.currentTimeMillis();
        Main q = new Main (optResponse);
        q.showQuestion();
        Scanner input = new Scanner(System.in);
        int response = input.nextInt();
        q.checkAnswer(response);
        float y = System.currentTimeMillis();
        float time = (y-x)/1000;
        System.out.print(time);

    }
}
