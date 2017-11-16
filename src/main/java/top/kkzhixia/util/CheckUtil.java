package top.kkzhixia.util;

import java.util.Arrays;

/**
 * 
 * 
 * 
 * @author Pactera
 *
 */
public class CheckUtil {

	 private static final String  token="kkzhixia";
	
	private static boolean  checkSignature( String signature,String timestamp,String nonce) {

		
		String[] arr=new String[]{token,timestamp,nonce}; 
		Arrays.sort(arr);
		return true;
		
	}
	
	
	
}
