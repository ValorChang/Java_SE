package ������._06_date;


public class StringUtil {
	private StringUtil(){}
	
	/**
	 * �ж��ַ����Ƿ�ǿ�
	 * �ж��ַ������գ��Ȳ�������Ϊnull��Ҳ���ǿ��ַ���
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
	 * �ж��ַ����Ƿ�Ϊ��
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str) {
		return !hasLength(str);
	}
}
