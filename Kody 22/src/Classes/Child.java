package Classes;

public sealed class Child extends Parent permits OtherChild, AnotherChild{
    //only classes that can extend this class - OtherChild and AnotherChild
}

//01. Final       (Extendable by Nothing)
//02. Sealed      (Extendable by Specific Classes)
//03. Non-Sealed  (Extendable by Anything)