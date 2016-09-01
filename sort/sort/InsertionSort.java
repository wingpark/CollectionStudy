/**   
 * @Description: 插入排序
 * 0到i为排序好区域，每次把i+1的数据插入到排序好的区域的合适的位置，每次比较，主要不在合适位置，都会做一次交换移位。
 * @author wby  
 * @date 2016年8月30日 下午3:24:16 
 * @version V1.0   
 */
package sort;

import util.In;

public class InsertionSort extends AbstractSort {

	@Override
	protected void sort(Comparable[] a) {
		for (int i = 1, len = a.length; i < len; i++) {
			/*
			 * for (int j = i; j > 0; j--) { if(this.less(a[j], a[j-1])) {
			 * this.exch(a, j, j-1); } else { break; } }
			 */
			// 上面代码可以简写为以下内容
			for (int j = i; j > 0 && this.less(a[j], a[j - 1]); j--) {
				this.exch(a, j, j - 1);
			}
		}

	}

	public static void main(String[] args) {
		String[] a = (new In("F:/java_plus/algs4-data/tiny.txt"))
				.readAllStrings();
		InsertionSort sort = new InsertionSort();
		sort.runSort(a);

	}

}
