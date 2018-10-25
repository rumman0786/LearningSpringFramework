package module.export.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rumman
 * @since 10/21/18
 */
@Controller
@RequestMapping("/excel-test")
public class ExcelController {

    @GetMapping
    public String excelDownload() {
        return "excelView";
    }
}
