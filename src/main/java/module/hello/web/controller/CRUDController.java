package module.hello.web.controller;

import module.hello.model.AuthUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author rumman
 * @since 10/9/18
 */
@Controller
public class CRUDController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CRUDController.class);

    @GetMapping(value = "/show")
    public String show(ModelMap modelMap) {
        LOGGER.debug("CRUDController::show()");

        modelMap.put("authUser", new AuthUser());

        return "show";
    }

    @PostMapping(value = "/save")
    public String save(@ModelAttribute AuthUser authUser) {
        LOGGER.debug("CRUDController::save()");

        LOGGER.debug("username:: {}", authUser.getUsername());
        LOGGER.debug("address:: {}",authUser.getAddress());

        return "redirect:/?username=" + authUser.getUsername() + "&address=" + authUser.getAddress();
    }
}
