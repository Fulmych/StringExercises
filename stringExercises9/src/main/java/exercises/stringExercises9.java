package exercises;
import java.lang.String;
public class stringExercises9 {
    public static void main(String[] args) {
        String s = "Oil and Water";
        String[] parts = s.split(" and ");
        String oil = parts[0];
        String water = parts[1];
        System.out.println(oil);
        System.out.println(water);
    }
}
