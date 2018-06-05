package builder;

/**
 *
 * @author USER-PC
 */
public class InvalidValidation extends Exception {

    private String informationRequired;

    public InvalidValidation(String informationRequired) {
        this.informationRequired = informationRequired;
    }

    public String getInformationRequired() {
        return informationRequired;
    }

}
