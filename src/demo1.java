import java.util.Scanner;

public class demo1 {
//    public static int FirstMaxIndex(int[] arr){
//        int maxIndex = 0;
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>arr[maxIndex]){
//                maxIndex = i;
//            }
//        }
//        return maxIndex;
//    }

//    public static class Student {
//        String name;
//        int score;
//
//        public void printInfo(){
//            System.out.println("姓名: " + this.name + ";成绩:" + this.score );
//        }
//    }

    public static boolean isPrime(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0)return false;
        //如果 𝑛 是合数，即 𝑛 =𝑎 ×𝑏（𝑎 ≤𝑏），那么一定有 𝑎 ≤√𝑛。
        //所以只要在 2 ∼√𝑛 里没找到因数，就能断定它是素数。这样把 𝑂(𝑛) 降到了 𝑂(√𝑛)。
        for(int i=3;i<=n/i;i+=2){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        第一题
//        int a,b;
//        System.out.print("请输入两个整数:");
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        b = sc.nextInt();
//        int max=a>b?a:b;
//        System.out.print("最大的数是:" + max);
//        第二题
//        System.out.print("请输入0-100的整数");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if(a>100){
//            System.out.print("请输入0-100之间的整数");
//        } else if (a>=90) {
//            System.out.print("A");
//        } else if (a>=80) {
//            System.out.print("B");
//        }else if (a>=70) {
//            System.out.print("C");
//        }else if (a>=60) {
//            System.out.print("D");
//        }else if (a>=0) {
//            System.out.print("E");
//        }else{
//            System.out.print("请输入0-100之间的整数");
//        }
//        第三题
//        for(int i=1;i<=9;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(i + "*" + j + "=" + i*j + " ");
//            }
//            System.out.println();
//        }
//        第四题
//        int []a ={3,7,2,7,5};
//        System.out.println("最大数的下标是:" + FirstMaxIndex(a));
//         第五题
//        Student st1=new Student();
//        st1.name="奶龙";
//        st1.score=100;
//        st1.printInfo();
//        Student st2=new Student();
//        st2.name="豆包";
//        st2.score=99;
//        st2.printInfo();
//        Student st3=new Student();
//        st3.name="咕咕嘎嘎";
//        st3.score=80;
//        st3.printInfo();
//        第六题
        System.out.print("请输入一个正整数n,判断是不是素数: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(isPrime(n)){
            System.out.print("是素数");
        }else{
            System.out.print("不是素数");
        }
    }
}
