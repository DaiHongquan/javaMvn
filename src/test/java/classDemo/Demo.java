//Java 使用包（package）这种机制是为了防止命名冲突，访问控制，提供搜索和定位类、接口、枚举和注释等。
//当一个类被放入一个包中时会发生两个主要的结果。首先，包的名称成为该类名称的一部分。其次，包的名称必须与相应的类文件所在的目录结构相匹配。
//使用通配符 "*" 导入包中的所有类
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

//面向对象编程（OOP）的主要特征是：封装，继承，多态。
//一个类的变量将被其他类隐藏，只能通过当前类的方法访问。这被称为数据隐藏。
public class Demo {

    //new对象时，就调用与之对应的构造函数。
    //一般函数不能调用构造函数，只有构造函数才能调用构造函数。
    //不管你创建了该类的多个对象，或者如果你不创建任何对象, 有且只有一个静态成员的实例存在
    //static 关键字用来声明独立于对象的静态变量、方法，可以不实例化，直接使用类名.变量或类名.方法调用。例如Math类

    //使用 final 关键字标记一个常量，常量只能被赋值一次。
    //方法和类也可以标记为 final，这样做可以限制方法，使其不能被重写，并且不能使其成为子类。
    //final 修饰符通常和 static 修饰符一起使用来创建类常量。
    public static final double PI = 3.14;

    public static void main(String[] args){

        //调用无参构造函数
        Animal animal = new Animal();
        //调用有参构造函数
        Animal animal2 = new Animal("牛");
        //调用了内部类
        animal2.barking();
        //调用get及set方法
        animal.setName(animal2.getName());
        System.out.println("将animal2.getName()获取到的name使用animal.setName(animal2.getName())赋值给animal：" + animal.getName());
        //多态存在的三个必要条件:继承、重写、父类引用指向子类对象
        //优点：消除类型之间的耦合关系、可替换性、、可扩充性、接口性、灵活性、简化性
        //向上转型（Upcasting）:将一个子类的实例转换为其父类。这是向上转换
        Animal cat = new Cat();
        //Cat 继承 Animal 类的类,有自己的 barking() 方法的实现
        cat.barking();
        //向下转型（Downcasting）:将父类的对象转换为其子类称为向下转换。
        //instanceof判断其左边对象是否为其右边类的实例
        Animal animal4 = new Cat();
        if(animal4 instanceof Cat){
            Cat cat2 = (Cat) animal4;
            cat2.barking();
        }

        //匿名类是一种即时继承现有类的方法
        Animal animal3 = new Animal() {
            @Override void barking() {
                System.out.println("匿名类：");
            }
        };
        animal3.barking();


        //Math类，它为数学运算提供了预定义的方法
        //Math.abs() 返回参数的绝对值 Math.ceil() 将一个数进行上舍入 Math.floor() 将对一个数进行下舍入 sqrt() 开平方
        //Math.max() 用于返回两个参数中的最大值 Math.min() 用于返回两个参数中的最小值 Math.pow() 用于返回第一个参数的第二个参数次方
        double c = Math.ceil(6.231);  // 7.0
        double f = Math.floor(6.231);  // 6.0

        Student student = new Student();
        student.eat("张三");




    }
}


