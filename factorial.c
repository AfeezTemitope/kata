# include <stdio.h>


int main() {
    int x;
    int result = 1;

 
	printf("Enter the dividend: ");
    	scanf("%d", &x);

	for (int i = 1; i <= x; i++){

	result *= i;
}
    


        
        printf("%d", result);
	


    return 0;
}
