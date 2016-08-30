/**   
 * @Description: 工具类，统一生成测试用数组数据
 * @author wby  
 * @date 2016年8月26日 下午9:13:33 
 * @version V1.0   
 */
package allforjava.lesson1.array;

import java.util.Arrays;

public class ArrayFacorty {

	/**
	  * @Title: makeArray10240 
	  * @Description: 生成10240*10240的二维byte数组
	  * @return  
	  * @return byte[][]  
	  * @throws
	 */
	public static byte[][] makeArray10240() {
		byte[][] m = new byte[10240][10240];
		byte[] s;
		for (int i = 0, len = m.length; i < len; i++) {
			s = m[i];
			Arrays.fill(s, (byte) 1);
		}
		return m;
	}
}
