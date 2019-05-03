package midterm2_mingi.org.jdbc;

public class DuplicateMemberException extends RuntimeException {
	public DuplicateMemberException() {
	}
	
	public DuplicateMemberException(String message) {
		super(message);
	}
	
	public DuplicateMemberException(Throwable cause) {
		super(cause);
	}
	
	public DuplicateMemberException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public DuplicateMemberException(String message, Throwable cause,
				boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression,writableStackTrace);
	}
}
