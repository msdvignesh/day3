package remoteControl;

import remoteControl.TVRemoteControl.TVRemote;
import remoteControl.acRemoteControl.ACRemote;
import remoteControl.acRemoteControl.ACRemoteControl;
import remoteControl.setTopBoxRemoteControl.SetTopBoxRemote;

public class MobileRemoteControlTest {
 
	public static void main(String[] args) {
		
		MobileRemoteControl mrc = new MobileRemoteControl();
		
		ACRemote ac = mrc;
		ac.changeTemp();
		
		SetTopBoxRemote stb = mrc;
		stb.changeChannelInSetTopBox();
		//stb.changeTemp();
		
		TVRemote tv = mrc;
		tv.changeChannelInTV();
		//tv.changeTemp();
		// tv.changeChanelInSetTopBox();
		
	}
}
