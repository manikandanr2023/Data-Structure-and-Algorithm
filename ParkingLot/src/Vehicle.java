
public class Vehicle {
	private int VehicleNo;
	private VehicleType VehicleType;
	private ParkingSpot ParkingSpot;
	
	public Vehicle(VehicleType vehicle)
	{
		this.VehicleType=vehicle;
	}
	
	
	
	public int getVehicleNo() {
		return VehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		VehicleNo = vehicleNo;
	}
	public VehicleType getVehicleType() {
		return VehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		VehicleType = vehicleType;
	}



	public ParkingSpot getParkingSpot() {
		return ParkingSpot;
	}



	public void setParkingSpot(ParkingSpot parkingSpot) {
		ParkingSpot = parkingSpot;
	}
	
	

}
