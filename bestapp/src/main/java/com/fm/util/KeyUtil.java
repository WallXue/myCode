/**
 * 
 */
package com.fm.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class KeyUtil {


	private static final AtomicInteger seqId = new AtomicInteger(100);

	private static final Lock lock = new ReentrantLock();

	private static final SimpleDateFormat dbSdf = new SimpleDateFormat("yyMMddHHmmss");

	public static long generateDBKey() {
		try {
			KeyUtil.lock.lock();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			String strDate = KeyUtil.dbSdf.format(new Date());
			StringBuffer sb = new StringBuffer();
			sb.append(strDate);
			if (KeyUtil.seqId.get() > 999) {
				KeyUtil.seqId.set(100);
			}
			sb.append(KeyUtil.seqId.getAndIncrement());
			return Long.parseLong(sb.toString());
		} finally {
			KeyUtil.lock.unlock();
		}
	}


}
