package fete.bird.infrastructure.startup;

import fete.bird.incoming.IStartUpInPort;
import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.context.event.StartupEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;

@Singleton
public class StartUp implements ApplicationEventListener<StartupEvent> {
    private static final Logger log = LoggerFactory.getLogger(StartUp.class);
    private final IStartUpInPort iStartUpInPort;

    public StartUp(IStartUpInPort iStartUpInPort) {
        this.iStartUpInPort = iStartUpInPort;
    }

    @Override
    public void onApplicationEvent(StartupEvent event) {
        this.iStartUpInPort.createIndex();
    }
}
