package ztestlibforjenkinsintegration.dummy;

import java.util.function.Function;

public class FancyLambda {
	private FancyLambda() {	}
	static {
		new FancyLambda();
	}
	
	public static Function<String, String> withPrefix(String prefix) {
		var dot= ".";
		return (s -> prefix + dot + s);
	}
}
