// This demo file shows how the type checker handles non-boolean values in conditional expressions 

void main(){
    int a = 10;
    int b = 5;

    //legal and illegal if-else statement
    if(a > 0){
        printf("legal if-statement,a is positive");
    }else{
        printf("a is negative");
    }

    if(a){
        printf("illegal if-statement");
    }else{
        printf("illegal ");
    }

    //legal and illegal while-loop
    while( (a-1)>0){
        a = a-1;
        printf("legal while-loop");
        if((a % 2) != 0){
            continue;
        }
    }
    while(b + 3 - 4 / 6){
        printf("hello world");
    }

    //legal and illegal for-loop
    for(int i = 0;i < 5;i = i+1){
        printf("legal for-loop");
    }
    for(int j = 0; b/5+6; j = j-1){
        printf("illegal for-loop");
    }
}