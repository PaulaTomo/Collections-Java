package advanced.exceptions;

import advanced.exceptions.enums.ErrorType;
import lombok.Getter;

public class BusinessException extends RuntimeException {

    private @Getter ErrorType errorType;

    public BusinessException(String message, ErrorType errorType) {
        super(message);
        this.errorType = errorType;


    }
}
