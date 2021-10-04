/**
 3.定义一个数组用来存放学生的java课考试成绩,要求实现功能,从键盘输入要录入的学生人数n,
 接着可逐个录入学生的成绩,最后输出最高分,最低分和平均分
 */
import java.util.Scanner;   //引入Scanner，用以键盘输入数据
public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要录入的学生人数：");
        int num = input.nextInt();      //在键盘上输入要录入的学生人数

        int[] score = new int[num];     //创建数组，存放学生的成绩
        int sum=0;

        for(int i=0;i<score.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩：");
            score[i]=input.nextInt();          //录入成绩
            sum+=score[i];                     //累加到sum，用于计算平均分(pjf)
        }
        double pjf=sum/num;     //平均分一般为小数，需用double类型。

        int max=score[0];   //定义max
        int min=score[0];   //定义min
        //用for循环来确定最高分和最低分
        for(int i=0;i<score.length;i++){
            if(score[i]>max){
                max=score[i];
            }
            if(score[i]<min){
                min=score[i];
            }
        }
        System.out.println("最高分为："+max);
        System.out.println("最低分为："+min);
        System.out.println("平均分为："+pjf);
    }
}
