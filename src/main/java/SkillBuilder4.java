
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {
    // make variables for finite states
    Boolean S0 = false; //not T
    // replace this line with your constants either true or false for the states, boolean

    public static String findTYPattern(String s) {
        boolean S0 = false;
        String place = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 't' || s.charAt(i) == 'T') {
                S0 = true;
            }
            if (S0 == true) {
                place += s.charAt(i);
                if (s.charAt(1) == 'y' || s.charAt(i) == 'Y') {
                    S0 = false;
                }
            }
            if (place.contains("y") || place.contains("Y")) {
                return place;
            }
        }
        return "";
    }
}

        //find character "t" or "T" using charAt
