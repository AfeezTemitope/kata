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


}
