import javassist.tools.reflect.Reflection;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //==== Reflection Basics (ep 87)======
        //Basically Grab Infomation from class
        Class c1 = int.class;
        System.out.println(c1.getName());

        Class dogClass = Dog.class;
        System.out.println(dogClass.getName());
        System.out.println(dogClass.hashCode());

        Constructor[] con = new Constructor[0];
        try {
            con = new Constructor[]{dogClass.getConstructor()};
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        for (Constructor co : con){
            System.out.println("constructer name : " + co.getName());
            System.out.println("get methode : " + Arrays.toString(co.getDeclaringClass().getMethods()));
        }

        //==== Reflection constr methode invocation (ep 88)======

        try {
            Class llamaClass = llama.class;
            Constructor constructor = llamaClass.getConstructor(String.class, int.class, String.class, boolean.class);
            llama llama = (llama) constructor.newInstance("bob", 2, "red", true);
            System.out.println(llama);
            Method method = llamaClass.getMethod("spit");
            method.invoke(llama);

            System.out.println();
            System.out.println();

            //if you are accessing class that
            //u wont create this will be usefull


            Method[] methods = llamaClass.getDeclaredMethods();
            for(Method meth : methods){
                if (meth.getParameterCount() == 0){
                    System.out.println(meth.invoke(llama));
                }

            }


            //Access Field and Change values

            System.out.println(llama);

            Field eyeField = llamaClass.getDeclaredField("eyeCount");
            eyeField.setAccessible(true);
            eyeField.set(llama, 30);

            System.out.println(llama);



        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println();

        //==== Reflection - Reflection Library (ep 89)======
        //Reflection library and get annotations at runtime

        Reflections reflections = new Reflections();

        Set<Field> fields = reflections.getFieldsAnnotatedWith(Wire.class);
        System.out.println(fields);
        //FoodController foodController = new FoodController();
        //foodController.HandleCooking();









    }
}