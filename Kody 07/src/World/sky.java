package World;
//when you have a class inside of package
//you have to include this in your class
//(i mean file)
//if this class in a package inside of another package
//like (Word > SkyandClouds > sky.java) then;
// package World.SkyandClouds;


//Encapsulation - basically limiting the access



public class sky {
    public static int birds = 15;
    //public - can be access anywhere

    private  static  int jets = 10;
    //private - can be access only in this class

    static  int boats = 10;
    //none - can be access only in this package

    protected   static  int drones = 10;
    //protected - can be access only in subclasses
    // means u have to extends sky for access this

    //These are also clalled access modifer



}
