package responsibilitychain;

public class ViceSchoolMasterApprover extends Approver {

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() <= 20000) {
            System.out.println("price is: " + request.getPrice() + " approved by " + this.getName());
        } else {
            this.getApprover().processRequest(request);
        }
    }
}
