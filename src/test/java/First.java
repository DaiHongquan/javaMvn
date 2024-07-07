import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;

// 注释是有必要的，提供解释和理解。单行注释 // 多行注释 /**/  文档注释允许你在程序中嵌入关于程序的信息 /** 开始，以 */结束
//大小写敏感
//在类，方法和其他流控制结构中，代码总是用花括号括起来{}。
//定义一个First类,类名的首字母应该大写，大驼峰命名法。源文件名应该与类名一致，文件名的后缀为.java
public class First {
//访问修饰符 public: 表示任何人都可以访问它
//静态修饰符 static: 表示该方法可以在不创建包含main方法的类的实例的情况下运行
//返回值类型 void : 表示该方法不会返回任何值
//方法名 main:  main是主方法的默认方法名。方法名以小写字母开头，小驼峰命名法
//方法的参数在方法名称后面的括号内声明，对于main来说，这是一个名为args的字符串数组。
//关键字查阅 keyword.png
/**
* 文档注释
* @author zifeiyu
* @version 1.0
*/
    public static void main(String[] args){
        System.out.println("============分界线============");
        // 每个代码语句必须以分号结尾
        //数据类型
        //整数 int double：浮点数 String：字符串（英文双引号包裹） char：单字符（英文单引号包裹） 布尔类型：true 和 false
        //运算符 加 + ,减 -,乘 *,除 /,// 商,% 取余,-- 自减,++ 自增。
        //= 赋值运算符，表示某变量等于，+=，-=，*=，/=，简化 a2 -= a1;  等价于 a2 = a2 - a1;
        int number = 1;
        //前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。
        //后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算 。
        int addnumber = number++;//addnumber的值为1，number的值为2
        double doubleNum = 1.2;
        //用 '+' 操作符来连接字符串。
        String str = "Hello" + " World!";
        char chars = '哈';
        boolean isFlag = true;
        //打印 Hello World!
        System.out.println(str);
        System.out.println(chars);
        System.out.println(addnumber);
        System.out.println(number);
        //System.out.println("%s %d %s %d","addnumber:",addnumber,"number:",number);

        //获取用户输入，创建Scanner类的实例 使用nextLine()获取下一行与next()方法获取所有输入
        //new Scanner(System.in); new Scanner(str); new Scanner(file);
        Scanner myScan = new Scanner("System.in");
        System.out.println("打印输入：" + myScan.nextLine());

        System.out.println("============分界线============");

        while(isFlag) {
            if (number == 0) {
                System.out.println("number = 0,继续循环。");
            } else if (number > 0) {
                System.out.println("number = 1。continue进行下一次循环（跳过本次循环后续代码）");
                //修改 isFlag 值为false，跳出循环。
                isFlag = false;
                //跳过本次循环，进行下一次循环
                continue;
            } else {
                //break 终止循环
                break;
            }
        }

        //普通for循环
        for(int i=0;i<number;i++){
            //int number = Integer.parseInt(numberStr);
            //str += "强制类型转换String.valueOf(i)：" + String.valueOf(i);
            System.out.println("强制类型转换String.valueOf(i)：" + String.valueOf(i));
            //System.out.println(i + "哈哈");
        }
        //定义一个ArrayList(相较于标准Java数组初始化时必须固定长度，ArrayList可扩展),需要引入(import) java.util.ArrayList

        //变量标识符intlist，使用赋值符号=赋予了 new ArrayList 实例对象的值（索引，仅基础数据类型是值，其余变量获取的均是索引）
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        intlist.add(5);
        intlist.add(9);

        ArrayList<String> colors = new ArrayList<String>();
        //增加元素 add()，删除元素remove(),
        colors.add("Red");colors.add("Blue");colors.add("Green");colors.add("Orange");
        colors.remove("Blue");
        //contains()：如果列表包含指定的元素，则返回true, 否则返回false。
        //get(int index)：返回列表中指定位置的元素。 size()：返回列表中元素的数量。 clear()：删除列表中所有元素。


        //LinkedList 不能为LinkedList指定初始容量，更适合操作数据（大量的插入和删除）。ArrayList更适合于存储和访问数据（快速访问）。
        //增强型for循环
        for(int j:intlist){
            System.out.println("增强型for循环（int j:intlist）：" + j);
        }

    }


}
