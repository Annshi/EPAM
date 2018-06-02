/**
 *
 * @version          1.3 02 June 2018
 * @author           Shiman Anna
 */
public class Coin {
    public static final int VALUE_FOR_HEAD = 1;
    public static final int VALUE_FOR_TAIL = 2;
    public static String countSides(int tossAmount){
        int heads = 0;
        int tails = 0;
        for(int i = 0; i < tossAmount ; i++){
            if( VALUE_FOR_HEAD + (int)( Math.random() * VALUE_FOR_TAIL) == VALUE_FOR_HEAD ) {
                heads++;
            } else {
                tails++;
            }
        }
        return "Amount of head: " + heads + ". Amount of tail: " +  tails;
    }
}
