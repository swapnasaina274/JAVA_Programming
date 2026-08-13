class Example
{
    void method1()
    {
        System.out.println("EXAMPLE_METHOD_1");
    }
    void method2()
    {
        System.out.println("EXAMPLE_METHOD_2");
    }
}
class ObjectDemo
{
    public static void main(String[] args)
    {
        Example ex1 = new Example(); //Object Creation
        ex1.method1(); //Non-static method should be called using object .
        ex1.method2();
    }
}