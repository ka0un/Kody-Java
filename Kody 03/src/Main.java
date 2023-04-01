public class Main {
    public static void main(String[] args) {

        //==========If Statemets (ep 09)=========
        //if statements
        int myAge = 1;
        int requiredAge = 20;

        //if my age is equal to the required age, say you are cool
        if (myAge == requiredAge){
            System.out.println("you are really CHOL");
            //inside of { } is called code block
        }

        //else is staring with end } of if condition

        if (myAge >= requiredAge){
            System.out.println("Good");
        }else{
            System.out.println("Bad");
        }

        //if older than 40 its too old
        //if 20 - 39 ok
        //if 10 - 19 too smil

        if (myAge > 40){ //if this condition true nothing else will be running
            System.out.println("too old");
        } else if (myAge >= 20) {
            System.out.println("ok");
        } else if (myAge >= 10) {
            System.out.println("too smol");
        } else if (myAge < 10) {
            System.out.println("stay away kiddo");
        }

        //nested IF statements (if statements inside of if statement
        //my own test

        //Create a program that prompts the user to enter their age and the amount of money
        //they have. The program should then determine whether they are eligible to
        //buy a ticket to a theme park. The rules for eligibility are as follows:

        //The user must be at least 18 years old
        //The user must have at least $20
        //If the user meets both of these conditions,
        //the program should print
        //"Congratulations! You are eligible to buy a ticket to the theme park."
        //If the user does not meet one or both of the conditions,
        //the program should print "Sorry, you are not eligible to buy a ticket to the theme park."



        int userAge = 20;
        int userBalance = 2;

        if (userAge >= 18){
            if (userBalance >= 20){
                System.out.println("Congratulations! You are eligible to buy a ticket to the theme park.");
            }else{
                System.out.println("Sorry, you are not eligible to buy a ticket to the theme");
            }

        }else{
            System.out.println("Sorry, you are not eligible to buy a ticket to the theme");
        }

        //=============Relational Operators (ep 10)===============

        //make a software that can identify 3 ints is a pythagorean
        //triples

        int aSide = 25;
        int bSide = 22;
        int cSide = 7;

        if ((aSide*aSide + bSide*bSide == cSide*cSide) || (bSide*bSide + cSide*cSide == aSide*aSide) || (aSide*aSide + cSide*cSide == bSide*bSide)){
            System.out.println("Correct! The three numbers form a Pythagorean triple");
        }else{
            System.out.println("Wrong! The three numbers do not form a Pythagorean triple");
        }

        //============Switch Statements (ep 11)============

        int Age = 1;
        switch (Age){
            case 19:
                System.out.println("Age is 19");
                break;

            case 20:
                System.out.println("Age is 20");
                break;

            case 21:
                System.out.println("Age is 21");
                break;

            default:
                System.out.println("Age Unrecodnised");
        }


        int aMonth = 8;
        switch (aMonth){
            case 1:
            case 2:
            case 3:
                System.out.println("Summer");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("Winter");
                break;

            default:
                System.out.println("None");


        }

        //===========While Loops (ep 12)==============

        //Loops - a way to repeate your code

        //          while(condition){
        //              //codeblock
        //          }

        // if this condition inside of the while loop is true
        // the code block inside of its runs again and again
        // if that condition flase that loop break out and
        // run the rest of the program..

        int num = 1;
        while (num < 6){
            System.out.println(num);
            num++;
        }
        System.out.println(num);

        //Score below 50 = bad
        //Score above 50 = good

        //arrayname.length = Size of the array

        double[] score = {12.2, 50, 51, 21, 105, 5.0};
        int index = 0; //index of the array
        while (index < score.length){
            if (score[index] >= 50){
                System.out.println(score[index] + " is Good" );
            } else if (score[index] < 50) {
                System.out.println(score[index] + " is Bad");
            }
            index++;
        }
        System.out.println("loop ended");

        //============For Loops (ep 13)============

       // for(initilization, condition, interaction){
       //     //codeblock
       // }

        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        //prime number checker
        int number;
        boolean prime;

        number = 678;

        if(number <2) prime = false;
        else prime = true;

        for (int i = 2; i <= number/i; i++){
            if((num % 2) == 0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println("this is a prime");
        }else{
            System.out.println("This is not prime");
        }

        //Tips

        // Multiple Vars can be created by this
        //int a, b, c;

        // Vars can be nothing
        //int mind = null;


         //=================Do-While Loops (ep 14)==========

        //     do{
        //         //codeblock
        //     }while(condition)

        int bob = 1;
        do{
            System.out.println(bob);
            bob++;
        }while(bob < 8);

        // this loop is runs once untill its can finally decide that
        // it need to be run on next time


    }
}



