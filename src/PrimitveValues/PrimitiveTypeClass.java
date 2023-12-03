package PrimitveValues;

public class PrimitiveTypeClass {

	 // Primitive type fields
    private byte byteField;
    private short shortField;
    private int intField;
    private long longField;
    private float floatField;
    private double doubleField;
    private char charField;
    private boolean booleanField;

    // String type field
    private String stringField;

    // Method to display default values
    public void displayDefaultValues() {
        System.out.println("Default Values:");
        System.out.println("byteField: " + byteField);
        System.out.println("shortField: " + shortField);
        System.out.println("intField: " + intField);
        System.out.println("longField: " + longField);
        System.out.println("floatField: " + floatField);
        System.out.println("doubleField: " + doubleField);
        System.out.println("charField: " + charField);
        System.out.println("booleanField: " + booleanField);
        System.out.println("stringField: " + stringField);
    }

    public static void main(String[] args) {
        PrimitiveTypeClass demo = new PrimitiveTypeClass();
        demo.displayDefaultValues();
    }
}
