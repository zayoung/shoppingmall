package com.meta.shop.session;

import java.util.HashMap;
import java.util.Map;

public class Session {
	private static Session session = new Session();
	private static Map<String, Object> sessionMap;
	
	private Session() {
		sessionMap = new HashMap<String, Object>();
	}
	
	public static Session getInstance() {
		return session;
	}
	
	public void setAttribute(String key, Object value) {
		sessionMap.put(key, value);
	}
	
	public Object getAttribute(String key) {
		return sessionMap.get(key);
	}
	
	public void removeAttribute(String key) {
		sessionMap.remove(key);
	}
}