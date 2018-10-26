package module.export.controller;

import module.export.util.EXPORT_CONSTANT;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static module.export.util.EXPORT_CONSTANT.*;

/**
 * @author rumman
 * @since 10/21/18
 */
@Controller
@RequestMapping("/excel-test")
public class ExcelController {

    @GetMapping
    public String excelDownload(ModelMap model) {

        model.put(FILE_NAME.getValue(), "requestTracker.xls");
        model.put(WORKBOOK_SHEETNAME.getValue(), "Request Trace");

        return "excelView";
    }
}
