package metodaReduce;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args)
    {
        int suma = IntStream.rangeClosed(1, 100)
                .reduce((x, y) -> x + y).orElse(0);

        System.out.println("Suma liczb od 1 do 100 wynosi: " + suma + ".");

    }
}
