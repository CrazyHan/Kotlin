package oop.classAndObject

/**
 * 类与对象
 */
open/**可继承*/ class ClassLearing constructor()/**主构造器是类头的一部分，位于名称之后*/{


    //类中定义成员函数
    fun foo() { print("Foo") }

    //普通函数那样使用构造函数创建类实例
    val stu = ClassLearing()



    inner class Inner{
        fun foo() = stu//访问外部类的成员
        fun innerTest(){
            var o = this@ClassLearing.stu//访问指定外部类的成员
        }
    }


}