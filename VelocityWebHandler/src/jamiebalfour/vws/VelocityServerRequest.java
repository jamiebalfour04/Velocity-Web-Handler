package jamiebalfour.vws;

import java.util.HashMap;
import java.util.Map;

public class VelocityServerRequest {
  final String file;
  final String requestType;
  final String query_string;
  final String post_string;
  final String remote_address;
  final String serverMajorVersion;
  final String serverMinorVersion;
  final Map<String, String> headers;
  final Map<String, String> cookies;
  final boolean sessionExists;
  final private jamiebalfour.velocity.session.VelocitySession session;

  public VelocityServerRequest(String file, String requestType, String query_string, String post_string, String remote_address, String serverMajorVersion, String serverMinorVersion, Map<String, String> headers, jamiebalfour.velocity.session.VelocitySession session, Map<String, String> cookies, boolean sessionExists) {
    this.file = file;
    this.requestType = requestType;
    this.query_string = query_string;
    this.post_string = post_string;
    this.remote_address = remote_address;
    this.serverMajorVersion = serverMajorVersion;
    this.serverMinorVersion = serverMinorVersion;
    this.headers = headers;
    this.session = session;
    this.cookies = cookies;
    this.sessionExists = sessionExists;
  }

  public String getFile() {
    return file;
  }

  public String getRequestType() {
    return requestType;
  }

  public String getQueryString() {
    return query_string;
  }

  public String getPOSTString() {
    return post_string;
  }

  public String getRemoteAddress() {
    return remote_address;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public String getServerMajorVersion() {
    return serverMajorVersion;
  }

  public String getServerMinorVersion() {
    return serverMinorVersion;
  }

  public jamiebalfour.velocity.session.VelocitySession getSession() {
    return session;
  }

  public Map<String, String> getCookies(){
    return cookies;
  }

  public boolean sessionExists(){
    return sessionExists;
  }
}

