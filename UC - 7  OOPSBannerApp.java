import java.util.*;

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        List<CharacterPatternMap> patternList = new ArrayList<>();

        patternList.add(new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternList.add(new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        }));

        patternList.add(new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        }));

        // ✅ Now printing OOPS
        String word = "OOPS";

        printBanner(word, patternList);
    }

    private static void printBanner(String word, List<CharacterPatternMap> patternList) {

        int height = 5;

        for (int row = 0; row < height; row++) {
            for (char ch : word.toCharArray()) {
                for (CharacterPatternMap map : patternList) {
                    if (map.getCharacter() == ch) {
                        System.out.print(map.getPattern()[row] + "  ");
                    }
                }
            }
            System.out.println();
        }
    }
}