// This demo file shows how the checker handle 
//(1)Type mismatch in variable declarations,
//(2)Type mismatch in arithmetic exoressions,

void main(){
    
    float f1 = 5.0;
    int i1;
    int i2 = 9;
    int i3 = 1;
    float f2 = i2 / i3;
    float f3;
    char c = 'c';
    i1 = i2 / i3 * 5+ ((1.25) % (4));
    f3 = f1 - 1 + (2 * 5);
}