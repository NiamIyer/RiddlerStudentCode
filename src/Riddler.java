/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: YOUR NAME HERE
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";
        // For every character
        for (char character : encrypted.toCharArray()) {
            // Accounts for the Caesar shift
            int asciiValue = ((int)character) + 9;
            // If the character is an uppercase letter, account for any wraparound and add shift
            if (Character.isUpperCase(character)) {
                if (asciiValue > 90) {
                    asciiValue = 64 + (asciiValue - 90);
                }
                character = (char)asciiValue;
            }
            // Does same for lowercase letter
            else if (Character.isLowerCase(character)) {
                if (asciiValue > 122) {
                    asciiValue = 96 + (asciiValue - 122);
                }
                character = (char)asciiValue;
            }
            // Adds the modified character to decrypted (doesn't change any punctuation)
            decrypted = decrypted + character;
        }


        // TODO: Complete the decryptOne() function.

        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        // Splits the input by spaces
        String[] numbers = encrypted.split(" ");
        // Takes the ascii value of the spaces and adds
        for (String ascii: numbers) {
            int asciiValue = Integer.parseInt(ascii);
            decrypted += (char) asciiValue;
        }

        // TODO: Complete the decryptTwo() function.

        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        // Splits the input into groups of 8 (for bytes)
        for (int i = 0; i < encrypted.length(); i+=8) {
            // Gets the numbers added up inside the byte
            String letter = encrypted.substring(i,i+8);
            int num = Integer.parseInt(letter,2);
            // Converts to ascii
            char ascii = (char) num;
            decrypted += ascii;
        }


        // TODO: Complete the decryptThree() function.

        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
