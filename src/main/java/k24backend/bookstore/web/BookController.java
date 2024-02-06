package k24backend.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    
    @RequestMapping("/main")
    public String main() {
        return "main";
    }


}
