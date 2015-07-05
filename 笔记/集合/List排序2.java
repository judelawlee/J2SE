package com.silverfox.finance.web.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.silverfox.finance.domain.RebateStrategy;

public class T {

	public static void main(String[] args) {
		RebateStrategy s1 = new RebateStrategy();
		s1.setId(1);
		s1.setQuota(1000);

		RebateStrategy s2 = new RebateStrategy();
		s2.setId(2);
		s2.setQuota(2000);

		RebateStrategy s3 = new RebateStrategy();
		s3.setId(3);
		s3.setQuota(3000);

		List<RebateStrategy> list = new ArrayList<RebateStrategy>();
		list.add(s3);
		list.add(s1);
		list.add(s2);

		Collections.sort(list, new Comparator<RebateStrategy>() {
			@Override
			public int compare(RebateStrategy r1, RebateStrategy r2) {
				return r1.getQuota() > r2.getQuota() ? 1 : -1;
			}
		});
		
		for (RebateStrategy r : list) {
			System.out.println(r.getId() + ";" + r.getQuota());
		}
	}
}
