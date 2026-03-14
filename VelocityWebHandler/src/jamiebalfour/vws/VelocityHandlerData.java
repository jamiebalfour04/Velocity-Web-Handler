package jamiebalfour.vws;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * A simple class that is used to return a response to VWS.
 */
public class VelocityHandlerData {

  private int status = 200;

  private List<Header> headers = new ArrayList<>();
  private Map<String, String> cookies;
  private Map<String, Object> session;

  private String content;

  public void setContent(String c) {
    this.content = c;
  }

  public String getContent() {
    return this.content;
  }

  /* ---------------- Headers ---------------- */

  public void addHeader(String name, String value) {
    headers.add(new Header(name, value));
  }

  public void setHeaders(List<Header> headers) {
    this.headers = headers;
  }

  public List<Header> getHeaders() {
    return headers;
  }

  /* ---------------- Cookies ---------------- */

  public void setCookies(Map<String, String> cookies) {
    this.cookies = cookies;
  }

  public Map<String, String> getCookies() {
    return this.cookies;
  }

  /* ---------------- Session ---------------- */

  public void setSession(Map<String, Object> session) {
    this.session = session;
  }

  public Map<String, Object> getSession() {
    return this.session;
  }

  /* ---------------- Status ---------------- */

  public void setStatus(int s) {
    this.status = s;
  }

  public int getStatus() {
    return this.status;
  }

  /* ---------------- Header Pair ---------------- */

  public static class Header {
    private final String name;
    private final String value;

    public Header(String name, String value) {
      this.name = name;
      this.value = value;
    }

    public String getName() {
      return name;
    }

    public String getValue() {
      return value;
    }
  }
}