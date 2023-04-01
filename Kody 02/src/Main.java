public class Main {
    public static void main(String[] args){

        //==============Strings (ep 04)

        String dog = "Teddy";
        String status = "check1";

        System.out.println(dog + " " + status);
        System.out.println(dog + status + "this is not a var");

        //you can add number and text and space inside of string


        //============Type Convertion (ep o5)==========

        int jerry = 5000;
        long jerry2;
        jerry2 = jerry;
        System.out.println(jerry + jerry2);

        // int can easily fit inside of long bc it has long chapacity
        // but int cant fit inside of byte bc byte is too smol


        // casting - forcing change the datatye of variable

        byte casted = (byte)jerry;
        System.out.println(casted);

        // resalt is -120 but it shuld be 5000
        // if you want to force large data type into smol one you have to do casting

        double marks = 97.51;
        int marksRounded = (int)marks;
        System.out.println(marksRounded);
        //resault is just 97 bc decimals in double (.51) cant fit inside of int

        byte science = 100;
        byte maths = 100;
        byte commerce = 100;
        byte english = 100;

        int average = (science + maths + commerce + english)/4;

        System.out.println(average);


        //===============Arrays (ep 06)===========
        // arrays is list of variables all in one

        // [data type] [name][]

        //int date_in_weeks[] = new int[7];
        int date_in_weeks[];          //defining array
        date_in_weeks = new int[7];  //how many vars shuld be stored in arrays
        date_in_weeks[0] = 11;
        date_in_weeks[2] = 12;       //array number is starting from 0 there are
        date_in_weeks[3] = 13;       //7 vars stored in it
        date_in_weeks[4] = 14;       // you can change each var like this
        date_in_weeks[5] = 15;
        date_in_weeks[6] = 16;

        System.out.println(date_in_weeks[0]);
        System.out.println(date_in_weeks[3]);
        System.out.println(date_in_weeks[6]);

        //you can add data to array when building it and without
        //limiting number of memory (7) as before did

        int marksArray[] = {11, 22, 33, 44};
        //                   0   1   2   3

        System.out.println(marksArray[3]);
        //                    resault 44


        double testMarks[];
        testMarks = new double[5];
        testMarks[0] = 20.7;
        testMarks[1] = 29.7;
        testMarks[2] = 10.7;
        testMarks[3] = 23.7;
        testMarks[4] = 50.7;

        System.out.println((testMarks[0] + testMarks[1] + testMarks[2] + testMarks[3] + testMarks[4])/5);

        //============Arithmatic Operators (ep 07)==========
        // basically + - / *

        // + addition
        // - substarction
        // * multipication
        // / devetion
        // % modulus

        System.out.println(42 % 5);

        // Modulas - there are 8 fives inside of 42 and we remove those
        // we have left 2 so ansfer is 2

        System.out.println(40 % 5);

        // There are only 8 fives inside of 40 so if we remove that
        //we dont have anything left so ansfer is 0

        //Compound Assignment Operators

        // ++ increasement
        // -- decreasement

        // += addition assignment
        // -= substarction assignment
        // *= multipicatin assignment
        // /= devetion assignment
        // %= modular assignment

        int number = 5;
        //number = number + 5;       <-- same thing as here
        number += 5;
        System.out.println(number);

        int number2 = 10;
        //number = number + 1;
        number2 ++;
        System.out.println(number2);

        //Modulus Operator %

        //its just gives the remainder
        //15/3 = 5 (0 is the remainder)
        //17/5 = 3 (2 is the remainder)

        //Special Cases
        //o%5 = 0
        //5%0 = / by 0 error

        //=======Boolean logical Operators (ep 08)=========

        boolean isActive = true;
        boolean isGood = false;

        //01 And operator &
        // eg:- if you have to turn on both light switches to on the light,

        System.out.println(isActive & isGood);

        //02 or operator |
        // eg;- if you have to switch one light switch to on the light,

        System.out.println(isActive | isGood);

        //03 Xor operator ^
        // eg:- you have to toggle only one switch for on the lights
        // true ^ true = false

        System.out.println(isActive ^ isGood);

        //04 Short-circuit And operator &&
        // eg:- if both statements are correct (in order)
        //[sidenote] if you type ! and = near it will be != not equal

        System.out.println((isActive != isGood) && (isGood != isActive));
        //so isActive is not equal to is good and isgood is not equal to is active asnwer gonna be true

        //05 Short-circuit Or operator ||

        //if first one is true the asnwer is true if false and secound one is true the answer is true
        //if first one is false it didnt even care 2nd one

        System.out.println((isActive != isGood) || (isGood = isActive));
        //                       true                     false
        // so answer is gonna be true bc first one is true and it didnt even
        //care about 2nd one

        //06 NOT operator !
        //it will answer the opposite

        System.out.println(!isGood);
        System.out.println(!isActive);


    }
}