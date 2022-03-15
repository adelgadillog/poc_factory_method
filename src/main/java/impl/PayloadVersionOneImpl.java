package impl;

import dto.PayloadVersionOneDTO;

public class PayloadVersionOneImpl implements Payload {


    public PayloadVersionOneDTO getPayload(){

        return new PayloadVersionOneDTO("Alejandro ","Delgadillo ","adelgadillo@gmail.com ");
    }


}
