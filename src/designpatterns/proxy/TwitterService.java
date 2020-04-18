package designpatterns.proxy;

enum Method {
		POST,
		GET,
		DELETE
};

public interface TwitterService {
	public void sendRequest(Method method, String payload);
}
