package p000;

/* renamed from: cijw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cijw implements brer {
    QUICPAY_JSON_ERROR,
    QUICPAY_DELETE_URL_ARGUMENT_ERROR,
    QUICPAY_DELETE_ERROR,
    QUICPAY_UNFORMATTED_ERROR,
    QUICPAY_ENABLE_ERROR,
    QUICPAY_UNKNOWN_ERROR;
    

    /* renamed from: g */
    public String f190481g;

    /* renamed from: h */
    public brer f190482h;

    /* renamed from: i */
    public String f190483i;

    /* renamed from: a */
    public final String mo49933a() {
        return name();
    }

    /* renamed from: b */
    public final String mo49934b() {
        return this.f190481g;
    }

    public final String toString() {
        String str;
        brer brer = this.f190482h;
        if (brer != null) {
            str = brer.mo49933a();
        } else {
            str = null;
        }
        String name = name();
        String str2 = this.f190481g;
        String str3 = this.f190483i;
        int length = String.valueOf(name).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 52 + length2 + String.valueOf(str).length() + String.valueOf(str3).length());
        sb.append("QuicPayError{code='");
        sb.append(name);
        sb.append("'message='");
        sb.append(str2);
        sb.append("', rootError=");
        sb.append(str);
        sb.append("', cid='");
        sb.append(str3);
        sb.append("'}");
        return sb.toString();
    }
}
