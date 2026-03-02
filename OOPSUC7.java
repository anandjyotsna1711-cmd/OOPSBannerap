public class OOPSUC7 {

    
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }

    
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[] {
                "  ***  ",
                " ** ** ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                " ** ** ",
                "  ***  "
            }),
            new CharacterPatternMap('P', new String[] {
                "****** ",
                "**   **",
                "**   **",
                "****** ",
                "**     ",
                "**     ",
                "**     ",
                "**     "
            }),
            new CharacterPatternMap('S', new String[] {
                " ***** ",
                "**     ",
                "**     ",
                " ***   ",;
                "    ** ",
                "    ** ",
                "    ** ",
                " ***** "
            })
        };
    }

    
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.character == ch) {
                return map.pattern;
            }
        }
        
        String[] empty = new String[8];
        for (int i = 0; i < 8; i++) empty[i] = "       ";
        return empty;
    }

    
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int rows = 8;

     
        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < message.length(); j++) {
                String[] pattern = getCharacterPattern(message.charAt(j), charMaps);
                line.append(pattern[i]);
                if (j < message.length() - 1) {
                    line.append("   "); 
                }
            }
            System.out.println(line.toString());
        }
    }

  
    public static void main(String[] args) {
        
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        
        String message = "OOPS";
        
        printMessage(message, charMaps);
    }
}