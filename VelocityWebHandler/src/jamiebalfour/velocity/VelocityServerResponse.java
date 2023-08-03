package jamiebalfour.velocity;

import java.util.Map;

public class VelocityServerResponse {
	String file = "";
	String requestType = "";
	String query_string = "";
	String post_string = "";
	String remote_address = "";
	double serverMajorVersion = 1.0;
	double serverMinorVersion = 1.0;
	Map<String, String> headers;
		
	
	public void setFile(String f) {
		file = f;
	}
	
	public String getFile() {
		return file;
	}
	
	public void setRequestType(String t) {
		requestType = t;
	}
	
	public String getRequestType() {		
		return requestType;
	}
	
	public void setQueryString(String q) {
		query_string = q;
	}
	
	public String getQueryString() {
		return query_string;
	}
	
	public void setPOSTString(String p) {
		post_string = p;
	}
	
	public String getPOSTString() {
		return post_string;
	}
	
	public void setRemoteAddress(String r) {
		remote_address = r;
	}
	
	public String getRemoteAddress() {
		return remote_address;
	}
		
	public void setHeaders(Map<String, String> h){
		headers = h;
	}
	
	public Map<String, String> getHeaders(){
		return headers;
	}
	
	public void setServerMajorVersion(double v) {
		serverMajorVersion = v;
	}
	
	public double getServerMajorVersion() {
		return serverMajorVersion;
	}
	
	public void setServerMinorVersion(double v) {
		serverMinorVersion = v;
	}
	
	public double getServerMinorVersion() {
		return serverMinorVersion;
	}
}

