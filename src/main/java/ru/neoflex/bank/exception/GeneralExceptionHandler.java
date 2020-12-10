package ru.neoflex.bank.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.neoflex.bank.exception.model.GeneralException;

@RestControllerAdvice
@Slf4j
public class GeneralExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public GeneralException exceptionHandler(Exception e) {
        log.error(e.getMessage(), e);
        return new GeneralException(e.toString());
    }
}
