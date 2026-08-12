class Example
{
    static void method1() 
    {
        System.out.println("EXAMPLE_METHOD_1");
    }
    static void method2()
    {
        System.out.println("EXAMPLE_METHOD_2");
    }
}
class ClassDemo
{
    static void method1()
    {
        System.out.println("METHOD_1");
    }
    static void method2()
    {
        System.out.println("METHOD_2");
    }
    public static void main(String[] args)
    {
       System.out.println("MAIN METHOD");

       //method1(); Non-static function cant't be called directly but static method can be .
 
        ClassDemo.method1();
        ClassDemo.method2();
        Example.method1();
        Example.method2(); //Same methods in different classes can be called using ClassName .
    }
}
