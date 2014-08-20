package jaxws.geoip.client;

import jaxws.geoip.stubs.GeoIP;
import jaxws.geoip.stubs.GeoIPService;
import jaxws.geoip.stubs.GeoIPServiceSoap;




public class GeoIpClient {
	public static void main (String[] args){
		String ipAddress = "74.125.239.142";
		GeoIPService ipService = new GeoIPService();
		GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
		GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
		System.out.println(geoIP.getCountryName());
	}
}
