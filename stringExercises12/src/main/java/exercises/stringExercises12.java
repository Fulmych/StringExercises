package exercises;
import java.lang.String;
import java.util.Arrays;
public class stringExercises12 {
    public static void main(String[] args) {
        char[] chars = {'J','A' ,'V' ,'A'};
        String s = Arrays.toString(chars);
        String replace = s.replace("'", "");
        String replace1 = replace.replace(",", "");
        String replace2 = replace1.replace("[", "");
        String replace3 = replace2.replace("]", "");
        System.out.println(replace3);
    }
}
