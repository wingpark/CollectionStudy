/**   
 * @Description: 
 * @author wby  
 * @date 2016年8月27日 上午11:12:02 
 * @version V1.0   
 */
package allforjava.lesson1.array.num5;

public class MyItem {
	public byte type, color, price;

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj))
			return true;
		MyItem itm = (MyItem) obj;
		if (this.type == itm.type && this.color == itm.color
				&& this.price == itm.price)
			return true;
		return false;
	}

}
