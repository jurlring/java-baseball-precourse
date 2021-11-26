package input;

import camp.nextstep.edu.missionutils.Console;
import output.Output;

public class User {

    private static final int BALL_SIZE=3;
    private static final char UPPER_BOUND='9';
    private static final char LOWER_BOUND='1';

    Output output=new Output();

    public static String userInput() {
        Output.pleaseInput();
        String userInput=Console.readLine();
        checkException(userInput);
        return userInput;
    }

    public static void checkException(String userInput) {
        if (!checkSize(userInput)||!checkRange(userInput.toCharArray()))
            throw new IllegalArgumentException();
    }

    private static boolean checkRange(char[] toCharArray) {
        for(char c:toCharArray){
            if (c>UPPER_BOUND||c<LOWER_BOUND)
                return false;
        }
        return true;
    }


    private static boolean checkSize(String userInput) {
        if (userInput.length()==BALL_SIZE)
            return true;
        return false;
    }
}