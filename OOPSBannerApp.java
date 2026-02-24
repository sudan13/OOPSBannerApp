/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 *
 * This use case extends UC5 by implementing a modular approach
 * to generate each letter's pattern through dedicated methods.
 *
 * @author Developer
 * @version 6.0
 */

public class OOPSBannerApp {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[]{
                "*******  ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[]{
                "  ****** ",
                " **    **",
                "**       ",
                "  *****  ",
                "       **",
                "**    ** ",
                " ******  "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {

        // Declare String Arrays to hold patterns for each letter
        String[] oPattern1 = getOPattern();
        String[] oPattern2 = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop to assemble and print each line of the banner
        for (int i = 0; i < oPattern1.length; i++) {
            System.out.println(oPattern1[i] + "  "
                    + oPattern2[i] + "  "
                    + pPattern[i] + "  "
                    + sPattern[i]);
        }
    }
}
