
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.*;

public class TareaExc {


    public static String upperCaseFirstChar( String word) {

        String upperCase = word.toUpperCase();

        return upperCase.charAt(0) + word.substring(1, word.length() - 1);


    }


}
