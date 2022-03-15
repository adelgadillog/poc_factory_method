import dto.PayloadVersionOneDTO;
import dto.PayloadVersionTwoDTO;
import factory.PayloadVersionOne;
import factory.PayloadVersionTwo;

public class Handler {
    public static void main(String[] args) {
        PayloadVersionOneDTO payloadVersionOneDTO = (PayloadVersionOneDTO) getPayloadOne();
        PayloadVersionTwoDTO payloadVersionTwoDTO = (PayloadVersionTwoDTO) getPayloadTwo();

        System.out.println(payloadVersionOneDTO.toString() + payloadVersionTwoDTO.toString());

    }



    //@FeatureToogle
    static Object getPayloadOne (){
        return  new PayloadVersionOne().getPayload();
    }

    //@FeatureToogle
    static Object getPayloadTwo (){
        return  new PayloadVersionTwo().getPayload();
    }
}
