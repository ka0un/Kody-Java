import javax.sql.rowset.serial.SQLOutputImpl;
import java.io.InterruptedIOException;

public class Main {
    public static void main(String[] args) {
        //=======Multithereded Programming (ep 39)====
        //Running multiple things (Threads) at once

        //Life of a Thread
        //-----------------
        //01. Running/Ready to run
        //02. Suspended - temporarily stops the thread
        //03. Resumed - to tell a thread to stop being suspended
        //04. Blocked - when waiting for a resource
        //05. Terminated - thred is permenently stopped

        //Thread Priorities
        //-----------------
        //Scale   : 1 - 10
        //Default : 5

        //Main methode is a thread too..

        //Synchronization
        //-----------------

        //Asynchronization - a way to stop running multiple
        //threads at once, this is done by monitor
        //A monitor is basically a little box that a thread can
        //enter, and that will stop all other threads from running
        //untill the thread leaves the monitor

        //Basically its forced single threaded programming
        //for a limited time

        //Creating A Thread
        //------------------
        //theres 2 ways to do that

        //01. By extending Thread
        //02. By implementing Runnable


        //Some Methodes
        //-----------------
        //these methodes comes with threads by
        //default

        //getName     - Obtain Thread name
        //setName
        //getPriority - Obtain Thread Priority
        //setPriority
        //isAlvie     - Determin if a thread is still running
        //join        - Wait for thread to terminate
        //run         - Entry poin for the thread
        //sleep       - Suspend a thread for a period of time
        //start       - Strat a thread by calling its run methode.

        //======Main Thread (ep 40)==========
        //Accssing the main thread
        Thread myThread = Thread.currentThread();
        System.out.println(myThread);

        myThread.setName("owo");
        System.out.println(myThread);

        myThread.setPriority(4);
        System.out.println(myThread);

           //simple example or thread functions
        try{
            for(int i = 5; i > 0; i--){
                System.out.println(i);
                Thread.sleep(300);
                //this thing pause the programme
                //so its beasically adds
                //delay to programme
            }

        }catch (InterruptedException e){
            System.out.println(e);
        }


        //====Creating Threads (ep 41)=====

        class myThread implements Runnable{
            Thread one;
            //Thread variableRefference;

            myThread(){
            //Parameters (Runnable class, nameOfThread)
                one = new Thread(this,"owo");
                System.out.println("Child theard created : " + one);
            }

            public void run(){
                try{
                    for(int j = 5; j > 0; j--){
                        System.out.println(j);
                        Thread.sleep(200);
                    }
                }catch (InterruptedException ee){
                    System.out.println(ee);
                }
            }


        }
        myThread yummy = new myThread();
        yummy.one.start();

        System.out.println();
        System.out.println();

        //====Creating Multiple Threads (ep 42)====

        class Counter implements Runnable{
            String name;
            Thread t;
            Counter(String name){
                //constructer of the thread
                this.name = name;
                //equaling Counter parameter name for thread name
                t = new Thread(this, name);
                System.out.println("Created New Thread " + t);
            }

            public void run(){
                try{
                    for(int k = 3; k > 0; k--){
                        System.out.println(k);
                        Thread.sleep(300);
                    }
                }catch (InterruptedException eee){
                    System.out.println(eee);
                }
            System.out.println(t.getName() + " is done");
            }

        }

        //making multiple versions of same thread
        Counter thread1 = new Counter("kasun");
        Counter thread2 = new Counter("sithumni");
        Counter thread3 = new Counter("Nethun");


        //starting all of em together
        thread1.t.start();
        thread2.t.start();
        thread3.t.start();

        System.out.println();
        System.out.println();


        //=====isAlive() and join() (ep 43)======

        class Bear implements Runnable{
            String name;
            Thread b;

            Bear(String name){
                this.name = name;
                b = new Thread(this, name);
            }

            public void run(){
                System.out.println("Started Running");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException err){
                    System.out.println(err);
                }
                System.out.println("Frog");
            }


        }

        Bear t1 = new Bear("one");
        Bear t2 = new Bear("two");


        t1.b.start();

        try{
            t1.b.join();
        }catch (InterruptedException re){
            System.out.println(re);
        }
        //This peace of code stop the t2 thread untill t1 thread finish


        System.out.println("t1 isAlive : " + t1.b.isAlive());
        //isAlve output Boolian (true/falsae)


        t2.b.start();

        try{
            t2.b.join();
        }catch (InterruptedException ref){
            System.out.println(ref);
        }

        System.out.println();
        System.out.println();

        //====Synchronized Methodes (ep 44)=====
        //====Synchronized Statements (ep 45)=====

        // <!> too many messages so dont think
        // abt code except synchronized keyword

        class Message{
            synchronized void send(String message){
                //This is Synchronized Methode
                // when you add synchronized keyword to ur methode
                // its stops other synchronized methodes running
                // untill its runs itself

                //if you removed synchronized keyword from here
                //both outputs of message1 and message2 will be
                //shown in console at same time

                //but now its finish the message1 first
                //and start working with massage2 later


                System.out.println("Sending message ... ");
                System.out.println(message);

                try{                                //
                    Thread.sleep(1000);       //This is Just for
                }catch (InterruptedException rr){   //Add 1000ms Delay
                    System.out.println(rr);         //To the code
                }
                System.out.println("Message Sent !");
            }

        }

        class MessageThreader implements Runnable{
            String message;
            Thread p;
            Message msg;

            MessageThreader(Message msg, String message){
                this.message=message;
                this.msg=msg;
                p = new Thread(this);

            }


            public void run(){
                synchronized (msg){

                    //this is syncronized statement
                    //same as before its stops others
                    //untill this block finish
                    msg.send("damn Your Good");
                }
                msg.send(message);
            }

        }

        Message message = new Message();

        MessageThreader message1 = new MessageThreader(message, "owo is uwu");
        MessageThreader message2 = new MessageThreader(message, "yeet is teey");
        message1.p.start();
        message2.p.start();





    }
}