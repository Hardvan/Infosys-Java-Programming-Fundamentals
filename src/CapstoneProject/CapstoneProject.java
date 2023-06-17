package CapstoneProject;

// NATURE VALLEY homestay provides a convenient and comfortable stay for visitors.
// The resort wants to automate its billing process.
// Homestay has three different types of rooms "Standard", "Deluxe" and "Cottage".
// They provide accommodation for a minimum of one day and a maximum of 15 days.
// Base Room Fare: Standard: 2500, Deluxe: 3500, Cottage: 5500
// Room Bill Components: TAX: 12%, EXTRA_PERSON_CHARGE: 500, FOOD_CHARGE: 800

interface RoomBillComponent {
    double TAX = 0.12;
    double EXTRA_PERSON_CHARGE = 500;
    double FOOD_CHARGE = 800;

    double calculateBill();
}

class RoomDetails implements RoomBillComponent {
    // Attributes
    private int billID;
    private String customerName;
    private String typeOfRoom;
    private int noOfExtraPersons;
    private int noOfDaysOfStay;
    private static int counter = 101; // For Auto-Generating billID

    // Constructor
    public RoomDetails(String customerName, String typeOfRoom, int noOfExtraPersons, int noOfDaysOfStay) {
        this.billID = counter++;
        this.customerName = customerName;
        this.typeOfRoom = typeOfRoom;
        this.noOfExtraPersons = noOfExtraPersons;
        this.noOfDaysOfStay = noOfDaysOfStay;
    }

    // Getters
    public int getBillID() {
        return billID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public int getNoOfExtraPersons() {
        return noOfExtraPersons;
    }

    public int getNoOfDaysOfStay() {
        return noOfDaysOfStay;
    }

    public boolean validateNoOfExtraPerson() {
        // 0 - 2 persons are allowed extra per room.
        // If the extra person is more than 2,
        // display an appropriate message on the console.
        if (noOfExtraPersons < 0) {
            System.out.println("Extra Persons cannot be less than 0.");
            return false;
        } else if (noOfExtraPersons > 2) {
            System.out.println("Extra Persons cannot be more than 2.");
            return false;
        }
        return true;
    }

    public boolean validateTypeOfRoom() {
        // If the user entered room is not of these types,
        // display an error message in the console.
        if (typeOfRoom.equalsIgnoreCase("Standard")
                || typeOfRoom.equalsIgnoreCase("Deluxe")
                || typeOfRoom.equalsIgnoreCase("Cottage")) {
            return true;
        } else {
            System.out.println("Invalid Room Type.");
            return false;
        }
    }

    public boolean validateNoOfDaysOfStay() {
        // If the number of days of stay is less than 1 or more than 15,
        // display an appropriate message on the console.
        if (noOfDaysOfStay < 1) {
            System.out.println("Number of days of stay cannot be less than 1.");
            return false;
        } else if (noOfDaysOfStay > 15) {
            System.out.println("Number of days of stay cannot be more than 15.");
            return false;
        }
        return true;
    }

    @Override
    public double calculateBill() {
        // Invoke validateNoOfExtraPerson()
        // Invoke validateTypeOfRoom()
        // Invoke validateNoOfDaysOfStay() methods.
        if (!(validateNoOfExtraPerson() && validateTypeOfRoom() && validateNoOfDaysOfStay())) {
            return 0;
        }

        // Identify Base Room Fare based on the type of room.
        double baseRoomFare = 0;
        switch (typeOfRoom.toLowerCase()) {
            case "standard":
                baseRoomFare = 2500;
                break;
            case "deluxe":
                baseRoomFare = 3500;
                break;
            case "cottage":
                baseRoomFare = 5500;
                break;
        }

        // Calculate total bill
        double totalBill = (noOfDaysOfStay * baseRoomFare)
                + (noOfDaysOfStay * FOOD_CHARGE)
                + (noOfExtraPersons * EXTRA_PERSON_CHARGE);
        totalBill += TAX * totalBill;

        return totalBill;
    }

    @Override
    public String toString() {
        // More efficient than + operator
        StringBuilder sb = new StringBuilder();
        sb.append("BillID: ").append(billID).append("\n");
        sb.append("Customer Name: ").append(customerName).append("\n");
        sb.append("Type of Room: ").append(typeOfRoom).append("\n");
        sb.append("Number of Extra Persons: ").append(noOfExtraPersons).append("\n");
        sb.append("Number of Days of Stay: ").append(noOfDaysOfStay).append("\n");
        sb.append("Total Bill: ").append(calculateBill());
        return sb.toString();
    }
}

public class CapstoneProject {
    public static void main(String[] args) {
        // Create an object for RoomDetails class.
        RoomDetails roomDetails = new RoomDetails("John",
                "Standard", 2, 5);

        // Invoke toString() method and display the details.
        System.out.println(roomDetails);
    }
}
