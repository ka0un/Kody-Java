import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@EmptyAnnotation
public class Main {
    //this is just a marker
    @FilledAnnotation(value = 12)
    private static final int thing =3;


    public static void main(String[] args) {
        //==== Annotation Basics (ep 90)======
        //==== Loop Thro Collections (ep 91)======
        // this is just part of stream api

        ArrayList<String> names = new ArrayList<>();
        names.add("Kasun");
        names.add("Nethun");
        names.add("Sithumni");
        names.add("Sithum");
        names.add("Sethuki");
        //The Ways that we can print all
        //items of names Arraylist

        System.out.println();
        System.out.println("01. For Loop");
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }


        System.out.println();
        System.out.println("02.For-Each loop");
        //(enhanced for loop)
        for (String name : names){
            System.out.println(name);
        }


        System.out.println();
        System.out.println("03.Iterator");
        //(are more efficient)
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println();
        System.out.println("04.For-Each (Consumer)");
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


        System.out.println();
        System.out.println("05.For-Each (lambda)");
        names.forEach(name ->{
            System.out.println(name);
        });


        System.out.println();
        System.out.println("06.For-Each (methode reference)");
        //same thing as 5 but less lines of code
        names.forEach(System.out::println);


        System.out.println();
        System.out.println("07.For-Each (stream api) [NEW] [ADVANCE+]");
        names.stream().forEach(name -> System.out.println(name));


        //==== Streams (ep 92)======


        //streams are just like assembly line
        //its getting input from collection
        //and do serveral things and output


        HashSet<Integer> num = new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        Set<String> newNumbers = num.stream()
                .filter(integer -> integer > 3) //filering larger than 3
                .map(String::valueOf) //converting to strings
                .collect(Collectors.toSet()); //converting to set of strings
        System.out.println(newNumbers);


        //Creating stream
        Stream.of(1.23,3.0,2.2,4.4);

        System.out.println();

        //==== Filtering Streams (ep 93)======

        List<String> emilySucks = Arrays.asList("kody", "lena", "emily", "paige", "leilani");
        emilySucks.stream()
                  .filter(name -> {
                      if (name.length() <= 4){
                          return true;
                      }else{
                          return false;
                      }
                  })
                 .forEach(System.out::println); //methode refernce

        System.out.println();

        ArrayList<Integer> numberss = new ArrayList<>();

        for(int i = 0;i<10000;i++){
            numberss.add(new Random().nextInt());
        }

        numberss.stream()
                        .filter(numbers -> {
                            if (numbers > 0){
                                return true;
                            }
                            return false;
                        }).forEach(System.out::println);

        //System.out.println(numberss);

        System.out.println();
        System.out.println();

        //====Transform Objects (ep 94)======

        //Mapping = Transforming one object to
        //another

        List<String> names2 = List.of("bob", "Kasun", "Bobbty", "uybxdwui", "yguju");
        //gonna transform this list of strings to integers

        names2.stream()
                .map(nam -> {
                    return nam.length();
                })
                .forEach(System.out::println);
        //getting length of the strings to stream of integers

        System.out.println();

        names2.stream()
                .map(names22 -> {
                    return names22.length();
                })
                .filter(num2 -> {
                    if (num2 > 3){
                        return true;
                    }
                    return false;
                })
                .forEach(System.out::println);
        //getting length of strings and filtering large ones to stream of integers

        System.out.println();
        System.out.println();

        //Example 02 - Transforming Integers to Multification of 20
        int[] tpnum = {13, 12, 11, 22, 10, 9, 8, 7, 222};
        Arrays.stream(tpnum)
                .map(tnum -> {
                    return tnum * 20;
                })
                .forEach(System.out::println);

        System.out.println();

        //Example 03 - Transforming (mapping) Int to Double

        Arrays.stream(tpnum)
                .mapToDouble(value -> value)
                //YOU JUST HAVE TO REDIERCT
                //DATA STREAM FROM THIS METHODE
                //FOR CONVERT STRING TO DOUBLE

                .forEach(System.out::println);

        System.out.println();
        System.out.println();


        //====Packaging Java file to Jar file (ep 95)======

        //Files > Project Structure > Artifacts
        //add > from modules + dependencies
        //Build > Build Artifacts

        //====Instants of Pattern Matching (ep 96)======
        // feature of java 16

        String thing = "i enjoy eating cheese.";
        Object obj = thing;

        //Checking obj is string or not

        //old way
        if (obj instanceof String){
            String string = (String) obj;
            System.out.println("String: " + string);
        }

        //new way (java 16)
        if (obj instanceof String string){
            System.out.println("String: " + string);
        }

        //Example (Determine the Shape)
        shapie shapie = new Rectangle(2.0, 3.0);

        if (shapie instanceof Rectangle r){
            System.out.println("Area : " + r.getHeight()* r.getHeight() );
        }else if(shapie instanceof Trangle t){
            System.out.println("Area : " + 0.5 * t.getBase() * t.getHeight());
        }else {
            System.out.println("idk");
        }
        // This code block checks if the object shapie is an instance of Rectangle or Trangle
        // If shapie is an instance of Rectangle, it calculates the area of the rectangle and prints it
        // If shapie is an instance of Trangle, it calculates the area of the triangle and prints it
         / If shapie is not an instance of either Rectangle or Trangle, it prints "idk"

        //Example 02 (Checking before running)

        if (shapie instanceof Trangle t && t.getHeight() > 2){
            //Height is checking if that's a triangle if not it didn't
        }


    }
}