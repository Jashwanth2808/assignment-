public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        main.checkCharacter('a');
        main.checkCharacter('b');
        main.checkCharacter('5');
    }

    public void checkCharacter(char c) {

        if (!(Character.isLetter(c))) {
            System.out.println("Error: Invalid input");
        } else if (Character.isLowerCase(c) && c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Vowel");
        } else if (Character.isUpperCase(c) && c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}