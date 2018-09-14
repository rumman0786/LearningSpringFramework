package module.hello.web.controller;

import module.hello.model.AuthUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author rumman
 * @since 9/10/18
 */
@Controller
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping(value = "/")
    public String hello(@ModelAttribute AuthUser authUser) {
        LOGGER.debug("hello()");

        return "index";
    }

    @GetMapping(value = "/xml")
    public @ResponseBody AuthUser getUserXml() {
        LOGGER.debug("userXml()");

        AuthUser authUser = new AuthUser();
        authUser.setUsername("rumman");
        authUser.setAddress("dhaka");

        return authUser;
    }

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody AuthUser getUserJSON() {
        LOGGER.debug("getUserJSON()");

        AuthUser authUser = new AuthUser();
        authUser.setUsername("rumman");
        authUser.setAddress("dhaka");

        return authUser;
    }
}
