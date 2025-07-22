package last.one.Service;

import last.one.DAO.kafkarepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import last.one.Entity.Data;

import java.util.List;

@Service
public class Dmethod implements Dservice {

    @Autowired
    private kafkarepository krepo;
    @Override
    public void addtodb(Data data)
    {

        krepo.save(data);

    }

    public List<Data> getallfromdb()
    {
        return krepo.findAll();
    }

}
