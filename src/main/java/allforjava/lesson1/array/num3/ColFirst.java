/**   
 * @Description: 列优先计算
 * @author wby  
 * @date 2016年8月26日 下午9:25:27 
 * @version V1.0   
 */
package allforjava.lesson1.array.num3;

import org.omg.CORBA.PRIVATE_MEMBER;

import allforjava.lesson1.array.ArrayFacorty;
import allforjava.lesson1.array.TimeCount;

public class ColFirst extends TimeCount {

	/*
	 * result is 104857600 time consume is 2.983274304
	 */
	public static void main(String[] args) {
		long amount = 0;
		int row = 10240, col = 10240;
		byte[][] arr = ArrayFacorty.makeArray10240();
		begin();
		byte[] s;
		for (int i = 0, len = col; i < len; i++) {// 列
			for (int j = 0, jlen = row; j < jlen; j++) {// 行
				// System.out.println(s[j]);
				amount += arr[j][i];
			}
		}
		end();
		System.out.println("result is " + amount);
		System.out.println("time consume is " + timeConsumed());

	}

}
