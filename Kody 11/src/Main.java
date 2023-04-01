import javax.print.attribute.SetOfIntegerSyntax;
import javax.print.attribute.standard.NumberOfDocuments;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        //====Interthread Comunication (ep 46)====

        //Producer = makes some useful variable
        //Consumer = use that Variable made by Producer

        //so after producer made new var consumer shuld use that
        //consumer cant use that before producer making the var
        //so if we loop consumer it will waste more cpu cycles
        //thats when interthreaded comunication came from
        //now consumer comunicate with the producer and
        //Runs after the producer made something

        class Queue{
            int n;

            boolean stop = false;

            synchronized int get(){
                while (!stop){
                    try {
                        wait();
                        //this thing waiting untill
                    }catch (InterruptedException e){
                        System.out.println(e);
                    }
                }

                System.out.println("Consumed n " + n);
                notify();
                stop = false;
                return n;
            }

            synchronized void set(int n){
                while (stop){
                    try{
                        wait(); // NEW
                    }catch (InterruptedException e){
                        System.out.println(e);
                    }
                }
                notify(); // NEW
                stop = true;
                this.n = n;
                System.out.println("Produced n " + n);
                //this thing dode
            }
        }

        class Producer implements Runnable{
            Queue q;
            Thread t;

            Producer(Queue q){
                this.q = q;
                t = new Thread(this, "Producer Thread");
            }

            public void run(){
                int i = 0;
                while(true){
                    q.set(i++);
                }
            }

        }

        class Consumer implements Runnable{
            Queue q;
            Thread t;

            Consumer (Queue q){
                this.q = q;
                t = new Thread(this, "Consumer Theread");
            }

            public void run(){
                while(true){
                    q.get();
                }
            }
        }


        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        //p.t.start();   //uncomment this
        //c.t.start();

        //====Suspending Threads (ep 47)=====

        class CoolThread implements Runnable{
            Thread t;
            boolean suspendthread;
            CoolThread(String name){
                t = new Thread(this, name);
                System.out.println("New Thread Created " + t);
                suspendthread = false;
            }

            public void run(){
                for (int i = 5;i > 0;i--){
                    try{
                        Thread.sleep(1000);
                        System.out.println(i);
                        synchronized (this){
                            while (suspendthread){
                                System.out.println("pausing thread...");
                                wait(); //PAUSING THE THREAD
                            }
                        }
                    }catch (InterruptedException e){
                        System.out.println(e);
                    }
                }
            }


            synchronized void Suspendthread(){
                suspendthread = true;
            }

            synchronized void ResumedThread(){
                suspendthread = false;
                notify(); //RESUMING THE THREAD
                System.out.println("resume thread...");
            }

        }

        CoolThread Thread1 = new CoolThread("oww");
        Thread1.t.start();

        try{
            Thread.sleep(2000);
        }catch (InterruptedException eee){
            System.out.println(eee);
        }

        Thread1.Suspendthread();

        try{
            Thread.sleep(2000);
        }catch (InterruptedException eee){
            System.out.println(eee);
        }

        Thread1.ResumedThread();

        try{
            Thread.sleep(4000);
        }catch (InterruptedException eee){
            System.out.println(eee);
        }

        System.out.println();
        System.out.println();

        //====Enumerations (ep 48)====
        // Enum is a name instance that define new data type

        //its special type of class that
        // we can define custom data types

        //Just a Collection of Constants

        enum Days{
            Monday, Tuesday, Wendsday, Thurstday, Friday, Sataday, Sunday

        }

        Days day = Days.Sataday;
        System.out.println("Today is " + day);

        System.out.println();

        if(day == Days.Monday){
            System.out.println("Its Monday!!");
        }else{
            System.out.println("Its not Monday :(");
        }

        switch (day){
            case Friday -> System.out.println("wow");
            case Sataday -> System.out.println("sleep");
        }

        System.out.println();
        System.out.println();

        //====Enumeration as Classes (ep 49)=====

        enum Colours{
            red(2), pink(3), yellow(4), orange(), blue(9);
            private int price; //variable
            Colours(int price) {
                this.price = price;
            }

            Colours(){
                //overridng the methode if it dosnt have params
                price = -1;
            }

            int getPrice(){
                return price;
            }

        }

        Colours colour1 = Colours.blue;
        System.out.println(colour1.getPrice());

        Colours colour2 = Colours.orange;
        System.out.println(colour2.getPrice());

        // Default methodes comming with enum
        // ordinal() - its gonna return the order of the constant
        //             inside of enum.

        System.out.println(colour2.ordinal()); //shuld return 3

        // compareTo() - its gonna compare the order of 2 constants
        //               in enum, if red comes before orange it will be
        //               positive value

        System.out.println(colour2.compareTo(Colours.red));







        
    }
}