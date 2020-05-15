package p000;

/* renamed from: cuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cuz implements cvb {
    AID_CARD("4f"),
    APPLICATION_LABEL("50"),
    TRACK_1("56"),
    TRACK_2_EQV_DATA("57"),
    APPLICATION_INTERCHANGE_PROFILE("82"),
    COMMAND_TEMPLATE("83"),
    DEDICATED_FILE_NAME("84"),
    APPLICATION_PRIORITY_INDICATOR("87"),
    APPLICATION_FILE_LOCATOR("94"),
    KERNEL_IDENTIFIER("9f2a"),
    UNPREDICTABLE_NUMBER("9f37"),
    ADDITIONAL_TERMINAL_CAPABILITIES("9f40"),
    LOG_ENTRY("9f4d"),
    DISCOVER_APPLICATION_VERSION_NUMBER("9f7d"),
    DCVV("9f7e"),
    TERMINAL_TRANSACTION_QUALIFIERS("9f66"),
    AMOUNT_AUTHORISED_NUMERIC("9f02"),
    AMOUNT_OTHER_NUMERIC("9f03"),
    TERMINAL_COUNTRY_CODE("9f1a"),
    TRANSACTION_CURRENCY_CODE("5f2a"),
    LANGUAGE_PREFERENCE("5f2d"),
    TRANSACTION_DATE("9a"),
    TRANSACTION_TYPE("9c"),
    TERMINAL_TYPE("9f35"),
    CARD_NAME("df70"),
    ASI("df71"),
    CARD_PRODUCT_TYPE("df72"),
    CARD_PRODUCT_FUNCTIONS("df73"),
    APP_CRYPTOGRAM("9f26"),
    SIGNED_DYNAMIC_APPLICATION_DATA("9f4b"),
    APP_TRANSACTION_COUNTER("9f36"),
    ISSUER_APPLICATION_DATA("9f10"),
    APP_PREFERRED_NAME("9f12"),
    ISSUER_CODE_TABLE_INDEX("9f11"),
    CRYPTOGRAM_INFORMATION_DATA("9f27"),
    APP_USAGE_CONTROL("9f07"),
    ISSUER_COUNTRY_CODE("5f28"),
    PAN_SEQUENCE_NUMBER("5f34"),
    CARD_PROCESSING_REQUIREMENTS("9f71"),
    APP_EFFECTIVE_DATE("5f25"),
    APP_VERSION_NUMBER_CARD("9f08"),
    CONTACTLESS_ACCUMULATOR("DF40"),
    CONTACTLESS_COUNTER("DF43"),
    CUMULATIVE_OFFLINE_AMOUNT("CE"),
    CONSECUTIVE_OFFLINE_TRANSACTION("CD"),
    CVM_ACCUMULATOR("D4"),
    CVM_COUNTER("D9"),
    CRM_CURRENCY_CODE("D2"),
    SECONDARY_CURRENCY_1("C3"),
    SECONDARY_CURRENCY_2("C4"),
    CARDHOLDER_NAME("5f20"),
    TRACK_1_DISCRETIONARY_DATA("9f1f"),
    CVM_LIST("8e"),
    APPLICATION_DISCRETIONARY_DATA("9f05"),
    CHN_EXTENDED("9f0b"),
    APP_CURRENCY_EXPONENT("9f44"),
    APP_CURRENCY_CODE("9f42"),
    SERVICE_CODE("5f30"),
    ISSUER_CERTIFICATE("90"),
    IPK_EXPONENT("9F32"),
    IPK_REMAINDER("92"),
    AUTHORITY_PKI("8F"),
    ICC_PUBLIC_KEY_EXPONENT("9F47"),
    ICC_PUBLIC_KEY_REMAINDER("9F48"),
    DDOL("9F49"),
    CARD_A12N_DATA("9F69"),
    ICC_CERTIFICATE("9F46"),
    APP_EXP_DATE("5F24"),
    APP_PAN("5A"),
    PREVIOUS_TRANSACTION_HISTORY("CF");
    

    /* renamed from: as */
    private final byte[] f12177as;

    private cuz(String str) {
        this.f12177as = cvz.m7720b(str);
    }

    /* renamed from: a */
    public final cva mo8327a(String str) {
        if (str != null) {
            return new cva(this, cvz.m7720b(str));
        }
        return null;
    }

    /* renamed from: b */
    public final int mo8321b() {
        return cvz.m7731f(this.f12177as);
    }

    /* renamed from: b */
    public final cva mo8318a(byte... bArr) {
        if (bArr != null) {
            return new cva(this, bArr);
        }
        return null;
    }

    /* renamed from: a */
    public final cvh mo8319a(int i) {
        return new cvh(this, i);
    }

    /* renamed from: a */
    public final byte[] mo8320a() {
        return (byte[]) this.f12177as.clone();
    }
}
