package designpatterns.proxy;

public class TwitterServiceImpl implements TwitterService {
	@Override
	public void sendRequest(Method method, String payload) {
		System.out.println("Sending " + method + " request to Twitter..");
	}
}
