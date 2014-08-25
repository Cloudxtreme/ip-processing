package ipaddress.helper;

/**
 * a class for processing ip
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
}
