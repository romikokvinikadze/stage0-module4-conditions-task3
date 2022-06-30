package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (('A' <= character && character <= 'Z') || ('a' <= character && character <= 'z')){
            if ("AEIOUaeiou".contains(character+"")){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }else {
            System.out.println("wrong alphabet!");
        }
    }
}
