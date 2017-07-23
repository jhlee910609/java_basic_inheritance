package Phone;

public class DmbCellPhone extends CellPhone {
	
	public int currentChannel;
	
	public DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.currentChannel = channel;
	}

	void turnOnDmb(){
		System.out.println("채널 [" + currentChannel + " ] DMB 방송 수신을 시작합니다.." );
	}
	
	void changeCahnnelDmb(int channel){
		this.currentChannel = channel;
		System.out.println("채널 [" + currentChannel + " ] 번으로 바꿉니다.." );
	}
	
	void turnOffDmb(){
		System.out.println("DBM 방송 수신을 멈춥니다..");
	}
	
	
	
	
	

}
