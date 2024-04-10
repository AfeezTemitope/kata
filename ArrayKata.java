public class ArrayKata{

public static int maximum(int [] array){
int maximum = Integer.MIN_VALUE;
for (int i = 0; i < array.length; i++){
if (maximum < array[i]){
maximum = array[i];
}
}
return maximum;
}

public static int minimum(int [] array){
int minimum = Integer.MAX_VALUE;
for (int i = 0; i < array.length; i++){
if (array[i] < minimum){
minimum = array[i];
}
}
return minimum;
}

public static int isSumEven(int[] array) {
int total = 0;
for (int num : array) {
if (num % 2 == 0) {
total += num;
        }
    }
    return total;
}


public static boolean isSquare(int number){
double sqrt = Math.sqrt(number);
if ( sqrt % 2 == 0){
return true; 
}
return false;
}

public static int noOfOddNumbersIn(int[] array) {
int count = 0;
for (int num : array) {
if (num % 2 != 0) {
System.out.print(num + " ");
count++;
        }
    }
    return count;
}


public static double[] squareNumbersIn(int[] numbers) {
    double[] result = new double[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
        result[i] = Math.sqrt(numbers[i]);
    }
    return result;
}

public static int noOfEvenNumbersIn(int[] array) {
int count = 0;
for (int num : array) {
if (num % 2 == 0) {
System.out.print(num + " ");
count++;
        }
    }
    return count;
}
public static int countOfEvenNumbersIn(int[] array) {
int count = 0;
for (int num : array) {
if (num % 2 == 0) {
count++;
        }
    }
    return count;
}

public static int countOfOddNumbersIn(int[] array) {
int count = 0;
for (int num : array) {
if (num % 2 != 0) {
count++;
        }
    }
    return count;
}

public static int[] MaximumAndMinimum(int[] numbers){
int minimum = numbers[0]; int maximum = numbers[0];
for (int number : numbers){ 
if(number < minimum ){
minimum = number; } if (number > maximum){
maximum = number;}
} return new int []{minimum, maximum};
}
}