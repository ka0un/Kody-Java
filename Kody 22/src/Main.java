

public class Main {
    public static void main(String[] args) {
        //====Sealed Classes (ep 97)=====
        //way to stop classes extending our classes

        //01. Final       (Extendable by Nothing)
        //02. Sealed      (Extendable by Specific Classes)
        //03. Non-Sealed  (Extendable by Anything)

        //====Text Blocks (ep 98)=====
        //Jdk 16

        //old way
        String paragra = "iam a line \nima new line \nima 3rd line";
        System.out.println(paragra);

        //new way

        String paragranew = """
                
                i am a line
                another line
                lmao line
                bruh line""";

        //just have to enter """ 3 of em to make text blocks

        System.out.println(paragranew);

        //you can use this when representing things in json

        String json = """
                {   
                    "name": "kody",
                    "age": 24  
                }""";

        System.out.println(json);

        //you can use this when representing things in HTML

        String html = """
                <html>
                <head>
                    <title> woow </title>
                </head>    
                <body>
                    <h1>hi welcome </h1>
                </body>
                </html>    
                """;

        System.out.println(html);

        //formatted Methode
        //Just Replacing %s with
        //give arg

        System.out.println("""
                Myname is %s
                """.formatted("kasun"));

        //====Ternary Operator (ep 99)=====
        //a shorthand way of writing an if / else statements
        //thats returns a value


        //old way
        String message;
        if (true){
            message = "Hellow, World!";
        }else{
            System.out.println("Goodbye");
        }

        //Ternary = 3 parts

        //01. The condition
        //02. The expression (value to be return if true)
        //03. The expression (value to be return if false)

        //NEW WAY
        String message2;
        message2 = (true) ? "hellow World" : "Goodbye";
        //VAR = (condition) ? "show this if true" : "show this if false";

        System.out.println(message2);

        boolean wonGame = false;
        int points = 69;

        if(wonGame){
            System.out.println("Game won\nPoints : " + points);
        }else {
            System.out.println("Game loose\nPoints : " + points);
        }

        //Practicle Example
        System.out.println("Game Finish \n" + ((wonGame) ? "won" : "loose") + "\nPoints : " + points);


        //End OF the Java Playlist
        //https://www.youtube.com/playlist?list=PLfu_Bpi_zcDPNy6qznvbkGZi7eP_0EL77







    }
}