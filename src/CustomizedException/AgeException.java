package CustomizedException;

public class AgeException extends Exception{

    AgeException(){
        super("You are under age");
    }
    AgeException(String message){
        super(message);
    }


}
