package test0;
import java.util.Random;
public class myapp {
	public static void main(String[] args) {
		print_Question();
	}
	// 创建题目
	public static void print_Question() {
		int c,q;
		int[]a=new int[50];
		int[]b=new int[50];
		char generations;
		int result[] = new int[50];
		for(int i=1;i<=50;i++) {
			Random random=new Random();
			c=random.nextInt(2);
			a[i-1]=random.nextInt(101);
			b[i-1]=random.nextInt(101);
			nomal(a,b);
			if (c==1) {
				generations='+';
				while(a[i-1]+b[i-1]>100) {
					if(a[i-1]>50)
						a[i-1]=a[i-1]-50;
					else
						b[i-1]=b[i-1]-50;
				}
			}
			else {
				if(a[i-1]<b[i-1]) {
					q=a[i-1];
					b[i-1]=a[i-1];
					a[i-1]=b[i-1];
				}
				generations='-';
			}
			result[i-1] = result(a[i-1],b[i-1],generations);
			System.out.print(i+"."+a[i-1]+" "+generations+" "+b[i-1]+"=\t");
			for(int j=1;j<13; j++)
				if(i==5 * j)
					System.out.println();
			}
			System.out.println();
			print_Result(result);
	}
	// 输出答案
	public static void print_Result(int[] result) {
		for(int i=1; i <= 50; i++) {
			System.out.print("答案：" + result[i-1] + "\t");
		for(int j=1;j < 13; j++)
			if(i==5 * j)
				System.out.println();
		}
	}
	// 返回运算结果
	public static int result(int a, int b,char fuhao) {
		if(fuhao == '+')
			return a + b;
		else
			return a - b;
	}
	// 防止重复
	public static void nomal(int[] a,int[] b) {
		Random random = new Random();
		for(int i = 0; i < 50; i++) {
			for(int j = 0;j < i; j++) {
				if(a[i] == a[j]) {
					a[i] = random.nextInt(101);
					continue;
				}
				if(b[i] == b[j]) {
					b[i] = random.nextInt(101);
					continue;
				}
			}
		}
	}
}
