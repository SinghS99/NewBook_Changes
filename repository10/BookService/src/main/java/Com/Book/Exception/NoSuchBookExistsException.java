package Com.Book.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NoSuchBookExistsException extends RuntimeException {
 
    private String message;
 
    public NoSuchBookExistsException() {}
 
    public NoSuchBookExistsException(String msg)
    {
        super(msg);
        this.message = msg;
    }

}
