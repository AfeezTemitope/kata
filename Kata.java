public class Kata{

public static boolean IsEven(int number){
	if(number % 2 == 0){
	    return true;
	}
	return false;
}


public static int divide(int a, int b) {
    if (b == 0) return 0;
    return ( a / b );
}

public static int subtract(int a, int b){
	return Math.abs(a - b);

}


public static int factor(int a){
  int count =1;
  for (int i = 1; i <= a; i++){
        count *= i;
      
  }
  return count;
}

public static boolean square(int number){
double sqrt = Math.sqrt(number);
if ( sqrt % 2 == 0){
return true; 
}
return false;
}

public static long factorial(long number) {
        long factorial = 1;
        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }
return factorial;

}


public static boolean isPalindromes(int userNumber){

int thousand = userNumber / 1000;
int hundred = (userNumber / 100) % 10;
int tens = (userNumber / 10) % 10;
int unit = (userNumber % 10);

int sum = thousand + hundred + tens + unit;

return true;
} 

public static boolean isEven(int number){
if ( number % 2 == 0){
return true;
} return false;
}

public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }





}