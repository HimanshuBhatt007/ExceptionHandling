package CustomizedException;

public class AgeException1 extends RuntimeException{

    AgeException1(){
        super("You are under age");
    }

    AgeException1(String message){
        super(message);
    }
}
