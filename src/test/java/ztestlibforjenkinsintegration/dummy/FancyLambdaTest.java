package ztestlibforjenkinsintegration.dummy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FancyLambdaTest {

	@Test
	void test() {
		assertEquals(".blah", FancyLambda.withPrefix("").apply("blah"));
		assertEquals("myprefix.blah2", FancyLambda.withPrefix("myprefix").apply("blah2"));
	}

}
