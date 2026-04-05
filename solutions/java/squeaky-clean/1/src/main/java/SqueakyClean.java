class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        boolean capitalizeNext = false;

        for (char ch : identifier.toCharArray()) {

            // whitespace → underscore
            if (Character.isWhitespace(ch)) {
                builder.append("_");
                continue;
            }

            // hyphen → trigger camelCase
            if (ch == '-') {
                capitalizeNext = true;
                continue;
            }

            // leetspeak conversion
            switch (ch) {
                case '4': ch = 'a'; break;
                case '3': ch = 'e'; break;
                case '0': ch = 'o'; break;
                case '1': ch = 'l'; break;
                case '7': ch = 't'; break;
            }

            // apply capitalization if needed
            if (capitalizeNext) {
                builder.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                if(Character.isLetter(ch)){
                builder.append(ch);
                }
            }
        }

        return builder.toString();
    }
}