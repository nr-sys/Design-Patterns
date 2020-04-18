package designpatterns.proxy;

public class ProxyTwitterService implements TwitterService {
	private static TwitterServiceImpl twitterServiceImpl;
	
	@Override
	public void sendRequest(Method method, String payload) {
		if (method == Method.DELETE) {
			System.out.println("*** DELETE messages are not allowed ***");
			return;
		}
			
		if (twitterServiceImpl == null) {
			twitterServiceImpl = new TwitterServiceImpl();
		}
		
		twitterServiceImpl.sendRequest(method, payload);
	}
}
