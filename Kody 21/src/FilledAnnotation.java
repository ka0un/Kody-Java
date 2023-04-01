public @interface FilledAnnotation {
    String name() default "Bob";
    //if you dont specify the name it will be bob
    int value();
}
