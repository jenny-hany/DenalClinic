public class PaymentMethod {
    private String methodType; // e.g., Cash, Credit Card, Insurance
    private float price;
    private float discount; // Discount percentage, e.g., 10 for 10%

    // Constructor
    public PaymentMethod(String methodType, float price, float discount) {
        this.methodType = methodType;
        this.price = price;
        this.discount = discount;
    }

    // Getters and Setters
    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    // Calculate final price after discount
    public float calculateFinalPrice() {
        return price - (price * (discount / 100));
    }

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "methodType='" + methodType + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", finalPrice=" + calculateFinalPrice() +
                '}';
    }
}