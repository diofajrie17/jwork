package diofajrie.jwork;
public class JobSeekerNotFoundException extends Exception {
    private int jobseeker_error;

    public JobSeekerNotFoundException(int jobseeker_input) {
        super("Jobseeker ID: ");
        this.jobseeker_error = jobseeker_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + jobseeker_error + " not found";
    }

}
