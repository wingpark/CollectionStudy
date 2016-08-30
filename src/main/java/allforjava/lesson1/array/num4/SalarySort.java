/**   
 * @Description:
 *  定义Java类Salary {String name, int baseSalary, int bonus  },随机产生1万个实例，属性也随机产生（baseSalary范围是5-100万，
 *  bonus为（0-10万），其中name长度为5，随机字符串，然后进行排序，排序方式为收入总和（baseSalary*13+bonus），
 *  输出收入最高的10个人的名单
 * @author wby  
 * @date 2016年8月27日 上午9:55:04 
 * @version V1.0   
 */
package allforjava.lesson1.array.num4;

import java.util.Arrays;
import java.util.Random;

class Salar implements Comparable<Salar> {
	public Salar(Random r) {
		name = r.nextInt(9999) + "";
		int bs;
		do {
			bs = r.nextInt(1000000);
		} while (bs < 50000);
		baseSalary = bs;
		bonus = r.nextInt(100000);
	}

	public String name;
	public int baseSalary;
	public int bonus;

	@Override
	public String toString() {
		return "name:" + name + ";baseSalary:" + baseSalary + ";bonus:" + bonus
				+ ";amount:" + (baseSalary * 13 + bonus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Salar)) {
			return false;

		}
		return this.name.equals(((Salar) obj).name);
	}

	@Override
	public int compareTo(Salar o) {
		return -this.baseSalary * 13 - this.bonus + o.baseSalary * 13 + o.bonus;
	}

}

public class SalarySort {

	public static void main(String[] args) {
		// new Salar();
		Random rdm = new Random(999999);

		System.out.println("初始化对象");
		
		Salar[] arr = new Salar[10000];

		for (int i = 0, len = arr.length; i < len; i++) {
			arr[i] = new Salar(rdm);
		}
		
		System.out.println("排序对象");
		Arrays.sort(arr);

		System.out.println("输出最大前五位对象");
		for (int i = 0; i < 10; i++) {
			System.out.println(i+":"+arr[i]);
		}
		System.out.println("输出最小后五位对象");
		for (int i = 9999; i >= 9990; i--) {
			System.out.println(i+":"+arr[i]);
		}
	}

}
