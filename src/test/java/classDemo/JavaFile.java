package classDemo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 * 文件处理
 */
public class JavaFile {
    public static void main(String[] args) {
        //getName()方法返回文件的名称。请注意，我们在路径中使用双反斜杠，因为一个反斜杠应该在字符串路径中转义

        try {
            File t = new File("D:\\edong\\w3cschool.txt");
            //在指定的路径中创建一个空文件。如果该文件已经存在，这将覆盖它
            Formatter f = new Formatter("D:\\edong\\w3cschool2.txt");
            //format()方法根据其第一个参数来设置参数的格式,\r\n是Windows中的换行符号
            f.format("%s %s %s","1","Loen","Wang \r\n");
            f.format("%s %s %s","2","Lu","Lin");
            f.close();
            //要先判断文件是否存在
            if(t.exists()) {
            Scanner sc = new Scanner(t);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
                //关闭文件
                sc.close();
            }else {
                System.out.println("The file does not exist");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
}
