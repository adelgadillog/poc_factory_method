package factory;

import impl.*;

public class PayloadVersionOne extends PayloadAbstract{
    @Override
    public Payload payload() {
        return new PayloadVersionOneImpl();
    }
}
