package p000;

/* renamed from: cihk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cihk {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: e */
    final String f190320e;

    private cihk(String str) {
        this.f190320e = str;
    }

    /* renamed from: a */
    public static cihk m150311a(String str) {
        if ("TLSv1.2".equals(str)) {
            return TLS_1_2;
        }
        if ("TLSv1.1".equals(str)) {
            return TLS_1_1;
        }
        if ("TLSv1".equals(str)) {
            return TLS_1_0;
        }
        if ("SSLv3".equals(str)) {
            return SSL_3_0;
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unexpected TLS version: ") : "Unexpected TLS version: ".concat(valueOf));
    }
}
