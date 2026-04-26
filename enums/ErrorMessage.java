package enums;

public enum ErrorMessage {
    INVALID_BASE_COMMAND("InvalidBaseCommand");

    private String errorMessageKey;

    private ErrorMessage(String errorMessageKey) {
        this.errorMessageKey = errorMessageKey;
    }

    public String getErrorMessageKey() {
        return errorMessageKey;
    }
}