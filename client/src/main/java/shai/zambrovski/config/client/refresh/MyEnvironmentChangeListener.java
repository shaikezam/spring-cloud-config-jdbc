package shai.zambrovski.config.client.refresh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class MyEnvironmentChangeListener implements ApplicationListener<EnvironmentChangeEvent> {

    @Autowired
    private Environment env;

    @Override
    public void onApplicationEvent(EnvironmentChangeEvent event) {
        Set<String> keys = event.getKeys();
        for(String key: keys) {
            String newValue = env.getProperty(key);
            int i = 1;
        }
    }
}
