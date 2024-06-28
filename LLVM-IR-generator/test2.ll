; === prologue ====
declare dso_local i32 @printf(i8*, ...)

@t14 = private unnamed_addr constant [16 x i8] c"f >= 3, f = %d\0A\00"
@t11 = private unnamed_addr constant [15 x i8] c"f < 3, f = %d\0A\00"
define dso_local i32 @main()
{
%t0 = alloca i32, align 4
%t1 = alloca i32, align 4
%t2 = alloca i32, align 4
store i32 2, i32* %t2
store i32 0, i32* %t0
br label %L0
L0:
%t3 = load i32, i32* %t2
%t4 = icmp sgt i32 %t3, 0
br i1 %t4, label %L2, label %L1
L2:
store i32 0, i32* %t1
br label %L3
L3:
%t5 = load i32, i32* %t1
%t6 = icmp ne i32 %t5, 6
br i1 %t6, label %L5, label %L4
L6:
%t7 = load i32, i32* %t1
%t8 = add nsw i32 %t7, 1
store i32 %t8, i32* %t1
br label %L3
L5:
%t9 = load i32, i32* %t1
%t10 = icmp slt i32 %t9, 3
br i1 %t10, label %L7, label %L8
L7:
%t12 = load i32, i32* %t1
%t13 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([15 x i8], [15 x i8]* @t11, i64 0, i64 0), i32 %t12)
br label %L9
L8:
%t15 = load i32, i32* %t1
%t16 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([16 x i8], [16 x i8]* @t14, i64 0, i64 0), i32 %t15)
br label %L9
L9:
br label %L6
L4:
%t17 = load i32, i32* %t2
%t18 = sub i32 %t17, 1
store i32 %t18, i32* %t2
br label %L0
L1:

; === epilogue ===
ret i32 0
}
