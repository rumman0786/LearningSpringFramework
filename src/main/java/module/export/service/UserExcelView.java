package module.export.service;

import module.export.util.ExportUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

import static module.export.util.EXPORT_CONSTANT.FILE_NAME;
import static module.export.util.EXPORT_CONSTANT.WORKBOOK_SHEETNAME;

/**
 * @author rumman
 * @since 10/21/18
 */
public class UserExcelView extends AbstractXlsView {

    @Override
    protected void buildExcelDocument(Map<String, Object> model,
                                      Workbook workbook,
                                      HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {

        Sheet sheet = workbook.createSheet(model.get(WORKBOOK_SHEETNAME.getValue()).toString());
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

        String fileName = model.get(FILE_NAME.getValue()).toString();

        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, ExportUtils.getAttachmentWithFileName(fileName));
    }
}
