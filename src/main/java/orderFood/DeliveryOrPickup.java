package orderFood;
import java.util.logging.Logger;


/**
 * The DeliveryOrPickup class represents the delivery or pickup options for a food order.
 * It allows users to select their preferred delivery address or pickup location and time.
 */
public class DeliveryOrPickup {

    private String deliveryAddress;
    private String pickupLocation;
    private String pickupTime;

    /**
     * Selects the delivery option for the food order and sets the delivery address.
     *
     * @param address The delivery address.
     */
   public void selectDeliveryOption(String address) {
        setDeliveryAddress(address);
        Logger logger = Logger.getLogger(getClass().getName());
        final String ADDRESS_CONFIRMATION_MESSAGE = "Delivery address confirmed: %s";
        final String estimatedDeliveryTime = "Estimated delivery time: 2 hours";

        logger.info(String.format(ADDRESS_CONFIRMATION_MESSAGE, address));

        if (shouldLogDeliveryTime()) {
            logger.info(estimatedDeliveryTime);
        }
    }

    private boolean shouldLogDeliveryTime() {
    
    return true; 
}
    /**
     * Selects the pickup option for the food order and sets the pickup location and time.
     *
     * @param location The pickup location.
     * @param time     The preferred pickup time.
     */
     public void selectPickupOption(String location, String time) {
        setPickupLocation(location);
        setPickupTime(time);
        System.out.println("Pickup location confirmed: " + location);
        System.out.println("Available pickup time slots: 10:00 AM, 12:00 PM, 2:00 PM");
        System.out.println("Preferred pickup time selected: " + time);
    }

    /**
     * Retrieves the delivery address.
     *
     * @return The delivery address.
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the delivery address.
     *
     * @param deliveryAddress The delivery address.
     */
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    /**
     * Retrieves the pickup location.
     *
     * @return The pickup location.
     */
    public String getPickupLocation() {
        return pickupLocation;
    }

    /**
     * Sets the pickup location.
     *
     * @param pickupLocation The pickup location.
     */
    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    /**
     * Retrieves the pickup time.
     *
     * @return The pickup time.
     */
    public String getPickupTime() {
        return pickupTime;
    }

    /**
     * Sets the pickup time.
     *
     * @param pickupTime The pickup time.
     */
    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }
}
