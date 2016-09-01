/**   
 * @Description: 编码实现下面的要求
 * 现有对象 MyItem {byte type,byte color,byte price} ，要求将其内容存放在一个扁平的byte[]
 * 数组存储数据的ByteStore {byte[] storeByteArry}对象里,
 * 即每个MyItem占用3个字节，第一个MyItem占用storeByteArry[0]-storeByteArry[2] 3个连续字节，
 * 以此类推，最多能存放1000个MyItem对象
 * ByteStore提供如下方法
 * putMyItem(int index,MyItem item) 在指定的Index上存放MyItem的属性，
 * 这里的Index是0-999，而不是storeByteArry的Index
 * getMyItem(int index),从指定的Index上查找MyItem的属性，并返回对应的MyItem对象。
 * @author wby  
 * @date 2016年8月27日 上午11:11:48 
 * @version V1.0   
 */
package allforjava.lesson1.array.num5;

import java.util.Arrays;
import java.util.Random;

public class ArrayMyItem {

	// 随机生成n个MyItem对象
	public static MyItem[] radomBuildMyItems(int n) {
		Random rdm = new Random(n);
		MyItem[] ms = new MyItem[n];
		for (int i = 0; i < n; i++) {
			ms[i] = new MyItem();
			ms[i].type = (byte) rdm.nextInt();
			ms[i].color = (byte) rdm.nextInt();
			ms[i].price = (byte) rdm.nextInt();
		}
		return ms;
	}

	public static void main(String[] args) {
		int n = 3;
		MyItem[] ms = radomBuildMyItems(3);
		ByteStore store = new ByteStore();
		for (int i = 0; i < n; i++) {
			store.putMyItem(i, ms[i]);
		}
		// 放
		for (int i = 0; i < n; i++) {
			store.putMyItem(i, ms[i]);
		}

		// 取
		MyItem[] msNew = new MyItem[n];
		for (int i = 0; i < n; i++) {
			msNew[i] = store.getMyItem(i);
		}
		
		System.out.println("是否相等："+Arrays.equals(ms, msNew));
	}

}
