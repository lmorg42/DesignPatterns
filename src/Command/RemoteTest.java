package Command;

public class RemoteTest {

	public static void main(String[] args) 
	{
		RemoteControl remoteControl = new RemoteControl();
		
		Light kitchenLight = new Light("Kitchen");
		Light bedRoomlight = new Light("Bedroom");
		Television livingroomTV = new Television("Living Room");
		Stereo bedroomStereo = new Stereo("Bedroom");
		CeilingFan kitchenFan = new CeilingFan("Kitchen");
		
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		LightOnCommand bedroomLightOn = new LightOnCommand(bedRoomlight);
		LightOffCommand bedroomLightOff = new LightOffCommand(bedRoomlight);
		
		TVOnCommand livingRoomTVOn = new TVOnCommand(livingroomTV);
		TVOffCommand livingRoomTVOff = new TVOffCommand(livingroomTV);
		
		CeilingFanHighCommand kitchenFanHigh = new CeilingFanHighCommand(kitchenFan);
		CeilingFanMediumCommand kitchenFanMedium = new CeilingFanMediumCommand(kitchenFan);
		CeilingFanOffCommand kitchenFanOff = new CeilingFanOffCommand(kitchenFan);
		
		Command[] macroOn = { kitchenLightOn, kitchenFanHigh, livingRoomTVOn };
		Command[] macroOff = {kitchenLightOff, kitchenFanOff, livingRoomTVOff };
		
		MacroCommand macroCommandOn = new MacroCommand(macroOn);
		MacroCommand macroCommandOff = new MacroCommand(macroOff);
		
		remoteControl.setCommand(0, livingRoomTVOn, livingRoomTVOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, bedroomLightOn, bedroomLightOff);
		remoteControl.setCommand(3, kitchenFanHigh, kitchenFanOff);
		remoteControl.setCommand(4, kitchenFanMedium, kitchenFanOff);
		remoteControl.setCommand(5, macroCommandOn, macroCommandOff);
		//lambda
		//Only works with one method in an interface
		//		remoteControl.setCommand(3, 
		//								() -> {bedroomStereo.on(); bedroomStereo.on();},
		//								() -> bedroomStereo.off());
		
		System.out.println(remoteControl);
		
		remoteControl.buttonOnePushed(0);
		remoteControl.buttonTwoPushed(0);
		remoteControl.undoButtonWasPushed();
		remoteControl.buttonOnePushed(1);
		remoteControl.buttonTwoPushed(1);
		remoteControl.buttonOnePushed(2);
		remoteControl.buttonTwoPushed(2);
		remoteControl.buttonOnePushed(3);
		remoteControl.buttonTwoPushed(3);
		remoteControl.buttonOnePushed(3);
		remoteControl.buttonOnePushed(4);
		remoteControl.undoButtonWasPushed();
		remoteControl.buttonOnePushed(5);
		remoteControl.buttonTwoPushed(5);
		remoteControl.undoButtonWasPushed();
		
	}

}
