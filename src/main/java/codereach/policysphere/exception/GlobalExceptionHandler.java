package codereach.policysphere.exception;


import codereach.policysphere.dto.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFound.class)
    public ResponseEntity<ErrorResponse>(UserNotFound e){
             ErrorResponse error  = new ErrorResponse();

             error.setMsg(e.getMessage());
             error.setStatusCode(404);



    }
}
