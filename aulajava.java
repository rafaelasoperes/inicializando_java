import java.util.Optional;
public class aulajava {
    public static void main(String[] args) {
        var input = "Let's Code";
        String name = Optional.ofNullable(input)
            .orElseGet(() -> getRandomName());
        System.out.println(name);
    }
    private static String getRandomName() {
        System.out.println("Providing a random name");
        return "John Doe";
    }
    
}
