package CustomizedException;

public class Voting1 {

    void validVotingAge(int age){ // for unchecked exception
        if(age<18){
            throw new AgeException1();
        }else{
            System.out.println("You are eligible to vote");
        }
    }
}
