package module.export.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author rumman
 * @since 10/21/18
 */
@Controller
@RequestMapping
public class ExcelController {

    @RequestMapping("/excel-test")
    public ModelAndView excelDownload() {
        System.out.println("TEST");
        return new ModelAndView("excelView");
    }
}
