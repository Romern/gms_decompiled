package p000;

/* renamed from: csx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum csx implements csz {
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
    APP_VERSION_NUMBER_CARD("9f08");
    

    /* renamed from: N */
    private final byte[] f11993N;

    private csx(String str) {
        this.f11993N = czm.m8012a(str);
    }

    /* renamed from: a */
    public final csy mo8238a(String str) {
        return new csy(this, czm.m8012a(str));
    }

    /* renamed from: b */
    public final csy mo8232a(byte... bArr) {
        return new csy(this, bArr);
    }

    /* renamed from: a */
    public final ctf mo8233a(int i) {
        return new ctf(this, i);
    }

    /* renamed from: a */
    public final byte[] mo8234a() {
        return (byte[]) this.f11993N.clone();
    }
}
