import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //====Type Wrappers (ep 50)====

        // Converting Parameter Data Type to Object

        //old methode (below java v9)
        Character char1 = new Character('c');
        System.out.println(char1);

        //new methode (java 9+)
        Character char2 = Character.valueOf('c');

        //Booleans 4methodes (2 old methodes | 2 new met..)

        //old methode 1
        Boolean bol1 = new Boolean(true);
        System.out.println(bol1);

        //old methode 2 (string as param)
        Boolean bol2 = new Boolean("truejk");
        //if not true it will be false automaticly
        System.out.println(bol2);

        //new methode 1
        Boolean bol3 = Boolean.valueOf(true);
        System.out.println(bol3);

        //intiger
        Integer intone = Integer.valueOf(20);
        System.out.println(intone);

        //Converting Object to datatype

        Integer obj = Integer.valueOf(30);
        int i = obj.intValue();
        System.out.println(i + " = " + obj);

        System.out.println();
        System.out.println();

        //====Autoboxing (ep 51)=====
        //Automatic Convertion Datatype to
        //it's wrapper
        //Bc its ezy

        Integer yeet = 100; //wrapper  //boxing
        int yeetunbox = yeet; //datatype  //unboxing

        class Autobox{
            static int kahoot(Integer damn){
                return damn;
            }
        }
        Integer int5 = Autobox.kahoot(250);

        Boolean a1 = true; //typeWrapper //Boxing //Object
        boolean b1 = true; //Datatype //Unboxing


        //====Reading-Input-(BufferedReader)(ep 52)====
        //Reading Input from the Console :D
        char input1 = 'f';

        InputStreamReader inByte = new InputStreamReader(System.in);
        //----------input staff from console as bytestream
        BufferedReader inCara = new BufferedReader(inByte);
        //--Converting inByte bytestream to chatacter stream

        System.out.println("type any one letter..");
        try{
            input1 = (char) inCara.read();
            //we have to cast the input to char
            //or else its give accsi code

        }catch (IOException ee){
            System.out.println(ee);
        }
        System.out.println("ur letter : " + input1);

        char input2 = 'f';

        //This thing print out every character u enter untill X
        System.out.println("type any one letter..");
        System.out.println("press x to next.");
        System.out.println();
        System.out.println();
        try{
            do{
                input2 = (char) inCara.read();
                System.out.println(input2);
            }while (input2 != 'x');
            //we have to cast the input to char
            //or else its give accsi code

        }catch (IOException ee){
            System.out.println(ee);
        }
        System.out.println("ur letter : " + input2);

        //====Reading Lines (ep 53)======
        System.out.println("Input one line : ");

        InputStreamReader ir2 = new InputStreamReader(System.in);
        BufferedReader br2 = new BufferedReader(ir2);

        String stringInput = "unknown";
        try{
            stringInput = br2.readLine();
            //storing one line of input
        }catch (IOException eeee){
            System.out.println(eeee);
        }
        System.out.println(stringInput);

        //-----------------------|
        //TExt Editor Programme |
        //---------------------|

        System.out.println();
        System.out.println();

        System.out.println("starting notepad [V01]");
        System.out.println();

        String textInputArray[] = new String[100];
        //Making array bc we have to store multiple lines

        System.out.println("Enter The text");
        System.out.println("stop for stop");
        System.out.println();

        try {
            for(int ii = 0;ii<100;ii++){
                textInputArray[ii] = br2.readLine();
                if(textInputArray[ii].equalsIgnoreCase("stop")){
                    break;
                }
            }
            System.out.println("----------------------------------");
            System.out.println("outputing output");
            for(int ii = 0;ii<100;ii++) {
                if (textInputArray[ii].equalsIgnoreCase("stop")){
                    break;
                }
                System.out.println(textInputArray[ii]);
            }
            System.out.println("----------------------------------");

        }catch (IOException eee){
            System.out.println(eee);
        }

        //====Reading Input from file (ep 54)=====
        


    }
}