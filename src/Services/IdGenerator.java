package Services;

import java.util.Random;

public class IdGenerator {
    public static String generateID(String type) {
        StringBuilder id = new StringBuilder();
        Random rand = new Random();

        for (int j = 0; j < 4; j++) {
            int index = rand.nextInt(9); // Gera um número de 0 a 8
            id.append(index); // Concatena o número ao id
        }

        return id + "-" + type;
    }
}