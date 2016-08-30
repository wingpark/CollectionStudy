/**   
 * @Description: 行优先计算
 * @author wby  
 * @date 2016年8月26日 下午9:25:27 
 * @version V1.0   
 */
package allforjava.lesson1.array.num3;

import org.omg.CORBA.PRIVATE_MEMBER;

import allforjava.lesson1.array.ArrayFacorty;
import allforjava.lesson1.array.TimeCount;

public class RowFirst extends TimeCount {

	/*
	 * result is 104857600
		time consume is 0.078739194
	 */
	public static void main(String[] args) {
		long amount = 0; 
		byte[][] arr = ArrayFacorty.makeArray10240();
		begin();
		byte[] s;
		for (int i = 0, len = arr.length; i < len; i++) {
			s = arr[i];
			for (int j = 0, jlen = s.length; j < jlen; j++) {
				//System.out.println(s[j]);
				amount += s[j];
			}
		}
		end();
		System.out.println("result is "+amount);
		System.out.println("time consume is "+timeConsumed());

	}

}
