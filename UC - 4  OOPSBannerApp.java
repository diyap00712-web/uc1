public class BannerAppUC4 {

    public static void main(String[] args) {

        String message = "HELLO";

        String[] banner = createBanner(message);

        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static String[] createBanner(String text) {

        String[] bannerLines = new String[5];

        bannerLines[0] = String.join("  ",
                "H   H", "EEEEE", "L    ", "L    ", "OOOOO");

        bannerLines[1] = String.join("  ",
                "H   H", "E    ", "L    ", "L    ", "O   O");

        bannerLines[2] = String.join("  ",
                "HHHHH", "EEE  ", "L    ", "L    ", "O   O");

        bannerLines[3] = String.join("  ",
                "H   H", "E    ", "L    ", "L    ", "O   O");

        bannerLines[4] = String.join("  ",
                "H   H", "EEEEE", "LLLLL", "LLLLL", "OOOOO");

        return bannerLines;
    }
}