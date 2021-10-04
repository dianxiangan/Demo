/**
 1.求100以内,不包含100,的所有偶数的和
 */
public class Test1 {
    public static void main(String[] args){
        int sum = 0; //用于计算总量
        int i = 0;   //增量
        while (i<100) {
            if(i%2==0){
                sum += i;
            }   i++;
        }       System.out.println(sum);
    }
}
