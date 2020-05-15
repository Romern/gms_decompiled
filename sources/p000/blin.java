package p000;

/* renamed from: blin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blin extends IllegalStateException {
    public blin(String str) {
        super(m107202a(null, str));
    }

    /* renamed from: a */
    private static String m107202a(String str, String str2) {
        String str3 = str != null ? str.length() == 0 ? new String(": ") : ": ".concat(str) : "";
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 131 + String.valueOf(str3).length());
        sb.append("Starting new trace ");
        sb.append(str2);
        sb.append(" when already associated with a trace");
        sb.append(str3);
        sb.append(". For more help, see http://go/tiktok-tracing#fixing-duplicate-trace-issues");
        return sb.toString();
    }

    public blin(String str, String str2, Throwable th) {
        super(m107202a(str, str2), th);
    }
}
