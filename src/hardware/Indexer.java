package hardware;

import utils.Ratio;

public class Indexer {
	
	public Ratio sideRatio = new Ratio(1,1);
	public Ratio upRatio = new Ratio(1,1);
	
	public DriveBase driveBase;
	
	public Motor tower = new Motor();
	public Motor leftSide = new Motor();
	public Motor rightSide = new Motor();
	
	public BeamSensor[] beamSensors = new BeamSensor[6];
	public Indexer() {
		for (int i = 0; i < beamSensors.length; i++) {;
			beamSensors[i] = new BeamSensor();
		}
	}
	
	
}
