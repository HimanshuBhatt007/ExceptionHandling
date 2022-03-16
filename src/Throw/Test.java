package Throw;

public class Test {

    int a = 100;
    int b = 0;
    int c;

    void divide(){
        try{
            c = a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }

    }


}
