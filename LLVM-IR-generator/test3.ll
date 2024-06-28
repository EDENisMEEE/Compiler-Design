; === prologue ====
declare dso_local i32 @printf(i8*, ...)

@t15 = private unnamed_addr constant [8 x i8] c"d = %d\0A\00"
define dso_local i32 @main()
{
%t0 = alloca i32, align 4
%t1 = alloca i32, align 4
%t2 = alloca i32, align 4
%t3 = alloca i32, align 4
store i32 3, i32* %t2
store i32 1, i32* %t3
store i32 5, i32* %t1
%t4 = add nsw i32 5, 4
%t5 = mul nsw i32 2, %t4
%t6 = load i32, i32* %t2
%t7 = sdiv i32 %t5, %t6
%t8 = load i32, i32* %t3
%t9 = mul nsw i32 %t8, 2
%t10 = add nsw i32 %t7, %t9
%t11 = load i32, i32* %t1
%t12 = sub i32 %t10, %t11
%t13 = load i32, i32* %t1
%t14 = sub i32 %t12, %t13
store i32 %t14, i32* %t0
%t16 = load i32, i32* %t0
%t17 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @t15, i64 0, i64 0), i32 %t16)

; === epilogue ===
ret i32 0
}
