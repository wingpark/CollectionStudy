/**   
 * @Description: 父类
 * @author wby  
 * @date 2016年8月30日 上午10:44:47 
 * @version V1.0   
 */
package sort;

public abstract class AbstractSort {

	abstract protected void sort(Comparable[] a);

	protected boolean less(Comparable v, Comparable c) {
		return v.compareTo(c) < 0;
	}

	protected void exch(Comparable[] a, int idxi, int idxj) {
		Comparable t = a[idxi];
		a[idxi] = a[idxj];
		a[idxj] = t;
	}

	protected void show(Comparable[] a) {
		for (int i = 0, len = a.length; i < len; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	protected boolean isSorted(Comparable[] a) {
		for (int i = 1, len = a.length; i < len; i++) {
			if (less(a[i], a[i - 1]))
				return false;
		}
		return true;
	}

	protected void runSort(Comparable[] a) {
		sort(a);
		System.out.println("is sorted:" + isSorted(a));
		show(a);
	}

}
