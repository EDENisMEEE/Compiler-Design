// This demo file shows how the checker handle undeclared and redeclared variables
void main(){
    int i1 = (5+6)-2;
    int i2;
    int i2 = i1;
    i3 = 7 + 8;

    printf("legal param %d %d", i1, i2);
    printf("illegal param %d", i4);

    scanf("legal param %d %d", &i1, &i2);
    scanf("legal param %d %d", &i4);
}
