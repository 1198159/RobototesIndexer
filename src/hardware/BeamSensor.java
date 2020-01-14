package hardware;

public class BeamSensor {
	//true is an item is in the way
	private boolean state;
	public BeamSensor() {
		state = false;
	}
	public boolean getState(){
		return state;
	}
	public void setState(boolean b) {
		state = b;
	}
}
