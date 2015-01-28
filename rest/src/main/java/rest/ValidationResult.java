package rest;

public class ValidationResult {

    private boolean valid;

    private String country;

    public ValidationResult(boolean valid, String country) {
        this.valid = valid;
        this.country = country;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
