package allforjava.lesson1.bitoperater;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class bitTest {
	
	@Before
	public void before() {
		System.out.println("before");
	}
	
	/**
	 * 第一题
	 */
	@Test
	public void testLeftMove() {
		byte ba = 127;
		//强转是因为在做位操作时会强制转换成int（32位）时在做操作
		byte bb = (byte) (ba << 2);
		System.out.println(bb);
		System.out.println(Integer.toBinaryString(bb));
		System.out.println(Integer.toBinaryString(-bb));
		/*
		 * 11111111左移动两位溢出变成11111100,由于符号位变成负数，机器嘛存储负数的形式是补码
		 * ，所以读出来时是以补码形式读取，所以是10000100，正好是-4
		 */
		Assert.assertEquals(-4, bb);
		
		//延长位数后，不溢出时，是正确的。
		int bc = ba << 2;
		System.out.println(bc);
	}
	
	/**
	 * 第二题
	 */
	@Test
	public void testRightMove() {
		//(1111){5} 1100 (0000){2}
		int a = -1024;
		
		//(1111){5} 1110 (0000){2}
		int b = a >> 1;
		System.out.println(b);//-512
		
		//0111 (1111){4} 1110 (0000){2}
		int c = a >>> 1;
		System.out.println(c);//2147483136
	}

}
