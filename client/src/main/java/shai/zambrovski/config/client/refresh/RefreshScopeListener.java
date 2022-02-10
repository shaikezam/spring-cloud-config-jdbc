package shai.zambrovski.config.client.refresh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class RefreshScopeListener implements ApplicationListener<RefreshScopeRefreshedEvent> {

    @Autowired(required=false)
    private final List<IRefresher> refreshers = Collections.emptyList();

    @Override
    public void onApplicationEvent(RefreshScopeRefreshedEvent event) {
        refreshers.forEach(IRefresher::materializeAfterRefresh);
    }
}