/**   
 * @Description: 计算时长的方法
 * @author wby  
 * @date 2016年8月26日 下午9:28:31 
 * @version V1.0   
 */
package allforjava.lesson1.array;

import java.math.BigDecimal;

public class TimeCount {

	private static long beginTime, endTime;

	public static void begin() {
		beginTime = System.nanoTime();
	}

	public static void end() {
		endTime = System.nanoTime();
	}
	
	//返回耗时
	public static double timeConsumed() {
		return BigDecimal.valueOf(endTime - beginTime, 9).doubleValue();
	}

}
