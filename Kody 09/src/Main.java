public class Main {
    public static void main(String[] args) {
        //====Exception Handling (ep 34)====
        //exceptions are just errors (methodes)created
        //by java compiler or ourself manually

        //whenever compiler make an exception program
        //will be stop, but now we are gonna handle
        //it anc customize whats happends next

        //there are five keywords for that
        //1. Try
        //2. Catch
        //3. Throw
        //4. Throws
        //5. Finally

        // EXCEPTIONS ARE CLASSES

        // Throwable             (~super class)
        //    |
        // Exceptions           (~sub class)
        //    |
        // RuntimeExceptions   (~sub class)

      //  int bob = 500;
      //  int c = bob/0;

      //  System.out.println(c);

        //====Try and Catch (ep 35)=====
        int c;
        try{
            //try is looking for exceptions inside
            //of this code block and send it to the
            //catch

            int bob = 500;
            c = bob / 0;
            try{
                //You can create nested try

            }catch(ArithmeticException mommy){

            }


        }catch (ArithmeticException urname) {
            //once Catch caught the specific exception
            //in this case ArithmeticException
            //this code block will ran

            System.out.println("There was an issue");
            c = 0;
            System.out.println(urname); // this name
            //is gonna save actually error msg as a var
            //and u can print it like this

        }catch (ArrayIndexOutOfBoundsException e) {
            //you can make multiple catch like this
        }

        //java builtin Exception list
        //https://www.tutorialspoint.com/java/java_builtin_exceptions.htm

        //=====Throw Keyword (ep 36) ========
        //Throwing means Creation Exception

        //There are two types of exceptions

        //01. Unchecked Exceptions (RuntimeException)
        //-------------------------
        //didnt checking while compiling
        //so program will be start and run
        //smoothly unlit its find the eception
        //then shutdown

        //02. Checked Exception
        //--------------------------
        //Checked Exception will be checked
        //during Compile time and Program will
        //nerver run

        //Throw Keyword

        try{

            throw new NullPointerException("Description");

        }catch (NullPointerException Testingboi){
            System.out.println("Ball has been Theown to the code");

        }

        class bug{
            static void Net(){
                try{
                    throw new NullPointerException();
                }catch (NullPointerException Butterfly){
                    System.out.println("Butterfly Caught And released");
                    throw Butterfly; //this thing gonna
                                     //throw Butterfly again
                }
            }
        }

        try{
            bug.Net();
        }catch (NullPointerException Fly){
            System.out.println("Butterfly Caught and Killed");
        }

        System.out.println();
        System.out.println();


        //=====Throws Keyword (ep 37)===========
        //if you throw Checked Exception to the code
        //You cant even compile it so, if you added throws word to
        //your methode it bypass that and runs the program

        class mayomi{
            static void boi() throws ClassNotFoundException{
                System.out.println("CLASS NO");
                throw new ClassNotFoundException();
            }
        }

        try{
            mayomi.boi();
        }catch (ClassNotFoundException anotherbug){
            System.out.println("No Class Caught");
        }

        System.out.println();
        System.out.println();


        //======Final keyword (ep 38)========
        //is a peace of code that RUNS no matter anything

        try{
            throw new NullPointerException();
        }catch (NullPointerException bottle){
            System.out.println(bottle);
            System.out.println("Caught");
        }finally {
            //code inside here allways runs no matter what
            System.out.println("This thing allways RUNS");
        }



    }
}