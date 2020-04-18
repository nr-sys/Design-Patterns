package designpatterns.proxy;

public class ProxyDemo {
	public static void main(String[] args) {
		TwitterService twitterService = new ProxyTwitterService();
		
		twitterService.sendRequest(Method.POST, "Hello");
		twitterService.sendRequest(Method.DELETE, "Hello");
	}
}
