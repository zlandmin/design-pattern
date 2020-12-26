package responsibilitychain;

public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() <= 5000) {
            System.out.println("price is: " + request.getPrice() + " approved by " + this.getName());
        } else {
            this.getApprover().processRequest(request);
        }
    }
}
