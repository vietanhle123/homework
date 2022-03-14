package BTVN_Java;

public class ProDuct {
    public static void main(String[] args) {
        int productID = 19845;
        String productName = "Le Nhu Viet Anh";
        char productType = 'A';
        short quantity = 148;
        double productPrice = 15_25_4.65;
        int barcodeaNumber = 0b1101_0101_0001_1010;
        boolean availableStatus = true;

        System.out.println("\tProduct Details");
        System.out.println("--------------------------------------");
        System.out.println("Product Identification Code: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Category (A: Apparels G: Gadgets ): " + productType);
        System.out.println("Product Quantity: " + quantity);
        System.out.println("Product Price: $ "+productPrice);
        System.out.println("Product BarCode Number: " + barcodeaNumber);
        System.out.println("Product Availability: " + availableStatus);

    }
}
