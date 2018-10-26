package module.export.util;

/**
 * @author rumman
 * @since 10/26/18
 */
public enum EXPORT_CONSTANT {

    FILE_NAME("fileName"),
    WORKBOOK_SHEETNAME("sheetName");

    private final String value;

    EXPORT_CONSTANT(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
