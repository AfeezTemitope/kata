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



}
