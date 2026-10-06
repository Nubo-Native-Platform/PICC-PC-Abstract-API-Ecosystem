/**
 * 
 */
package com.nubons.nnp.sso.abs.util;

import com.nubons.nnp.sso.abs.constants.APIConstants;

import java.util.concurrent.atomic.AtomicInteger;

public class UUIDGenerator {

	private static AtomicInteger counter = new AtomicInteger();

	public static String generateId(String prefix) {

		long time = System.nanoTime();
		String id = prefix + APIConstants.ID_DELIM + counter.incrementAndGet() + getTime_low(time) + getTime_high(time);
		return id;
	}

	private static int getTime_low(long l) {
		return (int) (0x0000000000ffffff & l);
	}

	private static long getTime_high(long l) {
		return ((0xffffff0000000000L & l) >> 80);
	}

}
