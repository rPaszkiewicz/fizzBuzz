import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,100)
                .forEach(i -> System.out.println(i%3==0 ? (i%5==0 ? "fizzBuzz " + i:"fizz " +i) :
                        (i%5==0 ? "buzz " + i : String.valueOf(i))));
    }
}
