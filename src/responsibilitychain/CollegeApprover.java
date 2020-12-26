package responsibilitychain;

public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() <= 10000) {
            System.out.println("price is: " + request.getPrice() + " approved by " + this.getName());
        } else {
            this.getApprover().processRequest(request);
        }
    }
}
