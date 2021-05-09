package com.starter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class variableholder
{
public String writeoutfile = null;
	public String wlinterface ="interface=wlan0";
	public String ssid ="ssid=HDkugiutfuzdf123456789";
	public String iee = "ieee80211n=1";
	public String iee2 = "ieee80211d=1";
	public String iee3 = "ieee80211ac=1";
	public String CountryCode = "country_code=DE";
	public String wmm = "wmm_enabled=1";
	public String authalgs ="auth_algs=1";
	public String headerstring ;
	public String passphrase;

	public String Channelset = "2";
	public String twodotfour = "hw_mode=g" + '\n' + "channel=" + Channelset + '\n';
	public String fivedoto = "hw_mode=a" + '\n' + "channel=" + Channelset + '\n' + "Country_code=DE" + '\n' ;
public String outstring = null;
	public String authentifacator = "wpa=2" + '\n' + "wpa_key_mgmt=WPA-PSK" + '\n' + "rsn_pairwise=CCMP" + '\n' + passphrase+ '\n';

public String fivedotostring = null;
public String twodotfourstring = null;
	public void starter(){







	}

	public void fivedotomaker(String[] args){

		headerstring = wlinterface + '\n' + ssid + '\n' + iee + '\n' + CountryCode + '\n' + wmm + '\n' + authalgs + '\n';
		authentifacator = "wpa=2" + '\n' + "wpa_key_mgmt=WPA-PSK" + '\n' + "rsn_pairwise=CCMP" + '\n' + passphrase+ '\n';






		fivedoto = "hw_mode=a" + '\n' + "channel=" + Channelset + '\n'+ iee3 + '\n';
		outstring=headerstring+fivedoto+authentifacator;
		System.out.println("Generated 5GHZ Network conf : " + '\n' +outstring);
		try {
			Files.writeString( Path.of( args[4] ),outstring, StandardCharsets.UTF_8);
		} catch( IOException e ) {
			e.printStackTrace();
		}
	}

	public void twodotfourmaker(String[] args){


		headerstring = wlinterface + '\n' + ssid + '\n' + iee + '\n' + CountryCode + '\n' + wmm + '\n' + authalgs + '\n';
		authentifacator = "wpa=2" + '\n' + "wpa_key_mgmt=WPA-PSK" + '\n' + "rsn_pairwise=CCMP" + '\n' + passphrase+ '\n';

		twodotfour = "hw_mode=g" + '\n' + "channel=" + Channelset + '\n';



		twodotfourstring=headerstring+twodotfour+authentifacator;
outstring=twodotfourstring;
		System.out.println("Generated file :"+ '\n' + outstring);


		try {
			Files.writeString( Path.of( args[4] ),outstring, StandardCharsets.UTF_8);
		} catch( IOException e ) {
			e.printStackTrace();
		}

	}



}
