package classDemo;


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
    }



}

//继承是使一个类获得另一个类的属性（方法和变量）的过程。通过继承，信息被放置在更易于管理的层次上。
//继承另一个属性的类称为子类（也称为派生类）。其属性被继承的类称为父类（基类或超类）。
//在 Java 中，通过 extends 关键字可以申明一个类是从另外一个类继承而来的。
//当一个类从另一个类继承时，它继承了所有父类的非私有变量和方法。
//构造函数不是成员方法，所以不会被子类继承,然而，父类的构造函数在子类被实例化时会被调用。
//通过super关键字来实现对父类成员的访问，用来引用当前对象的父类。例如，super.var 将访问父类的var成员
class Cat extends Animal {
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

}

