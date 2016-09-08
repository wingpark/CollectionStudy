/**   
* @Description: 得到 String s="中国" 这个字符串的utf-8编码，gbk编码，iso-8859-1编码的字符串，
* 看看各自有多少字节，同时解释为什么以utf-8编码得到的byte[]无法用gbk的方式“还原”为原来的字符串
* @author wby  
* @date 2016年9月1日 下午8:28:19 
* @version V1.0   
*/
package hw2.num1;

import java.io.UnsupportedEncodingException;

public class Charset {

	public static void main(String[] args) {
		String s = "中国";
		try {
			System.out.println("---------utf-8------------");
			byte[] chinaUtf8 = s.getBytes("utf8");
			System.out.println("\"中国\"utf-8："+chinaUtf8);
			System.out.println("\"中国\"utf-8 有："+chinaUtf8.length +"个字节");
			System.out.println("\"中国\"utf-8 还原："+new String(chinaUtf8,"utf8"));
			
			System.out.println("---------gbk------------");
			//String chinaGbk = new String(s.getBytes(),"gbk");
			byte[] chinaGbk = s.getBytes("gbk");
			System.out.println("\"中国\"gbk："+chinaGbk);
			System.out.println("\"中国\"gbk 有："+chinaGbk.length +"个字节");
			System.out.println("\"中国\"gbk 还原："+new String(chinaGbk,"gbk"));
			
			System.out.println("---------iso-8859-1------------");
			byte[] china8859 = s.getBytes("iso-8859-1");
			System.out.println("\"中国\"iso-8859-1："+china8859);
			System.out.println("\"中国\"iso-8859-1 有："+china8859.length +"个字节");
			System.out.println("\"中国\"iso-8859-1 还原："+new String(china8859,"iso-8859-1"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
