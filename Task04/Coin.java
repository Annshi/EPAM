import java.util.Random;

    public class Coin {

        public static final int HEADS_AMOUNT = 0;
        public static final int RANDOM_RANGE = 2;

        public static String makeToss(int tossAmount) {
            int heads = 0;

            if (tossAmount < 1) {
                return "There was no toss";
            }

            Random side = new Random();
            for (int i = 0; i < tossAmount; i++) {
                if (side.nextInt(RANDOM_RANGE) == HEADS_AMOUNT) {
                   heads++;
                }
            }
            return "heads = " + heads + " tails = " + (tossAmount - heads);
        }
    }

