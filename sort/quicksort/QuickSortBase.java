/**   
 * @Description: 基础快排
 * @author wby  
 * @date 2016年8月31日 下午5:56:06 
 * @version V1.0   
 */
package quicksort;

import java.util.Arrays;

import sort.AbstractSort;
import util.In;

public class QuickSortBase extends AbstractSort {

	public static void main(String[] args) {
		//Integer[] a = (new In("F:/java_plus/algs4-data/mediumUF.txt"))
		Integer[] a = (new In("F:/java_plus/algs4-data/largeT.txt"))
				.readAllIntegers();
		QuickSortBase sort = new QuickSortBase();
		sort.runSort(a);
	}
	
	@Override
	protected void runSort(Comparable[] a) {
		sort(a);
		System.out.println("is sorted:" + isSorted(a));
		//show(a);
	}

	@Override
	protected void sort(Comparable[] a) {
		int lo = 0, hi = a.length - 1;
		sort(a, 0, hi);
	}

	private void sort(Comparable[] a, int lo, int hi) {
		if (lo >= hi)
			return;
		int j = partition(a, lo, hi);
		sort(a, lo, j - 1);
		sort(a, j + 1, hi);
	}

	private int partition(Comparable[] a, int lo, int hi) {
		int i = lo, j = hi + 1;

		Comparable v = a[lo];
		while (true) {
			while (this.less(a[++i], v)) {
				if (i >= hi)
					break;
			}
			while (this.less(v, a[--j])) {
				if (j <= lo)
					break;
			}
			if (i >= j)
				break;
			this.exch(a, i, j);
		}
		this.exch(a, lo, j);
		return j;
	}

}
