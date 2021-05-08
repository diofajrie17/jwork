public class OngoingInvoiceAlreadyExistsException extends Exception{
    private int invoice_error;

    public OngoingInvoiceAlreadyExistsException(int invoice_input) {
        super("Recruiter Id: ");
        invoice_error = invoice_input;
    }

    public String getMessage() {
        return super.getMessage() + invoice_error + "Not FOund";
    }
}