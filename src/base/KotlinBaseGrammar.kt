package base

class KotlinBaseGrammar
//--------------函数定义 Begin----------------
fun sum(a:Int,b:Int) :Int{
    return a+b;
}

fun sum1(a:Int,b:Int):Unit{
    print(a + b)
}

fun sum2(a: Int, b: Int) = a + b
//--------------函数定义 End----------------


fun show(args: Array<String>) {
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    print(sumLambda(4, 4))
}

fun main() {
    //--------------字符串模板 Begin----------------
    var a = 1
    val s1 = "a is $a"
    a =2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    //--------------字符串模板 End----------------


    //--------------lambda(匿名函数) Begin----------------
    val sumLambda: (Int, Int) -> Unit = { x, y -> x + y }

    val delete: (Int, Int) -> Int = { x, y -> x + y }
    //--------------lambda(匿名函数) End----------------



}




