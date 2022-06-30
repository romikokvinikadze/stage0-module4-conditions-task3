package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if (('A' <= symbol && symbol <= 'Z') || ('a' <= symbol && symbol <= 'z')){
            System.out.println("English");
        }else {
            System.out.println("Non English");
        }
    }
}
