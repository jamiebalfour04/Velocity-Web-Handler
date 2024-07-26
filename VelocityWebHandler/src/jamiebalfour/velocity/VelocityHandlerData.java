package jamiebalfour.velocity;

import java.util.Map;

/**
 * A simple class that is used to return a response to VWS.
 */
public class VelocityHandlerData {

  int status = 200;
  private Map<String, String> headers;
  private String content;


  public void setContent(String c) {
    this.content = c;
  }

  public String getContent() {
    return this.content;
  }

  public void setHeaders(Map<String, String> h) {
    this.headers = h;
  }

  public Map<String, String> getHeaders() {
    return this.headers;
  }

  public void setStatus(int s) {
    this.status = s;
  }

  public int getStatus() {
    return this.status;
  }
}
