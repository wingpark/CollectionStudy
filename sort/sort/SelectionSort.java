/**   
 * @Description: 选择排序
 * 每次选择剩余集合最小值和集合[i]交换 
 * @author wby  
 * @date 2016年8月30日 上午11:34:54 
 * @version V1.0   
 */
package sort;

import util.In;

public class SelectionSort extends AbstractSort {

	@Override
	protected void sort(Comparable[] a) {
		Comparable min;
		int minIdx;
		for (int i = 0, len = a.length; i < len; i++) {
			min = a[i];
			minIdx = i;
			for (int j = i + 1; j < len; j++) {
				if (!this.less(min, a[j])) {
					min = a[j];
					minIdx = j;
				}
			}
			this.exch(a, minIdx, i);
		}
	}

	public static void main(String[] args) {
		String[] a = (new In("F:/java_plus/algs4-data/tiny.txt")).readAllStrings();
		SelectionSort sort= new SelectionSort();
		sort.runSort(a);
	}

}
