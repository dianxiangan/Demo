/**
 2.从键盘输入一个整数,获取该整数,如获取到的是4,
 则输出如下图形(可根据输入的决定输出效果)
 */
import java.util.Scanner;   //引入Scanner，用以键盘输入数据
public class Test2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要打印星星的行数：");
        int line = input.nextInt();    //在键盘上输入要打印星星的行数

        for(int i=1;i<=line;i++){      //外循环控制行数

            for(int j=1;j<=i;j++){     //内循环控制列数

                System.out.print("*");
            }
                System.out.println();
        }
    }
}