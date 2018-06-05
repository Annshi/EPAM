import java.util.Random;

    public class Coin {

        public static final int HEADS_VALUE = 0;
        public static final int RANDOM_RANGE = 2;

        public static String makeToss(int tossAmount) {
            int heads = 0;
            int tails = 0;

            if (tossAmount < 1) {
                return "There was no toss";
            }

            Random side = new Random();
            for (int i = 0; i < tossAmount; i++) {
                if (side.nextInt(RANDOM_RANGE) == HEADS_VALUE) {
                   heads = countHeads(heads);
                } else tails =  countTails(tails);
            }
            return "heads = " + heads + " tails = " + tails;
        }
        
            public static int countHeads(int heads ){
            return ++heads; 
        }

             public static int countTails(int tails){
                return ++tails; 
        }

    }

