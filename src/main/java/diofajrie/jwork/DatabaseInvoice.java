package diofajrie.jwork;
import java.util.ArrayList;
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (Dio Fajrie Fadlullah)
 * @version (22.04.2021)
 */
public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException{
        Invoice result = null;
        for (Invoice invoice : INVOICE_DATABASE){
            if (id == invoice.getId()){
                result = invoice;
            } else {
                result = null;
            }
        }
        if (result == null){
            throw new InvoiceNotFoundException(id);
        }
        return result;
    }

    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerid){
        ArrayList<Invoice> temp = new ArrayList<Invoice>();
        for (int i = 0; i < INVOICE_DATABASE.size(); i++){
            if (jobseekerid == INVOICE_DATABASE.get(i).getJobseeker().getId()){
                temp.add(INVOICE_DATABASE.get(i));
            }
        }
        return temp;
    }

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException {
        for (Invoice invoices : INVOICE_DATABASE) {
            if (invoices.getInvoiceStatus() == InvoiceStatus.Ongoing) {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus) {
        boolean temp = true;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()){
                invoice.setInvoiceStatus(InvoiceStatus.Ongoing);
                temp =true;
            }else {
                temp = false;
            }
        }
        return temp;
    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException {
        boolean temp = false;
        for (Invoice invoice: INVOICE_DATABASE){
            if (id == invoice.getId()){
                INVOICE_DATABASE.remove(id);
                temp = true;
                break;
            }
        }
        if (!temp){
            throw new InvoiceNotFoundException(id);
        }
        return temp;
    }

}