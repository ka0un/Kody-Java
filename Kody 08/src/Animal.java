public interface Animal extends MorAnimals{
    //you can extend interface into another interface
    //Now you have to include all methodes in here and
    //MorAnimals if you are implementing Animlas

    int C = 19;
    //any Var inside of Interface is Final (Constant)
    //means u cannot change (edit) that

    void move();
    void die();


    //default methode
    //check main class for mor info
    default void jump(){
        System.out.println("Try and try you can fly");
    }

    //static methode
    static void fly(){
        trying();
        trying();
        System.out.println("ur flying boi");
    }

    //private methode
    //can be only access inside the interface
    private static void trying(){
        System.out.println("trying");
    }

}
