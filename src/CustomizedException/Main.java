package CustomizedException;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Voting v = new Voting();
        v.validToVote(2);

        Voting1 v1 = new Voting1();
        int age = sc.nextInt();
        try{
            v1.validVotingAge(age);
        }catch(AgeException1 e){
            System.out.println(e);
        }
        System.out.println("hello");

    }
}
