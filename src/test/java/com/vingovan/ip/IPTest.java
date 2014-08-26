package com.vingovan.ip;

import ipaddress.helper.IPHelper;

import org.junit.Test;

public class IPTest {
	@Test
	public void IPProcessTest() throws Exception{
		IPHelper ipHelper = new IPHelper();
		String ip = "192.168.3";
		System.out.println(ipHelper.IptoLong(ip));
	}
}
