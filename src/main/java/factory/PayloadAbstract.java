package factory;

import impl.Payload;

public abstract class PayloadAbstract {

    public Object getPayload(){
        Payload payload = payload();
        return payload.getPayload();
    }

    public abstract Payload payload();
}
