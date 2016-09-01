/**   
 * @Description: 双轴快速排序，TODO 待实现
 * @author wby  
 * @date 2016年8月31日 下午5:56:06 
 * @version V1.0   
 */
package quicksort;

import java.util.Arrays;

import sort.AbstractSort;
import util.In;

public class QuickSortDualPivot extends AbstractSort {

	public static void main(String[] args) {
		// Integer[] a = (new In("F:/java_plus/algs4-data/mediumUF.txt"))
		Integer[] a = (new In("F:/java_plus/algs4-data/largeT.txt"))
				.readAllIntegers();
		QuickSortDualPivot sort = new QuickSortDualPivot();
		sort.runSort(a);
	}

	@Override
	protected void runSort(Comparable[] a) {
		sort(a);
		System.out.println("is sorted:" + isSorted(a));
		// show(a);
	}

	@Override
	protected void sort(Comparable[] a) {
		int lo = 0, hi = a.length - 1;
		//sort(a, 0, hi);
	}

	/*private void sort(Comparable[] a, int lo, int hi) {
		if (lo >= hi)
			return;
		
		int p1=lo,p2=hi;
		int cmp=a[p1].compareTo(a[p2]);
		if(cmp>0){
			this.exch(a, p1, p2);
		} else if (cmp==0){
			while
		}
				
		int lt=lo+1,gt=hi,k=lt+1;
		int cmp;
		Comparable v = a[lo];

		while (k <= gt) {
			cmp = v.compareTo(a[i]);
			if (cmp < 0) {
				this.exch(a, i, gt--);
			} else if (cmp > 0) {
				this.exch(a, i++, lt++);
			} else {// eq
				i++;
			}
		}//a[lo..lt-1]<v=a[lt..gt]<a[gt+1..hi]

		sort(a, lo, lt-1);
		sort(a, gt+1, hi);
	}*/

}
