package p000;

/* renamed from: btu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btu {
    APPLICATION_BLOCKED(1001, "Application Blocked."),
    ATC_LIMIT_REACHED(1002, "ATC limit reached."),
    RISK_ANALYSIS_FAILED(1003, "Risk Analysis Failed."),
    DATA_ELEMENT_MISSING(1004, "Mandatory data element missing."),
    WRONG_CVN(1005, "Wrong CVN provided."),
    UNKNOWN_ERROR(1006, "Unknown Error."),
    TRANSACTION_NOT_SUPPORTED(1007, "Transaction not supported.");
    

    /* renamed from: h */
    public final String f5588h;

    /* renamed from: i */
    private final int f5589i;

    private btu(int i, String str) {
        this.f5589i = i;
        this.f5588h = str;
    }

    public final String toString() {
        int i = this.f5589i;
        String str = this.f5588h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }
}
