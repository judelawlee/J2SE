package com.eaccom.imoney.util;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import com.eaccom.imoney.enums.UserStatusEnum;

public class EnumRepository {
	static Map<String, Object> userStatusMap = null;

	public static Map<String, Object> getUserStatusMap() {
		if (userStatusMap == null) {
			userStatusMap = new HashMap<String, Object>();
			EnumSet<UserStatusEnum> set = EnumSet.allOf(UserStatusEnum.class);
			for (UserStatusEnum userStatus : set) {
				userStatusMap.put(userStatus.name(), userStatus.value());
			}
		}
		return userStatusMap;
	}
}