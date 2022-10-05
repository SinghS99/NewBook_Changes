package Com.Book.Exception;

import java.time.LocalDate;

public class ErrorResponse {
	
	private LocalDate timeStamps;
	 private String  message;
	    private String details;
	    
		public ErrorResponse() {
			super();
		}
		public ErrorResponse(LocalDate timeStamps, String message, String details) {
			super();
			this.timeStamps = timeStamps;
			this.message = message;
			this.details = details;
		}
		public LocalDate getTimeStamps() {
			return timeStamps;
		}
		public void setTimeStamps(LocalDate timeStamps) {
			this.timeStamps = timeStamps;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getDetails() {
			return details;
		}
		public void setDetails(String details) {
			this.details = details;
		}
		@Override
		public String toString() {
			return "ErrorResponse [timeStamps=" + timeStamps + ", message=" + message + ", details=" + details + "]";
		}
	 
	   
}
