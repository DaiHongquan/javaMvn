package classDemo;

/**
 * 文档注释
 * @author zifeiyu
 * @version 1.0
 * @purpose 示例
 */

//类可以描述为对象的模板，描述或定义，用于定义属性和行为。
//方法用于定义行为。调用一个方法，请输入其名称，然后在名称后面加上一组圆括号，里面传入需要的以英文逗号分隔的参数或者为空。
//方法可以定义返回类型(int String 对象类型等，void关键字不返回任何类型)，在访问修饰符和静态修饰符之后
/*
default (即缺省，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
private : 在同一类内可见。使用对象：变量、方法。
public : 对所有类可见。使用对象：类、接口、变量、方法
protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。
*/
public class Demo {

    //new对象时，就调用与之对应的构造函数。
    //一般函数不能调用构造函数，只有构造函数才能调用构造函数。
    public static void main(String[] args){
        //调用无参构造函数
        Animal animal = new Animal();
        //调用有参构造函数
        Animal animal2 = new Animal("牛");
        //调用get及set方法
        animal.setName(animal2.getName());
        System.out.println("将animal2.getName()获取到的name使用animal.setName(animal2.getName())赋值给animal：" + animal.getName());
    }
}
