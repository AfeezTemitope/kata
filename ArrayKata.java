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

public static int isSum(int [] array){
int sum = 0;
for (int i = 0; i < array.length; i++){

sum += array[i];
}

return sum;
}

public static int isSumEven(int [] array){
int total = 0;
for (int i = 2; i < array.length; i+=2){
total += array[i];
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

public static int isOdd(int [] array){
int sum = 0;
for(int i = 1; i < array.length; i+=2){
if ( i % 2 != 0){
sum ++;
}

}
return sum;
}

public static int[] squareNumbersIn(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            doubles result= Math.sqrt(numbers[i], i);
        }
        return result;
    }


}