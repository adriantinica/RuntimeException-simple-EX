import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateExceptionSimpleEx {

    public static void main(String[] args)  {
        try{
        int anInteger = readInteger();
        System.out.println("The entered value is: " + anInteger);
        }catch(ValueOutOfRangeException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("ERROR: only integer values accepted !!!");
        }
    }

    // suppose we need integers in 0...1000 range;

    public static int readInteger() throws ValueOutOfRangeException, InputMismatchException  {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value in range [0...1000]: ");
        int value = in.nextInt();
       

       // protect the range using exceptions
        if (value <0 || value >1000) {
            throw new ValueOutOfRangeException("ERROR: Only values within range [0...1000]accepted !!! ");
        }

        return value;
    }
}
// custom exception types
class ValueOutOfRangeException extends Exception{

    public ValueOutOfRangeException (String message){
        super(message);
    }
}
