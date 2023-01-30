public class PrintHouse {
    public static void main(String []args) {
        // creating object of House class
        House h = new House("H102s", "Kartavya Path", "Aurangabad");

        // printing house in given format
        System.out.println("House Number : " + h.getHouseNo());
        System.out.println("Street Name : " + h.getStreetName());
        System.out.println("City : " + h.getcity());
    }
}
