package p000;

/* renamed from: cuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cuu implements cuv {
    SUCCESS("9000", cxc.TEAR),
    APPLICATION_BLOCKED("6283", cxc.CARD_NOT_SUPPORTED),
    WRONG_LENGTH("6700", cxc.PROTOCOL_FAILURE),
    WRONG_MISSING_OR_INVALID_DATA_80("6a80", cxc.PROTOCOL_FAILURE),
    WRONG_MISSING_OR_INVALID_DATA_81("6a81", cxc.PROTOCOL_FAILURE),
    FILE_OR_APP_NOT_FOUND("6a82", cxc.PROTOCOL_FAILURE),
    RECORD_NOT_FOUND("6a83", cxc.PROTOCOL_FAILURE),
    INCORRECT_PARAMETERS_P1_P2("6a86", cxc.PROTOCOL_FAILURE),
    REFERENCED_DATA_NOT_FOUND("6a88", cxc.UNKNOWN),
    INSTRUCTION_CODE_NOT_SUPPORTED_OR_INVALID("6d00", cxc.PROTOCOL_FAILURE),
    CLASS_NOT_SUPPORTED("6e00", cxc.PROTOCOL_FAILURE),
    UNKNOWN_ERROR_RESPONSE("6f00", cxc.UNKNOWN),
    SECURITY_STATUS_NOT_SATISFIED("6982", cxc.PROTOCOL_FAILURE),
    CONDITIONS_OF_USE_NOT_SATISFIED("6985", cxc.PROTOCOL_FAILURE),
    COMMAND_NOT_ALLOWED("6986", cxc.UNLOCK_REQUIRED);
    

    /* renamed from: p */
    public final cxc f12094p;

    /* renamed from: q */
    private final byte[] f12095q;

    private cuu(String str, cxc cxc) {
        this.f12095q = cvz.m7720b(str);
        this.f12094p = cxc;
    }

    /* renamed from: a */
    public final void mo8315a(boolean z) {
        if (z) {
            throw new cvl(this);
        }
    }

    /* renamed from: b */
    public final cxc mo8313b() {
        return this.f12094p;
    }

    /* renamed from: a */
    public final void mo8316a(boolean z, String str) {
        if (z) {
            throw new cvl(str, this);
        }
    }

    /* renamed from: a */
    public final byte[] mo8312a() {
        return cvz.m7735j(this.f12095q);
    }
}
