package soa.eip;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Router extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:search")
				.to("twitter://search?consumerKey=WAyH59ZA6u8veZOSmVKNY6fw7&"
						+ "consumerSecret=sfrllZuKYaJvqnGcx5lpByClX6GdTpUQzPB7xsFPIWcpPEJxyk&"
						+ "accessToken=226600581-QhpUZBsWr6zuPrJef2ylm7FvNOEZ5JqNZ1ZOHzKJ&"
						+ "accessTokenSecret=W2RNzsfvOye8C5Soz5eJYvgDYBpNTNL1J2PAyi71lzqyS");
	}
}
