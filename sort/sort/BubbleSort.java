/**   
 * @Description: 冒泡排序
 * 
 * @author wby  
 * @date 2016年8月30日 下午3:24:16 
 * @version V1.0   
 */
package sort;

import util.In;

public class BubbleSort extends AbstractSort {

	@Override
	protected void sort(Comparable[] a) {
		for (int i = 0, len = a.length; i < len; i++) {
			boolean exchFlag = false;
			for (int j =1; j < len - i; j++) {
				if (this.less(a[j], a[j-1])) {
					this.exch(a,j,j-1);
					exchFlag = true;
				}
			}
			if(!exchFlag)//如果没有产生交换，则说明已经是有序，不需要再进行交换
				break;
		}

	}

	public static void main(String[] args) {
		String[] a = (new In("F:/java_plus/algs4-data/tiny.txt"))
				.readAllStrings();
		BubbleSort sort = new BubbleSort();
		sort.runSort(a);

	}

}
