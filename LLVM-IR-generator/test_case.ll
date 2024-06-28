; === prologue ====
declare dso_local i32 @printf(i8*, ...)

@t37 = private unnamed_addr constant [27 x i8] c"res is greater than 69420\0A\00"
@t35 = private unnamed_addr constant [36 x i8] c"res is less than or equal to 69420\0A\00"
@t30 = private unnamed_addr constant [10 x i8] c"res = %d\0A\00"
@t14 = private unnamed_addr constant [12 x i8] c"a + b = %d\0A\00"
@t9 = private unnamed_addr constant [28 x i8] c"a is greater or equal to b\0A\00"
@t7 = private unnamed_addr constant [21 x i8] c"a is greater than b\0A\00"
define dso_local i32 @main()
{
%t0 = alloca i32, align 4
%t1 = alloca i32, align 4
%t2 = alloca i32, align 4
%t3 = alloca i32, align 4
store i32 80, i32* %t3
store i32 90, i32* %t2
%t4 = load i32, i32* %t3
%t5 = load i32, i32* %t2
%t6 = icmp sgt i32 %t4, %t5
br i1 %t6, label %L0, label %L1
L0:
%t8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([21 x i8], [21 x i8]* @t7, i64 0, i64 0))
br label %L2
L1:
%t10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([28 x i8], [28 x i8]* @t9, i64 0, i64 0))
br label %L2
L2:
%t11 = load i32, i32* %t3
%t12 = load i32, i32* %t2
%t13 = add nsw i32 %t11, %t12
store i32 %t13, i32* %t1
%t15 = load i32, i32* %t1
%t16 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([12 x i8], [12 x i8]* @t14, i64 0, i64 0), i32 %t15)
%t17 = load i32, i32* %t3
%t18 = add nsw i32 %t17, 1
%t19 = load i32, i32* %t2
%t20 = sub i32 %t19, 1
%t21 = mul nsw i32 %t18, %t20
%t22 = sdiv i32 %t21, 4
%t23 = mul nsw i32 %t22, 5
%t24 = load i32, i32* %t2
%t25 = sub i32 %t23, %t24
%t26 = add nsw i32 %t25, 1
%t27 = load i32, i32* %t3
%t28 = mul nsw i32 4, %t27
%t29 = add nsw i32 %t26, %t28
store i32 %t29, i32* %t0
%t31 = load i32, i32* %t0
%t32 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([10 x i8], [10 x i8]* @t30, i64 0, i64 0), i32 %t31)
%t33 = load i32, i32* %t0
%t34 = icmp sle i32 %t33, 69420
br i1 %t34, label %L3, label %L4
L3:
%t36 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([36 x i8], [36 x i8]* @t35, i64 0, i64 0))
br label %L5
L4:
%t38 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([27 x i8], [27 x i8]* @t37, i64 0, i64 0))
br label %L5
L5:

; === epilogue ===
ret i32 0
}
