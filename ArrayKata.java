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
int sum = 0;
for (int i = 2; i < array.length; i+=2){
sum += array[i];
}
return sum;
}
}
