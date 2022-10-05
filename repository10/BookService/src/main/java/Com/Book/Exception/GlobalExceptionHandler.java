package Com.Book.Exception;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<ErrorResponse>bookNotFoundException(BookNotFoundException ex){
//		String message=ex.getFieldName();
//		
//		ErrorResponse errorResponse= new ErrorResponse(timeStamps, message, details);
//		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
//	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object>handleAllException(Exception ex,WebRequest request){
		
		ErrorResponse errorResponse= new ErrorResponse(LocalDate.now(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<Object>(errorResponse,HttpStatus.NOT_FOUND);
	}
	
	
	
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public ResponseEntity<Map<String,String>> handleMethosArgsNotValidException(MethodArgumentNotValidException ex){
//		Map<String,String> response=new HashMap<>();
//		ex.getBindingResult().getAllErrors().forEach((error)->{
//			String fieldName=((FieldError)error).getField();
//			String message=error.getDefaultMessage();	
//			response.put(fieldName, message);
//			});
//		return new ResponseEntity<Map<String,String>>(response,HttpStatus.BAD_REQUEST);
//	}
}
