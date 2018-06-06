public class Main {
    public static void main(String args[]){

        int[] array = new int[3];
        ArrayInitializer.initRandom(array, -10, 10);
        for (int v : array) {
            System.out.printf(" "+v);
        }
        System.out.printf("Max number of massive is %d", MaxMin.findMax(array));
        System.out.printf("\nMin number of massive is %d", MaxMin.findMin(array));
        System.out.printf("\nIs massive ordered? %b", OrderedMassive.isOrdered(array));
        System.out.printf("\nFirst local min = %d", LocalMin.defineFirstLocalMin(array));
        System.out.printf("\nMassive after reverse is ", Reverse.makeReverse(array));
        for (int v : array) {
            System.out.print(v);
        }
        System.out.printf("\nAverage arithmetic is %f", ArithmGeom.calcAvgArith(array));
        System.out.printf("\nAverage geometric is %f", ArithmGeom.calcAvgGeom(array));
        int tossAmount = 3;
        System.out.printf("\n%s", Coin.makeToss(tossAmount));


    }
}
