import java.util.*;
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

        //while循环
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
        //do while 循环，至少执行一次
        int t = 5;
        do {
            System.out.println("do while 循环:" + t);
            t++;
        } while(t < 5);

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
        //HashMap:用于将数据集合存储为键和值对。一个对象被用作另一个对象（值）的键（索引）
        //put方法添加元素，使用get方法和相应的键来访问HashMap元素
        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("Shuter", 90);
        points.put("Loen", 85);
        points.put("Lu", 80);
        System.out.println("HashMap:" + points.get("Loen"));
        //containsKey返回的是true/false，用来检查hashmap中有没有shuter键
        System.out.println(points.containsKey("Shuter"));
        //Set是不能包含重复元素的集合。它模拟数学集抽象.Set的一个实现是HashSet类。
        //HashSet类不会自动保留添加元素的顺序。若要对元素进行排序，请使用LinkedHashSet，
        //它按照它们插入的顺序来维护集合元素的链接列表
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println("HashSet:" + set);//输出: [A, B, C]
        //Java中可用的集合类型，包括Set(集)、List(列表)和Map(映射)，选择使用哪一个取决于你需要存储和操作的数据

        //排序列表 Collections.sort(集合);
//        max(Collection c)：返回由自然顺序决定的c中的最大元素。
//        min(Collection c)：返回由自然顺序决定的c中的最小元素。
//        reverse(List list): 反转列表中的序列。
//        shuffle(List list): 将列表中的元素随机排序。

        //迭代器是一个能够循环访问，获取或删除元素的对象
        //每个集合类都提供了一个iterator()方法
//        Iterator类提供了以下方法：
//        hasNext()：检查序列中是否还有元素。如果还有元素，则返回true；否则，它返回false。
//        next()：获得序列中的下一个元素。
//        remove()：将迭代器新返回的元素删除。
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println("迭代器：" + it.next());
        }


        //增强型for循环
        for(int j:intlist){
            System.out.println("增强型for循环（int j:intlist）：" + j);
        }
        //逻辑运算符 与 &&  或 || 非 !
        if(2 > 0 || 2 > 1){
            if(2 > 0 && 2 > 1){
                if(2 != 0){
                    System.out.println("逻辑运算符 与 &&  或 || 非 !"  );
                }
            }
        }

        //switch 语句，如果不加break，程序会继续执行完毕所有。default 分支必须是 switch 语句的最后一个分支
        switch (number){
            case 0 :
                System.out.println("switch 语句 number = 0");
                break;
            case 1 :
                System.out.println("switch 语句 number = 1");
                break;
            default:
                System.out.println("switch 语句 number 既不是0 也不是1");
        }
        //数组,数组长度 arr.length，索引从0开始；int[] arr = new int[3]的元素为 arr[0] arr[1] arr[2]。整数数组默认初值为0
        int[] arr = new int[3];
        //定义arr数组并赋初值
        //int[] arr = {1,2};
        //赋值
        arr[1] = 3;
        for(int i: arr){
            System.out.println("打印arr数组：" + i);
        }

        //多维数组 所有数组成员类型必须是相同
        int[][] num = {{1,2,3},{4,5,6}};
        //访问第二个数组的第二个元素
        int num_element = num[1][1];

        System.out.println("============分界线============");
        //基本类型传的是值，对象传的引用
        //基本类型 包括 byte，short，int，long，float，double，boolean和char
        //传值处理不会影响变量，传对象的引用会影响对象本身
        //将一个类型的值赋给另一个类型的变量称为类型转换。要将值转换为特定类型，请将该类型放在括号中，并将其放在值的前面。
        //强制类型转换,整数自动类型转换为浮点，因为没有精度损失，浮点值赋值给整型变量时，强制类型转换是强制性的, 可能会有精度损失。
        int dnum = (int)5.25;
        //对象比较 (==)比较非基本类型时，它实际上比较的是引用而不是对象值
        //只有两个字符串变量都是指向字符串的常量对象时，才会返回true,，其他的都是false
        String str1 = "1哈";
        String str2 = "1哈";
        //常量对象，返回true
        System.out.println("str1常量字符串1哈与str2常量字符串1哈使用==对比： " + (str1 == str2));
        String str3 = new String("1哈");
        String str4 = new String("1哈");
        //非常量对象，返回flase
        System.out.println("str3非常量字符串1哈与str4非常量字符串1哈使用==对比： " + (str3 == str4));
        try {
        //尽管有两个名称相同的对象，因为我们有两个不同的对象（两个不同的引用或内存位置），所以相等性测试返回 false。
        int[] intArr1 = {1};
        int[] intArr2 = {1};


        System.out.println("intArr1数组1与intArr2数组1使用==对比： " + (intArr1 == intArr2));
        //equals：比较是字符串对象的内容
        System.out.println("str1常量字符串1哈与str2常量字符串1哈使用equals对比： " + str1.equals(str2));//true
        System.out.println("str1常量字符串1哈与str3非常量字符串1哈使用equals对比： " + str1.equals(str3));//true

        System.out.println("intArr1数组1与intArr2数组1使用equals对比： " + (intArr1.equals(intArr2)));
        } catch (Exception e) {
            System.out.println("An error occurred");
        }

        System.out.println("============分界线============");
        //Java API是为你编写的类和接口的集合
        //包含所有可用API的Java API文档可以在Oracle网站上找到 （http://docs.oracle.com/javase/7/docs/api/）。
        //异常处理是处理运行时错误以保持正常应用程序流的强大机制，一个写得好的程序应该处理所有可能的异常情况。
        //try/catch 代码块放在异常可能发生的地方。try/catch 代码块中的代码称为保护代码。
        //如果try代码块中的代码抛出异常，则try代码块中的代码将终止执行，并控制权将传递给catch代码块。
        //throw 关键字可以手动生成方法中的异常,throw new Exception("抛出异常");
//        int div(int a, int b) throws ArithmeticException {
//            if(b == 0) {
//                throw new ArithmeticException("Division by Zero");
//            } else {
//                return a / b;
//            }
//            try {
//                int[] intArr4 = {1};
//            } catch (异常类型1 异常的变量名1) {
//                // 程序代码
//            } catch (Exception e) {
//                System.out.println("An error occurred");
//            }
//        }

        //多线程编程，创建一个线程的第一种方法是创建一个新的类，该类继承 Thread 类，然后创建一个该类的实例
        //创建obj对象并调用它的start()方法时，run()方法语句在另一个线程上执行
//        class MyThread extends Thread {
//            public void run() {
//                System.out.println("线程运行中");
//            }
//        }
        //创建一个线程的第二种方法是实现Runnable接口
//        class MyThread implements Runnable {
//            public void run() {
//                System.out.println("线程运行中");
//            }
//        }
//        // 创建 MyThread 的实例
//        MyThread myThread = new MyThread();
//        // 使用 MyThread 实例创建 Thread 对象
//        Thread thread = new Thread(myThread);
//        // 启动线程
//        thread.start();
//        try {
//            // 让主线程也暂停一会儿，以便观察效果
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        //检查异常是运行时异常以外的异常, 也是Exception及其子类, 这些异常从程序的角度来说是必须经过捕捉检查处理的,
        // 否则不能通过编译. 如IOException、SQLException等
        //运行时异常都是RuntimeException类及其子类, 如 NullPointerException、IndexOutOfBoundsException等,
        // 这些异常是不检查的异常, 是在程序运行的时候可能会发生的, 所以程序可以捕捉, 也可以不捕捉.
        // 这些错误一般是由程序的逻辑错误引起的, 程序应该从逻辑角度去尽量避免




    }
}
