package productionline;

/**
 * Step 2 - ItemType enum
 * Stores pre-defined item types with their codes.
 */
public enum ItemType {
    Audio("AU"),
    Visual("VI"),
    AudioMobile("AM"),
    VisualMobile("VM");

    public final String code;

    ItemType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
