package org.example.lambdas_and_functional_interfaces;

import org.example.Main;

public class UsingMethodReferences {
    public interface LearnToSpeak {
        void speak(String sound);
    }
    public static class DuckHelper {
        public static void teacher(String name, LearnToSpeak trainer) {
            trainer.speak(name);
        }
    }
    public static class Duckling {
        public static void makeSound(String sound) {
            LearnToSpeak learner = s -> System.out.println(s);
            DuckHelper.teacher(sound, learner);
        }
    }
    interface Converter{
        long round(double num);
    }
    interface StringStart{
        boolean beginningCheck(String prefix);
    }
    interface StringChecker{
        boolean check();
    }
    interface StringParameterChecker{
        boolean check(String text);
    }
    interface StringTwoParameterChecker{
        boolean check(String text, String prefix);
    }
    interface EmptyStringCreator{
        String create();
    }
    interface StringCopier{
        String copy(String value);
    }

    public static void main(String[] args) {

        Duckling.makeSound("Quack");
        Main.hr("Calling static method");
        Math.round(2.34);
        Converter methodRef = Math::round;
        Converter lamda = x -> Math.round(x);

        System.out.println(methodRef.round(100.1));
        System.out.println(lamda.round(90.1));

        Main.hr("Calling Instance Methods on a Particular Object");
        var str = "Zoo";
        StringStart methodRef1 = str::startsWith;
        StringStart lamda1 = s -> str.startsWith(s);

        System.out.println(methodRef1.beginningCheck("A"));
        System.out.println(lamda1.beginningCheck("A"));

        var str1 = "";
        StringChecker methodRef2 = str1::isEmpty;
        StringChecker lamda2 = () -> str1.isEmpty();

        System.out.println(methodRef2.check());
        System.out.println(lamda2.check());

        var str2 = "";
        StringChecker lamda3 = () -> str2.startsWith("Zoo");

        Main.hr("Calling Instance Methods on a Parameter");
        StringParameterChecker methodRef4 = String::isEmpty;
        StringParameterChecker lamda4 = s -> s.isEmpty();

        System.out.println(methodRef4.check("Zoo"));

        StringTwoParameterChecker methodRef5 = String::startsWith;
        StringTwoParameterChecker lamda5 = (s, p) -> s.startsWith(p);

        System.out.println(methodRef5.check("Zoo", "A"));
        System.out.println(lamda5.check("Zoo", "A"));

        Main.hr("Calling Constructors");

        EmptyStringCreator methodRef6 = String::new;
        EmptyStringCreator lamda6 = () -> new String();

        var myString = methodRef6.create();
        System.out.println(myString.equals("Zoo"));

        StringCopier methodRef7 = String::new;
        StringCopier lamda7 = x -> new String(x);

        var myString1 = methodRef7.copy("Zebra");
        System.out.println(myString1.equals("Zebra"));
    }
}
