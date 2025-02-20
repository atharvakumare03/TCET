@FunctionalInterface
interface Sayable {
    String say(String message);
}

public class lambdaExp {
    public static void main(String[] args) {
        Sayable sayable = message -> "hi " + message + ", have a good day!! ";
        String greeting = sayable.say("everyone");
        System.out.println(greeting);
    }
}
