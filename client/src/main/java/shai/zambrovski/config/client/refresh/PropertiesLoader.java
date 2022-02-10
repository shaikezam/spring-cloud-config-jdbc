package shai.zambrovski.config.client.refresh;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:client.properties")
public class PropertiesLoader {
}