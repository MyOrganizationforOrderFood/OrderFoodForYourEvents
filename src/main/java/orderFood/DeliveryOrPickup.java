package orderFood;

public class DeliveryOrPickup {
    
	private String deliveryAddress;
    private String pickupLocation;
    private String pickupTime;

    public void selectDeliveryOption(String address) {
        setDeliveryAddress(address);
        System.out.println("Delivery address confirmed: " + address);
        System.out.println("Estimated delivery time: 2 hours");
    }

    public void selectPickupOption(String location, String time) {
        setPickupLocation(location);
        setPickupTime(time);
        System.out.println("Pickup location confirmed: " + location);
        System.out.println("Available pickup time slots: 10:00 AM, 12:00 PM, 2:00 PM");
        System.out.println("Preferred pickup time selected: " + time);
    }

   

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}
}
