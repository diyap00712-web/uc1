public class BannerAppUC6 {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        // Printing O O P S
        for (int i = 0; i < o.length; i++) {
            System.out.println(
                    o[i] + "   " +
                    o[i] + "   " +
                    p[i] + "   " +
                    s[i]
            );
        }
    }

    // Static method for letter O
    public static String[] buildO() {
        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method for letter P
    public static String[] buildP() {
        return new String[] {
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        };
    }

    // Static method for letter S
    public static String[] buildS() {
        return new String[] {
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }
}