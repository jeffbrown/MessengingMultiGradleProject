package fete.bird;

import fete.bird.incoming.IStartUpInPort;
import fete.bird.outgoing.IStartUpOutPort;

import javax.inject.Singleton;

@Singleton
public record StartUpService(IStartUpOutPort iStartUpOutPort) implements IStartUpInPort {
    @Override
    public void createIndex() {
        iStartUpOutPort.createIndex();
    }
}
