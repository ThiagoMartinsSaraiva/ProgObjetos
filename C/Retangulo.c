#include <stdio.h>
#include <stdlib.h>

float calculateArea(float, float);
float calculatePerimeter(float, float);

int main() {
  float width, height;
  printf("Hello!\n"); 
  printf("Enter the width value: ");
  scanf("%f", &width);
  printf("Enter the height value: ");
  scanf("%f", &height);
  printf("The width is %f and the height is %f \n", width, height);
  printf("Let's make some calculations :P\n");
  printf("%f The area is: ", calculateArea(width, height));
  printf("%f The perimeter is: ", calculatePerimeter(width, height));
}

float calculateArea(float width, float height) {
  return width * height;
}

float calculatePerimeter(float width, float height) {
  return width * 2 + height * 2;
}