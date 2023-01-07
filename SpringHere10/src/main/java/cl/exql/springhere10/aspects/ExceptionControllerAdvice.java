package cl.exql.springhere10.aspects;

import cl.exql.springhere10.exceptions.NotEnoughMoneyException;
import cl.exql.springhere10.models.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not enough movey to make the payment.");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }

}
