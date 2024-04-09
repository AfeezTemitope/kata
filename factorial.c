#include <stdio.h>

int factorial(int x);


int main() {
    int x;
 
	printf("Enter the dividend: ");
    	scanf("%d", &x);


    int number = factorial(x);    
        printf("%d", number );
	return 0;
}



