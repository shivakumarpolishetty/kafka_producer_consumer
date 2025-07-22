package last.one.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import last.one.Entity.Data;

@Service
public class Consumer {

       @Autowired
       private Dmethod dbmethod;
       //no method or an object need to call this it atomaticaly called by kafka
    @KafkaListener(topics = "apple",groupId = "three")
    public void listen(String message)
    {
        Data data= new Data();
        data.setMessage(message);
        dbmethod.addtodb(data);



    }


}
