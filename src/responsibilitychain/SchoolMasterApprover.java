package responsibilitychain;

public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() <= 30000) {
            System.out.println("price is: " + request.getPrice() + " approved by " + this.getName());
        } else {
            this.getApprover().processRequest(request);
        }
    }
}
