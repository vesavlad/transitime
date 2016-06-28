package org.transitime.app;
import org.transitime.applications.Core;
import org.transitime.configData.AgencyConfig;



public class App{
	
//	
	public static void main (String Argz[])
	{
	String agencyid="02";
	System.getProperties().setProperty("transitime.core.configRevStr",
			  "0");
	System.getProperties().setProperty("transitime.core.agencyId",
			  "02");
	System.getProperties().setProperty("transitime.logging.dir",
			  "C:\\Users\\Brendan\\Documents\\TransitimeTest\\core\\transitime\\logs\\");
	Core testcore = new Core(agencyid);
	//Core test=testcore.createCore();
	/*try{*/
			// Write pid file so that monit can automatically start
			// or restart this application
			//PidFile.createPidFile(CoreConfig.getPidFileDirectory()
			//		+ AgencyConfig.getAgencyId() + ".pid");
			
			
			// Initialize the core now
			testcore.createCore();
						
				
			
			// Start the RMI Servers so that clients can obtain data
			// on predictions, vehicles locations, etc.		
			testcore.startRmiServers(agencyid);
	/*	} catch (Exception e) {
			fail(e.toString());
			e.printStackTrace();
		}
	*/
	}
}









