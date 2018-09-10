package module.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rumman
 * @since 9/10/18
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "index";
    }
}
