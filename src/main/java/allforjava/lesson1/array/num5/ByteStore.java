/**   
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author wby  
 * @date 2016年8月27日 上午11:14:51 
 * @version V1.0   
 */
package allforjava.lesson1.array.num5;

import java.util.Arrays;

public class ByteStore {

	private byte[] storeByteArry = new byte[3000];

	public ByteStore() {
		// 初始化
		Arrays.fill(storeByteArry, (byte) 0);
	}

	public void putMyItem(int index, MyItem item) {
		if (index >= 1000)
			throw new IndexOutOfBoundsException("最大只能999");
		int idx = index * 3;
		storeByteArry[idx] = item.type;
		storeByteArry[idx + 1] = item.color;
		storeByteArry[idx + 2] = item.price;
	}

	public MyItem getMyItem(int index) {
		if (index >= 1000)
			throw new IndexOutOfBoundsException("最大只能999");
		MyItem item = new MyItem();
		int idx = index * 3;
		item.type = storeByteArry[idx];
		item.color = storeByteArry[idx + 1];
		item.price = storeByteArry[idx + 2];
		return item;
	}

}
