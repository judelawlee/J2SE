import java.util.Random;

/**
 * @description 
 * 
 * @author yuedp
 * @date 2013-7-27
 */
public class RandomUtil {

	public static void main(String[] args) {
		fun01();
		fun02();
		fun03();
		fun04();
	}

	/**
	 * 指定范围
	 */
	public static void fun01() {
		int max = 20;
		int min = 10;
		Random random = new Random();
		int num = random.nextInt(max) % (max - min + 1) + min;
		System.out.println(num);
	}

	/**
	 * 不带种子
	 */
	public static void fun02() {
		Random random = new Random();
		int num = random.nextInt();
		System.out.println(num);
	}

	/**
	 * 带种子，此种方式，无论程序运行多少次，返回结果都一样
	 */
	public static void fun03() {
		Random random = new Random(10);
		int num = random.nextInt();
		System.out.println(num);
	}

	public static void fun04() {
		int num1 = (int) (Math.random() * 100); // 产生一个100以内的整数
		System.out.println(num1);
		int num2 = 1 + (int) (Math.random() * 50); // 产生一个1~50之间的随机数
		System.out.println(num2);
	}

}