package classDemo;

//数据抽象为外界提供了仅有的基本信息，在表示基本特征的过程中不包括实现细节,关注基本特征，而不是一个特定例子的具体特征
//在 Java 中，抽象是使用 abstract 关键字定义的抽象类和接口
//如果一个类声明为抽象类，则不能被实例化（不能创建该类型的对象）。
//要使用抽象类，必须从另一个类继承它。
//抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
//抽象方法没有定义，方法名后面直接跟一个分号，而不是花括号。如：abstract void run();
abstract class People {

    public int age;

    public abstract int printAge();

}

class Student extends People implements IEat{

    public int printAge(){

        return age;

    }

    public void eat(String name){
        System.out.println(name+"在吃");
    }
}
