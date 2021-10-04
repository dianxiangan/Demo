
public class Test4 {
        public static void main(String[] args) {
                //输出方法1中的数据（到第一个分割线结束）
                Classes grate = new Classes();
                System.out.println(grate.grate);

                Classes specialized = new Classes();
                System.out.println(specialized.specialized);

                Classes name = new Classes();
                System.out.println(name.className);
                System.out.println("---------------------");

                //输出方法2中的数据（到第二个分割线结束）
                Classes grate1 = new Classes("","","", 58);
                System.out.println(grate1.grate);

                Classes className1 = new Classes("","","",58);
                System.out.println(className1.className);

                Classes number = new Classes("","","",58);
                System.out.println(number.number+"人");
                System.out.println("---------------------------");

                //创建两个班级
                Classes class1  = new Classes();
                class1.grate = "2021级";
                class1.className = "软件工程1班";
                class1.number = 60;
                class1.Class();

                Classes class2 = new Classes();
                class2.grate = "2021级";
                class2.className = "计算机科学与技术1班";
                class2.number = 55;
                class2.Class();
        }
}
class Classes {

        //确定数据类型
        String grate;
        String specialized;
        String className;
        int  number;

        //用无参构造给年级、专业、班级名称赋值
        public Classes(){
                this.grate = "21级";
                this.specialized = "软件工程";
                this.className = "软件工程1班";

        }
        //用有参构造给年级、专业、班级名称、班级人数赋值
        public Classes(String grate,String specialized,String className,int number){
                this.grate = "20级";
                this.specialized = "计算机科学与技术";
                this.className = "计算机科学与技术1班";
                this.number = 58;

        }
        //用来输出在main方法中创建的两个班级信息
        public void Class(){
                System.out.println(grate+className+"有"+number+"人");
        }

}