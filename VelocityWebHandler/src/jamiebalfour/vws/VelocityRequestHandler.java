package jamiebalfour.vws;

import java.util.Map;

/**
 * VWS handles a request by examining the headers sent across. If the header requests
 * say a PHP file, the PHP VelocityRequestHandler is called upon. This interface
 * specifies how it should do this.
 */
public interface VelocityRequestHandler {

  VelocityHandlerData handle(VelocityServerRequest r, Map<String, String> mainProperties, String documentRoot, Object server);

  String[] getExtensions();

}