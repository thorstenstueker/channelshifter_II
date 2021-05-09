package com.starter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class starterclass
{
	public static void main( String[] args ) {
		// Args are modetoset which is fivedoto or twodotfour next is channel which can be any valid channel for rpi
		variableholder test = new variableholder();

		if( args.length >= 1 ) {
			test.Channelset = args[1];
			test.ssid = "ssid=" + args[3];
			test.passphrase = "wpa_passphrase=" + args[2];
			test.writeoutfile = args[4];
			test.CountryCode = args[5];
		} else {

		}
		if( args.length < 6 ) {

			System.out.println(
				"Arguments must be set: sudo java -jar channelsbhifter.jar networkargument channel password ssid file_with_path country_code=de" );
		}

		if( args.length > 5 ) {

			if (args[0].equals("--help")){

				System.out.println("\t\t\t\t\"Arguments must be set: sudo java -jar channelsbhifter.jar networkargument channel password ssid file_with_path\" );\n");
			}

			if(args[3].equals( "null" )){

				//get the current file passphrase and password from existing hostapd to not compromize it
				String Filename = "/etc/hostapd/hostapd.conf";
				String contentpassword = null;
				String contentssid = null;
				String existingconfig = null;
				try {
					existingconfig = Files.readString( Path.of( Filename ) );
				} catch( IOException e ) {
					e.printStackTrace();
				}

String[] splitresulter = existingconfig.split( "\\n" );

for (int interv = 0;interv < splitresulter.length;interv++){



	if(splitresulter[interv].contains( "passphrase" )){

test.passphrase=splitresulter[interv];
args[2]=splitresulter[interv];

		}

	if (splitresulter[interv].contains( "ssid" )){
		test.ssid = splitresulter[interv];
		args[3]=splitresulter[interv];

	}
}
			}

			////get out for testing the writing sequences



				if( args[0].equals( "fivedoto" ) ) {
					test.fivedotomaker( args );

				}

				if( args[0].equals( "twodotfour" ) ) {
					test.twodotfourmaker( args );

				}
			}


	}
}
