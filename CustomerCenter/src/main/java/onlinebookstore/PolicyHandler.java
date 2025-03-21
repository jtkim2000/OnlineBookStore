package onlinebookstore;

import onlinebookstore.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverBookRegistred_NoticeNewBook(@Payload BookRegistred bookRegistred){

        if(!bookRegistred.validate()) return;

        System.out.println("\n\n##### listener NoticeNewBook : " + bookRegistred.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverStockeIncreased_NoticeReStock(@Payload StockeIncreased stockeIncreased){

        if(!stockeIncreased.validate()) return;

        System.out.println("\n\n##### listener NoticeReStock : " + stockeIncreased.toJson() + "\n\n");

        // Sample Logic //
            
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
