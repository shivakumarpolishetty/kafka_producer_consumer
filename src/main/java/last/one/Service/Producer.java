package last.one.Service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class Producer {

    private final KafkaTemplate<String,String>KT;

    public Producer(KafkaTemplate<String,String> KT)
    {
        this.KT = KT;
    }

    public String sendtoKT( String message)
    {
        KT.send("apple",message);

        return "send to kafka success fully";
    }


}
