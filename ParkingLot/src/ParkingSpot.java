
public class ParkingSpot {

	private ParkingSpotType ParkingSpotType;
	private Vehicle Vehicle;
	private Boolean Free;
	public ParkingSpot(ParkingSpotType ParkingSpotType)
	
	{
	this.ParkingSpotType=ParkingSpotType;
	}
	public ParkingSpotType getParkingSpotType() {
		return ParkingSpotType;
	}
	public void setParkingSpotType(ParkingSpotType parkingSpotType) {
		ParkingSpotType = parkingSpotType;
	}
	public Vehicle getVehicle() {
		return Vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		Vehicle = vehicle;
	}
	public Boolean getFree() {
		return Free;
	}
	public void setFree(Boolean free) {
		Free = free;
	}
	
	
}
