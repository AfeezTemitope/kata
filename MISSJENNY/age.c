#include <stdio.h>

int main() {
    int age;
    printf("Enter value of age: "); 
    scanf("%d", &age); 

    if (age >= 65) {
        printf("%d Age is greater than or equal to 65", age);
    } else {
        printf("%d age is less than 65", age);
    }

    return 0;
}

