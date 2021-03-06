package reactive_nosql;

public interface NoSQLCommand {
	
	public NoSQLDatabase execute(NoSQLDatabase db);	
	
	public void rollback(NoSQLDatabase db);
	
	public String getName();

		
}
