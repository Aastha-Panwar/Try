class InheritAnimal {
    void eat()
    {
        System.out.println("i am eating");
    }
}
class Dog extends InheritAnimal
{
    void bark()
    {
        System.out.println("i am barking");
    }
    
}
class C{
    public static void main(String[] args)
    {
        C c=new C();
        c.eat();
        c.bark();
    }
}
