package com.eaccom.core.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @description
 * 
 * @author yuedp
 * @date 2013-7-27
 */
public class PasswordUtil {

	public static void main(String[] args) {

		System.out.println(MD5Encode("123456"));
		System.out.println(SHA1Encode("123456"));

	}
	
	/**
	 * SHA1加密，生成41位SHA1码
	 */
	public static String SHA1Encode(String str) {
		MessageDigest sha1 = null;
		try {
			sha1 = MessageDigest.getInstance("SHA-1");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		char[] charArr = str.toCharArray();
		byte[] byteArr = new byte[charArr.length];

		for (int i = 0; i < charArr.length; i++) {
			byteArr[i] = (byte) charArr[i];
		}
		
		sha1.update(byteArr, 0, byteArr.length);
		byte[] sha1hash = sha1.digest();
		
		StringBuffer hexValue = new StringBuffer();

		for (int i = 0; i < sha1hash.length; i++) {
			int val = ((int) sha1hash[i]) & 0xff;
			if (val < 16)
				hexValue.append("0");
			hexValue.append(Integer.toHexString(val));
		}
		
		return hexValue.toString();
	}

	/**
	 * 加密解密算法，执行一次加密，两次解密
	 */
	public static String convertMD5(String str) {
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			charArr[i] = (char) (charArr[i] ^ 't');
		}
		String s = new String(charArr);
		return s;
	}

	/**
	 * MD5加密，生成32位MD5码
	 */
	public static String MD5Encode(String str) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		char[] charArr = str.toCharArray();
		byte[] byteArr = new byte[charArr.length];

		for (int i = 0; i < charArr.length; i++) {
			byteArr[i] = (byte) charArr[i];
		}

		byte[] md5Bytes = md5.digest(byteArr);
		StringBuffer hexValue = new StringBuffer();

		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16)
				hexValue.append("0");
			hexValue.append(Integer.toHexString(val));
		}

		return hexValue.toString();
	}

}
