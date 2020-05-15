package p000;

/* renamed from: atgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum atgv implements brer {
    APTEST_JSON_ERROR,
    APTEST_DELETE_URL_ARGUMENT_ERROR,
    APTEST_DELETE_ERROR,
    APTEST_UNFORMATTED_ERROR,
    APTEST_ENABLE_ERROR,
    APTEST_UNKNOWN_ERROR;

    /* renamed from: a */
    public final String mo49933a() {
        return name();
    }

    /* renamed from: b */
    public final String mo49934b() {
        return name();
    }

    public final String toString() {
        String name = name();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 20);
        sb.append("ApTestError{code='");
        sb.append(name);
        sb.append("'}");
        return sb.toString();
    }
}
