package com.gentlekboy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Welcome user
        System.out.println("Hello there! My name is Kay. \nWhat's your name, please?");

        //Get user's name
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        //Count from a number to another number
        System.out.println("\nNice to meet you, " + name + "!\nI can count from any number you specify to any number you want me to. \nKindly enter a starting number below:");
        int countFromThisNumber = input.nextInt();

        System.out.println("\nAwesome! Now enter the last number below:");
        int countToThisNumber = input.nextInt();

        for (int i = countFromThisNumber; i <= countToThisNumber; i++){
            System.out.println(i + "!");
        }

        //Ask user a programming question
        askAProgrammingQuestion();

        //Get user's answer
        int userAnswer = input.nextInt();

        //Validate user's answer
        while (userAnswer == 1 || userAnswer == 2 || userAnswer == 4){
            System.out.println("\nPlease, try again.");
            userAnswer = input.nextInt();
        }

        while (userAnswer != 3){
            System.out.println("\nInvalid option!\nNOTE: Kindly enter 1 for option 1, 2 for option 2, 3 for option 3 and 4 for option 4");
            userAnswer = input.nextInt();
        }

        //Congratulate user if he correctly answers the question
        System.out.println("\n\nCongratulations, have a nice day!");
    }

    public static void askAProgrammingQuestion(){
        System.out.println("\nWhat do you think is the answer to this question?");

        String question = "A loop that does not end is called what?";
        String option1 = "1. Recursive loop";
        String option2 = "2. while loop";
        String option3 = "3. infinite loop";
        String option4 = "4. for each loop";

        System.out.println(question + "\n" + option1 + "\n" + option2 + "\n" + option3 + "\n" + option4);
        System.out.println("NOTE: Kindly enter 1 for option 1, 2 for option 2, 3 for option 3 and 4 for option 4");
    }
}
