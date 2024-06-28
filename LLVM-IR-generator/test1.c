
void main()
{

   int a;
   int b;
   int c;
   int i;
   int j;
   int s;

   //Arithmetic statement
   a = 0 * 1 - (1 + 1);
   b = 5 + a;

   printf("---test nested if-statement---\n");
   
   //nested if
   if(a<b){

      printf("a < b\n");
      if(a < b- 2){
         printf("a < b - 2\n");
      }else{
         printf(" a >= b - 2\n");
      }

   }else{
      printf(" a > b ");
   }
   
   //nested for
   printf("---test nested for-loop---\n");
   s = 0;
   
   for(i = 0; i<=5;i=i+1){
      for(j = 0; j <=4; j=j+2){
         s = i*j;
         printf("i = %d, j = %d, i*j = %d\n", i, j, s);
      }
      
   }

   //nested while
   printf("---test nested while---\n");
   i = 5;
   j = 5;
   while(i > 0){
      printf("i = %d\n", i);
      while(j > 0){
         j = j-1;
         printf("j = %d\n",j);
      }
      i = i-1;
   }
   return 0;
}
