package module.export.service;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author rumman
 * @since 10/21/18
 */
public class UserExcelView extends AbstractXlsView {

    @Override
    protected void buildExcelDocument(Map<String, Object> model,
                                      org.apache.poi.ss.usermodel.Workbook workbook,
                                      HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {

        //create a wordsheet
        Sheet sheet = workbook.createSheet("User Report");
        sheet.setFitToPage(true);

        int rowCount = 0;
        Row header = sheet.createRow(rowCount++);
        header.createCell(0).setCellValue("Currency Pair");
        header.createCell(1).setCellValue("Bid Price");
        header.createCell(2).setCellValue("Ask Price");
        header.createCell(3).setCellValue("Date");


        rowCount += 1;

        Row body = sheet.createRow(rowCount++);
        body.createCell(0).setCellValue("Dummy" + rowCount);
        body.createCell(1).setCellValue("Dummy" + rowCount);
        body.createCell(2).setCellValue("Dummy" + rowCount);
        body.createCell(3).setCellValue("Dummy" + rowCount);

        response.setHeader("Content-Disposition", "attachment; filename=forex-rates.xls");
    }
}
