#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main()
{
    int t; 
    scanf("%d",&t);
    for(int a0 = 0; a0 < t; a0++)
	{
     long n; 
     scanf("%ld",&n);
     long int a = 0,b = 1,c = 0, sum = 0;
       while(a < n)
        {
         if(a % 2 == 0)
         {
                sum += a;
         }
            c = a + b;
            a = b;
            b = c;
            
        }printf("%ld\n",sum);
        
    }
    return 0;
}