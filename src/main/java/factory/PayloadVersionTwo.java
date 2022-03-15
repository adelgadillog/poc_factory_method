package factory;


import impl.Payload;
import impl.PayloadVersionTwoImpl;

public class PayloadVersionTwo extends PayloadAbstract {
    @Override
    public Payload payload() {
        return new PayloadVersionTwoImpl();
    }
}
