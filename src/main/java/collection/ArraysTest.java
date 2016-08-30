package collection;

import java.util.Arrays;
import java.util.function.IntFunction;

import org.junit.*;

public class ArraysTest {

	@Before
	public void before() {
		System.out.println("before");
	}

	@After
	public void after() {
		System.out.println("after");
	}

	@Test
	public void testSetAll() {
		Integer[] arr = { 2, 4, 6, 8 };
		/*
		 * Arrays.setAll(arr, new IntFunction<Object>() {
		 * 
		 * @Override public Object apply(int value) { return value + 1; } });
		 */
		Arrays.setAll(arr, v -> v + 1);//等于上面的方法，jdk1.8 的 lambda写法
		Assert.assertArrayEquals("不等于[1,2,3,4]", new Integer[] { 1, 2, 3, 4 },
				arr);
	}

}
