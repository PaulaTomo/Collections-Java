package advanced.exceptions;

import advanced.exceptions.enums.InvalidType;


public class ValidationException extends RuntimeException {

    private final int statusCode;

    public ValidationException(InvalidType invalidType){
        super(invalidType.getMessage());
        this.statusCode = invalidType.getHttpStatusCode();
        System.out.printf("%s with status code %s", this.getMessage(),this.statusCode);
    }
}
