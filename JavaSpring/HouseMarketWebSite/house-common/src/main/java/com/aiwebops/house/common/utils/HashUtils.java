package com.aiwebops.house.common.utils;

import java.nio.charset.Charset;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class HashUtils {
	
	private static final HashFunction FUNCTION = Hashing.goodFastHash(32);
	
	private static final String SALT = "aiwebops.com";
	
	public static String encryPassword(String password){
	   HashCode hashCode =	FUNCTION.hashString(password+SALT, Charset.forName("UTF-8"));
	   return hashCode.toString();
	}

}
