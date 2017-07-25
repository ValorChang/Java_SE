package 常用类._06_date;


public class StringUtil {
	private StringUtil(){}
	
	/**
	 * 判断字符串是否非空
	 * 判断字符串不空；既不是引用为null，也不是空字符。
	 * @param str
	 * @return
	 */
	public static boolean hasLength(String str) {
		if (str != null && !"".equals(str.trim())) {
			return true;
		}
		return false;
	}

	/**
	 * 判断字符串是否不为空
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str) {
		return !hasLength(str);
	}
}
