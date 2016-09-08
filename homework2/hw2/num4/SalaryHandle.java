/**   
 * @Description: 
随机生成 Salary {name, baseSalary, bonus  }的记录，如“wxxx,10,1”，每行一条记录，总共1000万记录，写入文本文件（UFT-8编码），
   然后读取文件，name的前两个字符相同的，其年薪累加，比如wx，100万，3个人，最后做排序和分组，输出年薪总额最高的10组：
         wx, 200万，10人
         lt, 180万，8人
         ....
         
加强部分：
用FileChannel的方式实现第四题，注意编码转换问题，并对比性能
 * @author wby  
 * @date 2016年9月2日 下午1:43:43 
 * @version V1.0   
 */
package hw2.num4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

class Salar implements Comparable<Salar> {
	public Salar(String name, Random r) {
		this.name = name;
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
		return name + "," + baseSalary + "," + bonus;
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

class SalarSum {
	public String name4s;
	public long sum;
	private List<Salar> l = new ArrayList<Salar>();
	private int count = 0;

	public void addSalar(Salar s) {
		l.add(s);
		count++;
	}

	public int getCount() {
		return count;
	}
}

public class SalaryHandle {
	
	

	public static void main(String[] args) {
		int len = 10000000;
		Random rdm = new Random(999999);

		File file = new File("F:/java_plus/algs4-data/salaries-10000000.txt");
		if (!file.exists()) {// 不存在，执行
			try (PrintWriter pWriter = new PrintWriter(file, "utf-8")) {

				for (int i = 0; i < len; i++) {
					pWriter.write(new Salar(RandomStringUtils.random(7,
							"qewrtyuioplkjhgfdsazxcvbnm"), rdm).toString());
					pWriter.write("\n");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// 1、读取数据，生成salarysum数组。
		try (LineNumberReader lnr = new LineNumberReader(new FileReader(file))) {
			String s = lnr.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2、排序salarysum数组。
		// 3、输出前100组。

	}
}
