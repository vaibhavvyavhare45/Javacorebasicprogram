package com.prowings.oops;

class Animal{
    String name="animal";
}
class Cat extends  Animal{
    String name="cat";
}
class Dog extends  Cat{
    String name="dog";
}



public class DynamicPolyWithInsVar {
    public static void main(String[] args) {
        Animal an=new Animal();
      // System.out.println(an.name);
        Cat c=new Cat();
        //System.out.println(c.name);
        Animal a=new Cat();
        System.out.println(a.name);
        //
        Dog d=new Dog();
        System.out.println(d.name);


    }
}
