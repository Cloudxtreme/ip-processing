package ipaddress.helper;

/**
 * a class for processing ip address
 * 
 * @author ngovi
 *
 */
public class IPHelper {

	/**
	 * check two IPs in a range
	 * 
	 * @param ipOne
	 * @param ipTwo
	 * @return
	 */
	public boolean isInRange(String ipOne, String ipTwo) {
		String[] splitIP1 = ipOne.split("\\.");
		String[] splitIP2 = ipTwo.split("\\.");
		System.out.println(splitIP1.length);
		if (splitIP1[0].contains(splitIP2[0])) {
			if (splitIP1[1].contains(splitIP2[1])) {
				if (splitIP1[2].contains(splitIP2[2])) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Convert IP Address to Long
	 * @param ipAddress
	 * @return
	 * @throws Exception
	 */
	public long IptoLong(String ipAddress) throws Exception {
		String[] ipAddressSplits = ipAddress.split("\\.");
		long result = 0;
		if (ipAddressSplits.length == 4) {

			for (int i = 0; i < ipAddressSplits.length; i++) {
				int power = 3 - i;
				int ip = Integer.parseInt(ipAddressSplits[i]);
				result += ip * Math.pow(256, power);
			}
		} else {
			throw new Exception("Invalid IpAddress");
		}
		return result;
	}
}
