package jamiebalfour.velocity;

/**
 * VWS handles a request by examining the headers sent across. If the header requests
 * say a PHP file, the PHP VelocityRequestHandler is called upon. This interface
 * specifies how it should do this.
 */
public interface VelocityRequestHandler {

  VelocityHandlerData handle(VelocityServerResponse r, String documentRoot, Object server);

  String getExtension();
}