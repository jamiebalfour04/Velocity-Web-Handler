package jamiebalfour.velocity;

public interface VelocityRequestHandler {
		
	VelocityHandlerData handle(VelocityServerResponse r, String documentRoot, Object server);
	String getExtension();
}