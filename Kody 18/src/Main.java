import mjson.Json;

import javax.swing.*;
import java.sql.SQLData;
import java.sql.SQLOutput;
import java.util.*;
import java.util.Timer;

//the class that represent our task
class Eattask extends TimerTask{
    public void run() {
        System.out.println("eated");
        System.out.println("end our task");
    }
}
public class Main {
    public static void main(String[] args) {
        //=====Scheduling Tasks (Timer & Timertask) (ep 79)====

        Eattask task1 = new Eattask();
        //setting timer
        Timer timer1 = new Timer();
        timer1.schedule(task1, 1000, 500);

        //you have to sleep the thread before cancel
        //if not its just cansel the timer just
        //after scduling it.

        try{
            Thread.sleep(1001);
        }catch (InterruptedException exe){
            System.out.println(exe);
        }

        timer1.cancel();

        //====Hashmaps (ep 80)=====

        //this is part of java collection
        //libruary

        //hashmap is for store pair of objects
        //key - value pair

        HashMap<String, Integer> phonenumber = new HashMap<>();
        phonenumber.put("Kasun", 0776267621);
        phonenumber.put("Nethun", 0444467621);
        phonenumber.put("Sithumni", 077666621);

        System.out.println(phonenumber.get("Kasun"));

        System.out.println();

        //Removing Pair of hashmap
        phonenumber.remove("Kasun");

        //If you wanna print whole hashmap
        //you have to convert it to set

        for (Map.Entry<String, Integer> set : phonenumber.entrySet()){
            System.out.println(set.getKey() + " " + set.getValue());
        }

        System.out.println();

        //Update value of the key
        System.out.println("Old : " + phonenumber.get("Kasun"));
        phonenumber.put("Kasun", 34567890 );
        System.out.println("New : " + phonenumber.get("Kasun"));

        System.out.println();


        //====Iterator and Listliterator  (ep 81)====
        //Usefull for lopp or getting all elements from list (collection)

        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("Aww");
        ar1.add("eww");
        ar1.add("aaa");
        ar1.add("uhm");

        Iterator<String> ar1IT = ar1.iterator();
        while (ar1IT.hasNext()){
            System.out.println(ar1IT.next());
        }

        System.out.println();

        HashMap<String, String> map = new HashMap<>();
        map.put("aww","man");
        map.put("Cree","Pah");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, String> pair = it.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        System.out.println();

        //listiterator - special type of
        //iterator for the lists

        ListIterator<String> its = ar1.listIterator();
        System.out.println("names : ");
        while (its.hasNext()){
            System.out.println(its.next());
        }

        System.out.println("names backwords: ");
        while (its.hasPrevious()){
            System.out.println(its.previous());
        }


        //====jSON(mJSON) (ep 82)=====

        try{
            //Converting String to Json Object
            String jsonString = "{" +
                    "\"name\": \"BillyBob\"" +
                    "}";

            //converting json string to actual json object
            Json jsonObject = Json.read(jsonString);
            System.out.println(jsonString);


        }catch (Json. MalformedJsonException e){
            System.out.println(e);
        }

        //making arry in json
        String jsonst1 = "[45, 21, \"booty\", false]";
        Json jsonob1 = Json.read(jsonst1);
        System.out.println(jsonob1);

        Json array = Json.array("Kasun", "Nethun", "Sithumni", true, 21);
        System.out.println(array);

        //converting Any data type -> Json Object
        Json object = Json.make(45);


        //Arraylist -> Json Object
        ArrayList<String> xtrings = new ArrayList<>();
        xtrings.add("Kasun");
        xtrings.add("Nethun");
        xtrings.add("Sithumni");
        Json obj = Json.make(xtrings);
        System.out.println(obj);

        //Hashmap -> Json Object
        HashMap<String, Boolean> tf = new HashMap<>();
        tf.put("Watermellon", true);
        tf.put("Banana", false);
        tf.put("Mango", false);
        tf.put("Apple", true);
        Json obj2 = Json.make(tf);
        System.out.println(obj2);

        //Making Json Object by itself
        Json newobj = Json.object("waterm", true,"banana", false);
                                         // KEY^   ^VALUE
        System.out.println(newobj);

        //you can make it to next line
        Json newobj2 = Json.object(
                "Name", "kasun",
                "Age", 16,
                "Ismale", true
        );
        System.out.println(newobj2);

        //Getting Data from json Object
        System.out.println(newobj.at("waterm"));
        System.out.println(array.at(0));

        //Strong Json Value to Var
        int myage = newobj2.at("Age").asInteger();
        System.out.println(myage);

        if (newobj2.at("Ismale").isBoolean()){
            System.out.println("Yeah it is Boolean Wdym!");
        }

        //converting json arry to regular java array
        List<Object> name = obj.asList();
        System.out.println(name);

        //Arrays are showing like [this]
        //Jsons are shwing like {this} ok? ..make sence?

        System.out.println();

        Json kasunar = Json.array("One", "Two", "Three");
        Json kasunObj = Json.object("Kasun", true);
        //Changing Value of Json obj
        System.out.println(kasunObj);
        kasunObj.set("Kasun", false);
        System.out.println(kasunObj);

        //Adding Value to Json Array
        kasunar.add("four");
        System.out.println(kasunar);

        //Delete Value from Json Array
        kasunar.delAt(2);
        System.out.println(kasunar);

        //Merge two json Arrays
        Json one1 = Json.array("One", "Two", "Three", "Four");
        Json two2 = Json.array("five", "Six", "Seven");
        two2.with(one1);
        System.out.println(two2);

    }
}