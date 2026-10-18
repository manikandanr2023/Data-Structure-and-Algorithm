
public class MainClient {
public static void main(String args[])
{
	ParkingLot ParkingLot=new ParkingLot(2,2,2);
	Vehicle vehicle=new Vehicle(VehicleType.TRUCK);
	ParkingLot.Parking(vehicle);
	ParkingLot.UnParking(vehicle);
	
}
}
