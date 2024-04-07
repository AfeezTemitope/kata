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

}