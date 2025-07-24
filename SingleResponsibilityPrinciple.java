class SingleResponsibilityPrinciple {
    public void saveOrder(String orderId) {
        System.out.println("Order " + orderId + " saved to database.");
    }

    public static void main(String[] args) {
        SingleResponsibilityPrinciple order = new SingleResponsibilityPrinciple();
        order.saveOrder("ORD123");
    }
}
