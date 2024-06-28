void main()
{
   int w;
   int f;
   int i;
   w = 2;
   i = 0;

   // while + for + if_else construct
   while(w>0){
      for(f = 0; f != 6; f = f+1){
         if(f < 3){
            printf("f < 3, f = %d\n", f);
         }else{
            printf("f >= 3, f = %d\n", f);
         }
      }
      w = w-1;
   }

   return 0;
}
