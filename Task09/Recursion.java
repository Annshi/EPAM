package Task09;

public class Recursion {

    public static int countDigitSum(int numb){
         if (numb == 0) {
            return 0;
        }
        return numb % 10 + countDigitSum(numb / 10);
}
    
     public static double pow(double x, int n){
            if (x == n && n == 0 || n < 0) {
                return -1;
            } else if(x == 0) {
                return 0;
            } else if(n == 0){
                return 1;
            }
        return x * pow(x, n - 1);
    } 
     
     public static boolean isEqual(int n, int s) {
		if (n == 0) {
			if (s == 0) {
				return true;
			}
			return false;
		}
		return isEqual(n / 10, s - (n % 10));
    }
     
    public static int findFibonachi(int n) {
      if(n<3){
          switch (n) {
              case 1: return 0;
              case 2:
              case 3:
                  return 1;
              default: return -1;
          }
      }
        return findFibonachi(n-1) + findFibonachi(n-2);
    }
}

