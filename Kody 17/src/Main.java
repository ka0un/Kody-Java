import java.nio.MappedByteBuffer;
import java.util.*;

import static java.util.Calendar.*;

class Averager{
    double marks;
    double total;

    public Averager(int marks, int total) {
        this.marks = marks;
        this.total = total;
        double avarage = (this.marks/this.total)*100;
        System.out.println("average : " + (int) avarage + "%");
    }


}

public class Main {
    public static void main(String[] args) {
        //Starting Java Libruary Series
        //====Creating String Objects (vd 69)====

        String bob = "God";
        //01. String is not a data type like int
        //02. bob is new object of Strings Class
        //03. Strings Are immutable witch means you
        //    cannot change or edit string objects
        bob = "notGod";
        // here you arent changing strings you are
        // just reassigning new object in String class

        String one = "abcd";
        String two = "abcd";
        // These arent two objects, one and two actually
        // two differnt variavles but they are assign to same
        // object in the memory

        String example1 = "juicy";
        String example2 = new String("Juicy");
        //So both example1 and example2 is objects of
        //String class when you are makeing strings like
        //example1 its actually makeing new object like
        //example 2

        char[] letters = {'a', 'b', 'c'};
        String Alpha = new String(letters);
        //you can do ctrl + p inside of () for
        //view all params
        System.out.println(Alpha);
        //String saves letters as a char array

        //you can make strings with car arrays
        char[] nletters = {'k','a','s','u','n'};
        String nname = new String(nletters,2,3);
                        //When String gonna start ^       ^ How many chars shuld be in next
        System.out.println(nname);

        //you can make strings with byte arrays
        byte[] barray = {65,66,69};
        String bname = new String(barray);
        System.out.println(bname);

        String twel  = "twel : " + 1 + 2;
        //in this case String class converting 1 and 2 to
        //strings before adding them
        String three = "three : " + (1 + 2);
        //here 1 and 2 added first bc () operator
        //order, then convert the answe of that to string
        System.out.println(twel);
        System.out.println(three);

        Averager kasun = new Averager(60, 120);

        System.out.println();


        //====Character Extraction (ep 70)=======

        //extract single character
        String str = "Kasun";
        char letter =str.charAt(3);
        System.out.println(letter);

        //get multiple chars from string to array
        String large = "Im pretty Thic Lmao";
        char[] char2 = new char[6];
        large.getChars(3,9, char2,0);
        //          Where in the array whe gonna put this  ^
        System.out.println(char2);

        //get Bytearray from the string
        String smol = "this thing is smaller";
        byte[] bite = smol.getBytes();
        System.out.println(new String(bite));
        //you cant print bitearray so u have to convert it to
        //string

        //char array
        String smol2 = "this thing is THICKER";
        char[] charar = smol2.toCharArray();
        System.out.println(charar);

        System.out.println();

        //====String Comparison and Search methode (ep 71)====

         String s1 = "Bob";
         String s2 = "Sathan";
         String s3 = "kasun";
         String s4 = "Kasun";

        //Compairing Strings with Strings
        System.out.println(s1 + "=" + s2 + "->" + s1.equalsIgnoreCase(s2));
        System.out.println(s3 + "=" + s4 + "->" + s3.equals(s4));
        System.out.println(s3 + "=" + s4 + "->" + s3.equalsIgnoreCase(s4));

        //Compairing specific Region of two strings
        System.out.println(s2.regionMatches(1,s3,1,1));
        //Params (starting index of first word, next word, starting index of next word , how many characters next from that index

        //Checking Startwith or Endwith from string
        String random = "randompickel";
        System.out.println(random.startsWith("ran"));
        System.out.println(random.endsWith("XYe"));


        // [IMPORTANT]

        String b1 = "Hellow";
        String b2 = new String(b1);
        // == check the objects so its differnt
        System.out.println(b1 == b2);
        // .equals check the value so its same
        System.out.println(b1.equals(b2));

        //Telling whats word comes first in dictonary
        //this thing uses Ascii table so caps comes later
        //ignore caps for better results
        String apl = "aaale";
        String bna = "Zanana";
        System.out.println(bna.compareTo(apl));

        //getting index of specific character of string
        String bobby = "im the bobbye";
        System.out.println(bobby.indexOf('e'));
        System.out.println(bobby.lastIndexOf('e'));

        System.out.println();

        //====More String Methodes (ep 72)=====

        //Finding Subsrting
        String st1 = "kasun is better that sht";
        System.out.println(st1.substring(6,15));

        //Concatenate Strings (add)

        String add1 = "im ";
        String add2 = "kasun";
        System.out.println(add1.concat(add2));

        //Replace Characters
        String as = "Hellow World";
        System.out.println(as.replace('o', '0'));

        //Trimming Strings (removing black spaces of string)
        String damn = "           helow         ";
        System.out.println(damn.trim());
        System.out.println(damn.strip());
        System.out.println(damn.stripLeading());
        System.out.println(damn.stripTrailing());

        //Case Changing

        String eww = "USWQijiwsquiQWBU";
        System.out.println(eww.toUpperCase());
        System.out.println(eww.toLowerCase());

        String i1 = "i";
        String i2 = "Love";
        String i3 = "Bears";

        //Seperating
        System.out.println(String.join("/",i1,i2,i3));

        System.out.println();

        //====String Buffers and StringBuilder (ep 73)====

        StringBuffer sb2 = new StringBuffer(12);
        StringBuffer sb1 = new StringBuffer("ima string");
        //unlike normal strings , string buffers can be changed
        //string buffers normally have allocated memory space of
        //16 character.
        System.out.println(sb1);
        System.out.println(sb1.length());

        //adding things to stringbuffer
        sb1.append(" Bohoiii ").append(10);
        System.out.println(sb1);

        //inserting things to specifc places
        //in stringbuffer
        sb1.insert(3, " Cool");
        System.out.println(sb1);

        //reverse the string
        sb1.reverse();
        System.out.println(sb1);
        sb1.reverse();

        //deleting things in stringbuffer
        sb1.delete(4,16);
        System.out.println(sb1);

        //replacing parts of string
        sb1.replace(0,3,"we're");
        System.out.println(sb1);

        //Stringbuffer is threadsafe means u can use that
        //in many differnt threads

        //StringBuilder can be used only one thread at time

        //====Arraylist (ep 74)==========
        //starting from here we are using java collection
        //class

        //Regular Array[] - cannot be resized!
        //Arraylist<> - can be resized!

        ArrayList<String> list = new ArrayList<>(4);
        list.add("kasun");
        list.add("nethun");
        list.add("sithumni");
        list.add("sithum");
        System.out.println(list);

        list.add(1, "teddy");
        System.out.println(list);
        System.out.println(list.size());

        list.remove("kasun");
        System.out.println(list);

        //reducing chapacity to actual usage
        list.trimToSize();

        ArrayList<Double> dblist = new ArrayList<>();
        dblist.add(2.4);
        dblist.add(4.0);
        dblist.add(7.7);
        //Converting Arraylist to regular array
        Double dbls[] = new Double[dblist.size()];
        dblist.toArray(dbls);
        for (int i = 0; i<dbls.length;i++){
            System.out.println(dbls[i]);
        }

        //====Linklist (ep 75)=====

        //this is same as arraylist but its contains more
        //methodes

        LinkedList<String> llist = new LinkedList<>();
        llist.add("a");
        llist.add("b");
        llist.add("c");

        System.out.println(llist);

        //-adding elements first
        llist.addFirst("p");
        System.out.println(llist);

        /*https://www.geeksforgeeks.org/deque-interface-java-example/ */

        //====The Date Object (ep 76)====

        Date date1 = new Date();
        System.out.println(date1);

        Date datenv = new Date(0L);
        //You have to add how many milisecounds after 1970
        //for specify a date
        //https://currentmillis.com/
        System.out.println(datenv);
        System.out.println(System.currentTimeMillis());

        //====Calender and Gregorian Calender (ep 77)====

        Calendar cal1 = getInstance();
        System.out.println("year : " + cal1.get(YEAR));
        System.out.println("Date : " + cal1.get(DAY_OF_MONTH));
        System.out.println("Time : " + cal1.getTime());

        //gergorian calender

        //unlike before u can make objects with params
        GregorianCalendar gcal = new GregorianCalendar(2019,1,2);
        System.out.println(gcal.getTime());

        System.out.println();
        System.out.println();

        //====Random Class (ep 78)====

        Random r1 = new Random();
        System.out.println(r1.nextDouble());
        System.out.println(r1.nextInt());
        System.out.println(r1.nextFloat());

        //you can generate random number bettween any value
        System.out.println(r1.nextInt(10));

        System.out.println();

        //contnious generation of random number
        r1.ints(3).forEach(System.out::println);

        System.out.println();

        //sudo Random number
        //basically you can assign seed
        //for random value so same seed means
        //same value

        Random r2 = new Random(2345678L);
        Random r3 = new Random(2345678L);
        System.out.println(r2.nextInt(100));
        System.out.println(r3.nextInt(100));

        System.out.println();
        System.out.println();





















    }
}