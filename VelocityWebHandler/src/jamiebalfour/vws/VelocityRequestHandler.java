package jamiebalfour.vws;

import jamiebalfour.velocity.core.VelocityWebServer;

import java.io.OutputStream;

import java.util.Map;

/**
 * VWS handles a request by examining the headers sent across. If the header requests
 * say a PHP file, the PHP VelocityRequestHandler is called upon. This interface
 * specifies how it should do this.
 */
public interface VelocityRequestHandler {

  VelocityHandlerData handle(VelocityServerRequest r, Map<String, String> mainProperties, String documentRoot, VelocityWebServer owner);

  String[] getExtensions();

  boolean load(Map<String, String> mainProperties);

  default boolean supportsStreaming() {
    return false;
  }

  default boolean handleStreaming(VelocityServerRequest r, Map<String, String> mainProperties, String documentRoot, VelocityWebServer owner, OutputStream out, boolean keepAlive) {
    return false;
  }



}