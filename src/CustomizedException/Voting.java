package CustomizedException;

public class Voting{

    void validToVote(int age) { // for checked exception
        try{
            if (age<18){
                throw new AgeException();
            }else{
                System.out.println("You are eligible to vote");
            }
        }catch(AgeException e){
            e.printStackTrace();
        }

    }


}
