#include <stdio.h>;

int factorial(int x){

int total = 1;
for (int i = 1; i <= x; i++){
    total *= i;
}
return total;
}


