package sample;

public class SimpleMessageProvider implements MessageProvider {
	@Override
	public String getMessage() {
		return "Hello";
	}
}
