; === prologue ====
declare dso_local i32 @printf(i8*, ...)

@t57 = private unnamed_addr constant [8 x i8] c"j = %d\0A\00"
@t50 = private unnamed_addr constant [8 x i8] c"i = %d\0A\00"
@t46 = private unnamed_addr constant [25 x i8] c"---test nested while---\0A\00"
@t41 = private unnamed_addr constant [26 x i8] c"i = %d, j = %d, i*j = %d\0A\00"
@t28 = private unnamed_addr constant [28 x i8] c"---test nested for-loop---\0A\00"
@t26 = private unnamed_addr constant [8 x i8] c" a > b \00"
@t24 = private unnamed_addr constant [13 x i8] c" a >= b - 2\0A\00"
@t22 = private unnamed_addr constant [11 x i8] c"a < b - 2\0A\00"
@t16 = private unnamed_addr constant [7 x i8] c"a < b\0A\00"
@t11 = private unnamed_addr constant [32 x i8] c"---test nested if-statement---\0A\00"
define dso_local i32 @main()
{
%t0 = alloca i32, align 4
%t1 = alloca i32, align 4
%t2 = alloca i32, align 4
%t3 = alloca i32, align 4
%t4 = alloca i32, align 4
%t5 = alloca i32, align 4
%t6 = mul nsw i32 0, 1
%t7 = add nsw i32 1, 1
%t8 = sub i32 %t6, %t7
store i32 %t8, i32* %t5
%t9 = load i32, i32* %t5
%t10 = add nsw i32 5, %t9
store i32 %t10, i32* %t4
%t12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([32 x i8], [32 x i8]* @t11, i64 0, i64 0))
%t13 = load i32, i32* %t5
%t14 = load i32, i32* %t4
%t15 = icmp slt i32 %t13, %t14
br i1 %t15, label %L0, label %L1
L0:
%t17 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([7 x i8], [7 x i8]* @t16, i64 0, i64 0))
%t18 = load i32, i32* %t5
%t19 = load i32, i32* %t4
%t20 = sub i32 %t19, 2
%t21 = icmp slt i32 %t18, %t20
br i1 %t21, label %L2, label %L3
L2:
%t23 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([11 x i8], [11 x i8]* @t22, i64 0, i64 0))
br label %L4
L3:
%t25 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([13 x i8], [13 x i8]* @t24, i64 0, i64 0))
br label %L4
L4:
br label %L5
L1:
%t27 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @t26, i64 0, i64 0))
br label %L5
L5:
%t29 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([28 x i8], [28 x i8]* @t28, i64 0, i64 0))
store i32 0, i32* %t0
store i32 0, i32* %t2
br label %L6
L6:
%t30 = load i32, i32* %t2
%t31 = icmp sle i32 %t30, 5
br i1 %t31, label %L8, label %L7
L9:
%t32 = load i32, i32* %t2
%t33 = add nsw i32 %t32, 1
store i32 %t33, i32* %t2
br label %L6
L8:
store i32 0, i32* %t1
br label %L10
L10:
%t34 = load i32, i32* %t1
%t35 = icmp sle i32 %t34, 4
br i1 %t35, label %L12, label %L11
L13:
%t36 = load i32, i32* %t1
%t37 = add nsw i32 %t36, 2
store i32 %t37, i32* %t1
br label %L10
L12:
%t38 = load i32, i32* %t2
%t39 = load i32, i32* %t1
%t40 = mul nsw i32 %t38, %t39
store i32 %t40, i32* %t0
%t42 = load i32, i32* %t2
%t43 = load i32, i32* %t1
%t44 = load i32, i32* %t0
%t45 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([26 x i8], [26 x i8]* @t41, i64 0, i64 0), i32 %t42, i32 %t43, i32 %t44)
br label %L13
L11:
br label %L9
L7:
%t47 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([25 x i8], [25 x i8]* @t46, i64 0, i64 0))
store i32 5, i32* %t2
store i32 5, i32* %t1
br label %L14
L14:
%t48 = load i32, i32* %t2
%t49 = icmp sgt i32 %t48, 0
br i1 %t49, label %L16, label %L15
L16:
%t51 = load i32, i32* %t2
%t52 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @t50, i64 0, i64 0), i32 %t51)
br label %L17
L17:
%t53 = load i32, i32* %t1
%t54 = icmp sgt i32 %t53, 0
br i1 %t54, label %L19, label %L18
L19:
%t55 = load i32, i32* %t1
%t56 = sub i32 %t55, 1
store i32 %t56, i32* %t1
%t58 = load i32, i32* %t1
%t59 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @t57, i64 0, i64 0), i32 %t58)
br label %L17
L18:
%t60 = load i32, i32* %t2
%t61 = sub i32 %t60, 1
store i32 %t61, i32* %t2
br label %L14
L15:

; === epilogue ===
ret i32 0
}
