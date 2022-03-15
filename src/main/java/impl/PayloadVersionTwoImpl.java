package impl;

import dto.PayloadVersionTwoDTO;

public class PayloadVersionTwoImpl implements Payload {


    public PayloadVersionTwoDTO getPayload(){

        return new PayloadVersionTwoDTO("Alejandro ","Delgadillo ","adelgadillo@gmail.com ","Cra 9 F # 49 ","San cayetano ");
    }
}
