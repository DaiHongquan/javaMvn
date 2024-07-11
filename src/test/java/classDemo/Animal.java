package classDemo;


import java.util.Objects;

public class Animal {
    //私有变量
    private String name;
    int age;

/*
构造函数 ，是一种特殊的方法。主要用来在创建对象时初始化对象， 即为对象成员变量赋初始值。
可以使用构造函数为对象属性提供初始值。
构造函数名称必须与其类名相同。
构造函数不能有明确的返回类型。
Java 会自动提供一个默认的构造函数，所以所有的类都有一个构造函数，无论是否有特殊的定义。
*/
    //无参构造函数
    Animal(){
        System.out.println("Animal的无参构造函数");
    }

    //自动生成 鼠标右键【生成】equals(） and hashCode()，可以使用相同的操作来生成其他有用的方法，例如：类属性的getter和setter方法。
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), age);
    }

    //有参构造函数
    Animal(String name){
        System.out.println("Animal的有参构造函数：赋初始值："+name);
        this.name = name;
    }
    //声明为私有访问类型的变量只能通过类中公共的getter/setter方法被外部类访问。
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    void barking(){
        System.out.println("动物的叫声");
        Dog dog = new Dog();
        dog.think();
    }


    /*内部类：在类中编写一个类
1.实现了更好的封装，普通类(非内部类)的访问修饰符不能为private或protected，而内部类可以。
将内部类声明为private时，只有外部类可以访问内部类，很好地隐藏了内部类。
内部类可以继承(extends)或实现(implements)其他的类或接口，而不受外部类的影响。
内部类可以直接访问外部类的字段和方法，即使是用private修饰的，相反的，外部类不能直接访问内部类的成员。
     */
    private class Dog{
        String dogName;
        public void think() {
            System.out.println(name + " is thinking");
        }
    }

}

//继承是使一个类获得另一个类的属性（方法和变量）的过程。通过继承，信息被放置在更易于管理的层次上。
//继承另一个属性的类称为子类（也称为派生类）。其属性被继承的类称为父类（基类或超类）。
//在 Java 中，通过 extends 关键字可以申明一个类是从另外一个类继承而来的。
//当一个类从另一个类继承时，它继承了所有父类的非私有变量和方法。
//构造函数不是成员方法，所以不会被子类继承,然而，父类的构造函数在子类被实例化时会被调用。
//通过super关键字来实现对父类成员的访问，用来引用当前对象的父类。例如，super.var 将访问父类的var成员
class Cat extends Animal {
     String color = "BLUE";
    //重写Overriding：子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。即外壳不变，核心重写。
    //访问权限不能比父类中被重写的方法的访问权限更低,声明为final或static的方法不能被重写，如果不能继承一个方法，则不能重写这个方法。
    //@Override注解用于使代码更容易理解，因为当方法被重写时，它更加明显
    @Override
    void barking(){
        System.out.println("cat的叫声");
    }
    //重载Overloading：方法名相同，必须改变参数列表(参数个数或类型或顺序不一样)，无法以返回值类型作为重载函数的区分标准。
    //方法重载是一个类的多态性表现,而方法重写是子类与父类的一种多态性表现
    void barking(int num){
        for(int i=0;i<num;i++){
            System.out.println("cat的叫声:第" + i + "次");
        }
    }


    //枚举类是一种特殊类，它和普通类一样可以使用构造器、定义成员变量和方法，也能实现一个或多个接口,但枚举类不能继承其他类.
    //枚举类型使用的最常用类型就是枚举常量。枚举的使用示例，包括月份，星期几，颜色、学历、职业等。
    //当变量（特别是方法参数）只能从一小组可能的值中取出一个时，你应该总是使用枚举。
    public enum Color  {
       RED, BLUE , GREEN;
    }



}

