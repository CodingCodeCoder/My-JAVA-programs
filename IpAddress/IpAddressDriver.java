/*
 * IpAddressDriver.java
 * Simon Dionne-Couture
 *
 * Driver Class for IpAddress.java - construct ip and displays dottedDecimal and octets
 **/

public class IpAddressDriver{
	public static void main(String[] args)
	{
		IpAddress ip = new IpAddress("216.27.6.136");
		System.out.println(ip.getDottedDecimal());
		System.out.println(ip.getOctet(4));
		System.out.println(ip.getOctet(1));
		System.out.println(ip.getOctet(3));
		System.out.println(ip.getOctet(2));
	} // end main
}
