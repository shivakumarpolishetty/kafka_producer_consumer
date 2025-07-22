package last.one.Controller;

import last.one.Entity.Data;
import last.one.Service.Consumer;
import last.one.Service.Dmethod;
import last.one.Service.Producer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {


    private final  Consumer consumer;
    private final Producer producer;
    private final Dmethod dmethod;


    public HomeController(Consumer consumer,Producer producer,Dmethod dmethod)
    {
        this.consumer= consumer;
        this.producer= producer;
        this.dmethod= dmethod;

    }

    @GetMapping("/")
    public String showmessages(Model model)
    {
        List<Data> allMessages = dmethod.getallfromdb();
        model.addAttribute("messages",allMessages);
        return "home";


    }



    @PostMapping("/sendmessage")
    public String  handleMessageForm(@RequestParam("message") String message)
    {

         producer.sendtoKT(message);

         return "redirect:/";



    }



}
