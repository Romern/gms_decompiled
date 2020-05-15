package p000;

/* renamed from: css */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum css implements cst {
    SUCCESS("9000"),
    APPLICATION_BLOCKED("6283"),
    WRONG_LENGTH("6700"),
    WRONG_MISSING_OR_INVALID_DATA_80("6a80"),
    WRONG_MISSING_OR_INVALID_DATA_81("6a81"),
    FILE_OR_APP_NOT_FOUND("6a82"),
    RECORD_NOT_FOUND("6a83"),
    INCORRECT_PARAMETERS_P1_P2("6a86"),
    REFERENCED_DATA_NOT_FOUND("6a88"),
    INSTRUCTION_CODE_NOT_SUPPORTED_OR_INVALID("6d00"),
    CLASS_NOT_SUPPORTED("6e00"),
    UNKNOWN_ERROR_RESPONSE("6f00"),
    SECURITY_STATUS_NOT_SATISFIED("6982"),
    CONDITIONS_OF_USE_NOT_SATISFIED("6985");
    

    /* renamed from: o */
    private final byte[] f11942o;

    private css(String str) {
        this.f11942o = czm.m8012a(str);
    }

    /* renamed from: a */
    public final void mo8229a(boolean z) {
        if (z) {
            throw new ctu(this);
        }
    }

    /* renamed from: a */
    public final void mo8230a(boolean z, String str) {
        if (z) {
            throw new ctu(str, this);
        }
    }

    /* renamed from: a */
    public final byte[] mo8227a() {
        return czm.m8028e(this.f11942o);
    }
}
