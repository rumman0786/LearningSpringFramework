package module.export.util;

import org.springframework.util.StringUtils;

/**
 * @author rumman
 * @since 10/26/18
 */
public class ExportUtils {

    public static String getAttachmentWithFileName(String fileName) {

        return StringUtils.hasText(fileName)
                ? String.format("attachment; filename=%s", fileName)
                : "attachment";
    }
}
