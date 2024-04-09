# include <stdio.h>


int main() {
    int integerA, integerB;
    float result;


	printf("Enter the dividend: ");
    	scanf("%d", &integerA);
    	printf("Enter the divisor: ");
    	scanf("%d", &integerB);


    if (integerB != 0) {
        result = (float)integerA / integerB;


        printf("Result: %.2f\n", result);
    } else {
        printf("Error: Division by zero\n");
    }

    return 0;
}
