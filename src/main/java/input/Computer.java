package input;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class Computer {

    public static Set<Integer> randomNumbers;

    static final int BASEBALL_LOWER_BOUND = 1;
    static final int BASEBALL_UPPER_BOUND = 9;
    static final int BASEBALL_MAX_SIZE = 3;

    public static Set<Integer> extractRandomNumbers() {
        resetRandomNumbers();
        while (!checkSize()) {
            extractRandomNumber();
        }
        return randomNumbers;
    }

    private static boolean checkSize() {
        if (randomNumbers.size() == BASEBALL_MAX_SIZE)
            return true;
        return false;
    }

    static void extractRandomNumber() {
        randomNumbers.add(Randoms.pickNumberInRange(BASEBALL_LOWER_BOUND, BASEBALL_UPPER_BOUND));
    }

    public static void resetRandomNumbers() {
        randomNumbers = new HashSet<>();
    }

}
