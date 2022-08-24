/*
 * IpAddress.java
 * Simon Dionne-Couture
 *
 * Get an IP Address and splits it into octets
 **/


public class IpAddress {
	String dottedDecimal;
	String[] octet;

	//1 Parameter Constructor
	public IpAddress (String dottedDecimal) {
		setDottedDecimal(dottedDecimal);
		setOctet(dottedDecimal);
	}

	//1 Parameter Instance Method to assign instance variable.
	public void setDottedDecimal (String dottedDecimal) {
		this.dottedDecimal = dottedDecimal;
	}

	public String getDottedDecimal () {	return this.dottedDecimal; }

	public void setOctet (String dottedDecimal) {
		this.octet = dottedDecimal.split("\\.");
		}
	public int getOctet (int position) { return Integer.parseInt(octet[position-1]);}
}
