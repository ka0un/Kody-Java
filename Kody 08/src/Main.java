public class Main {
    public static void main(String[] args) {
        //====Interfaces (ep 31)==========
        //Interfaces are just blueprint for classes
        //its just almost like a Custom Super class
        //means you have classes
        //you can make interface in scr file

        Cat mew = new Cat();
        Dog baw = new Dog();

        mew.move();
        baw.move();

        mew.die();
        baw.die();

        Animal meeew = new Cat();
        meeew.die();
        //this thing gonna execute die methode in cat class

        System.out.println();
        System.out.println();

        //check caffee

        class coffee implements nestcafe.nestcafeint{

            //if you implement interface you must have to
            //add the methodes and their body in this class
            //or u will get error like this

            //Class 'coffee' must either be declared abstract
            // or implement abstract method 'getcafe()' in
            // 'nestcafeint'


            public void getcafe() {
                System.out.println("U got cafe");
            }
        }

        //====Default Methodes Jdk8+ (ep 32)======

        //Basically methode with body inside of
        //interface
        //check jump methode in Animal Interface

        mew.jump();

        System.out.println();
        System.out.println();

        //====Static and Private interface methodes Jdk9+ (ep 33)======

        //If you have static methode in a interface
        //you can access it without needing to
        //create an object (check Animals > fly)

        Animal.fly();



        


    }
}