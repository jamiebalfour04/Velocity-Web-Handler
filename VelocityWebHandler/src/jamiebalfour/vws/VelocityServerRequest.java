package jamiebalfour.vws;

import java.util.HashMap;
import java.util.Map;

public class VelocityServerRequest {
  final String file;
  final String requestType;
  final String query_string;
  final String post_string;
  final String remote_address;
  final Map<String, String> headers;
  final Map<String, String> cookies;

  public VelocityServerRequest(String file, String requestType, String query_string, String post_string, String remote_address, Map<String, String> headers, Map<String, String> cookies) {
    this.file = file;
    this.requestType = requestType;
    this.query_string = query_string;
    this.post_string = post_string;
    this.remote_address = remote_address;
    this.headers = headers;
    this.cookies = cookies;
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

  public Map<String, String> getCookies(){
    return cookies;
  }
}

