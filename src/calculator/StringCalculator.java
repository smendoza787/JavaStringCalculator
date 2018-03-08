package calculator;

import java.util.ArrayList;
import java.util.Collection;

public class StringCalculator {

  public int add(String numbers) {
    int answer = 0;

    if (numbers.length() > 0) {
      String[] strArray = numbers.split(",|\\r?\\n");

      for (String numStr : strArray) {
        int strToInt = Integer.parseInt(numStr);
        answer += strToInt;
      }
    }

    return answer;
  }
}
