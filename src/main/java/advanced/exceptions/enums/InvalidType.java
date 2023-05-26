package advanced.exceptions.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum InvalidType {

    PASSWORD_MANDATORY("Password is mandatory!",401),
    PASSWORD_INVALID_LENGTH("The password must have more than 6 characters length!",401);

    @Getter
    private final String message;

    @Getter
    private final int httpStatusCode;
}

