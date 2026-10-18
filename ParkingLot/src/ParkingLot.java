import java.util.*;
public class ParkingLot {

static ArrayList<CompactSpot> CompactSpotList=new ArrayList<>();
static ArrayList<LargeSpot> LargeSpotList=new ArrayList<>();
static ArrayList<BikeSpot> BikeSpotList=new ArrayList<>();

static int FreeCompactSpot;
static int FreeBikeSpot;
static int FreeLargeSpot;

public ParkingLot(int FreeCompactSpot,int FreeBikeSpot,int FreeLargeSpot)
{
	this.FreeCompactSpot=FreeCompactSpot;
	this.FreeBikeSpot=FreeBikeSpot;
	this.FreeLargeSpot=FreeLargeSpot;
}

//Parking
public void Parking(Vehicle Vehicle)
{
	if(Vehicle.getVehicleType().equals(VehicleType.TRUCK))
	{
		if(FreeCompactSpot>0)
		{
			System.out.println("Your Vehicle No"+Vehicle.getVehicleNo()+"has been parked Successfully");
			ParkingCompactVehicle(Vehicle);
			FreeCompactSpot--;
			
		}
		else 
		{
			System.out.println("Sorry,Your Vechicle cannot be Parking.Since There is no Space");
			
		}
		
	}
	else if(Vehicle.getVehicleType().equals(VehicleType.CAR))
	{
		if(FreeLargeSpot>0)
		{
			System.out.println("Your Vehicle No"+Vehicle.getVehicleNo()+"has been parked Successfully");
			ParkingLargeVehicle(Vehicle);
			FreeBikeSpot--;
		}
		else if(FreeCompactSpot>0)
		{
			System.out.println("Your Vehicle No"+Vehicle.getVehicleNo()+"has been parked Successfully");
			ParkingCompactVehicle(Vehicle);
			FreeCompactSpot--;
		}
		else {
			System.out.println("Sorry,Your Vehicle cannot be Parked.Since There is no Space");
		}
	}
	else if(Vehicle.getVehicleType().equals(VehicleType.BIKE))
	{
		if(FreeBikeSpot>0)
		{
			System.out.println("Your Vehicle NO"+Vehicle.getVehicleNo()+"has been Parked Successfully");
			ParkingBikeVehicle(Vehicle);
			FreeBikeSpot--;
		}
		else if(FreeCompactSpot>0)
		{
			System.out.println("Your Vehicle NO"+Vehicle.getVehicleNo()+"has been Parked Successfully");
			ParkingCompactVehicle(Vehicle);
			FreeCompactSpot--;	
		}
		else if(FreeLargeSpot>0) {
			
				System.out.println("Your Vehicle NO"+Vehicle.getVehicleNo()+"has been Parked Successfully");
				ParkingLargeVehicle(Vehicle);
				FreeLargeSpot--;	
			}
			
		}
	else {
		System.out.println("Sorry,Parking Spot not available");
	}
	}
//Unparking

private void ParkingLargeVehicle(Vehicle Vehicle) {
	// TODO Auto-generated method stub
	LargeSpot LargeVehicle=new LargeSpot(ParkingSpotType.LARGE);
	LargeVehicle.setFree(false);
	LargeVehicle.setVehicle(Vehicle);
	Vehicle.setParkingSpot(LargeVehicle);
	LargeSpotList.add(LargeVehicle);
	System.out.println("Your Vehicle is Successfully Parked");
}
private void ParkingBikeVehicle(Vehicle Vehicle) {
	// TODO Auto-generated method stub
	BikeSpot LargeVehicle=new BikeSpot(ParkingSpotType.BIKE);
	LargeVehicle.setFree(false);
	LargeVehicle.setVehicle(Vehicle);
	Vehicle.setParkingSpot(LargeVehicle);
	BikeSpotList.add(LargeVehicle);
	System.out.println("Your Vehicle is Successfully Parked");
}
private void ParkingCompactVehicle(Vehicle Vehicle) {
	// TODO Auto-generated method stub
	CompactSpot LargeVehicle=new CompactSpot(ParkingSpotType.BIKE);
	LargeVehicle.setFree(false);
	LargeVehicle.setVehicle(Vehicle);
	Vehicle.setParkingSpot(LargeVehicle);
	CompactSpotList.add(LargeVehicle);
	System.out.println("Your Vehicle is Successfully Parked");
}






//Unparking
public void UnParking(Vehicle Vehicle)
{
	ParkingSpot parkingSpot=Vehicle.getParkingSpot();
	parkingSpot.setFree(true);
	if(Vehicle.getVehicleType().equals(VehicleType.TRUCK))
	{
		if(CompactSpotList.remove(parkingSpot))
		{
			System.out.println("Removed Successfully");
			FreeLargeSpot++;
		}
		else
		{
			System.out.println("Unavailable");
		}
	}
	
}
}










