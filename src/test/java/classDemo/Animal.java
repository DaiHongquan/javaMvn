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

