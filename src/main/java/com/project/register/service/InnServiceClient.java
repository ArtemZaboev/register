package com.project.register.service;

import com.project.register.model.Individual;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import ru.gosuslugi.smev.rev111111.*;
import unisoft.ws.innfiodr.get.rq.Документ;

@Service
public class InnServiceClient extends WebServiceGatewaySupport {


        public GetResponseType queryINNFLFIODR(){
                unisoft.ws.innfiodr.query.rq.Документ d2=new unisoft.ws.innfiodr.query.rq.Документ();
                unisoft.ws.innfiodr.query.rq.Документ.СвФЛ a=new unisoft.ws.innfiodr.query.rq.Документ.СвФЛ();
                a.setИмя("Борис");
                a.setФамилия("Борисов");
                a.setОтчество("Борисович");
                a.setДатаРожд("06.11.2000");
                d2.setСвФЛ(a);

                return (GetResponseType) getWebServiceTemplate().
                        marshalSendAndReceive(d2);

        }


}
