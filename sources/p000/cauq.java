package p000;

/* renamed from: cauq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cauq {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: e */
    final String f176073e;

    private cauq(String str) {
        this.f176073e = str;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static cauq m127256a(String str) {
        char c;
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return TLS_1_2;
        }
        if (c == 1) {
            return TLS_1_1;
        }
        if (c == 2) {
            return TLS_1_0;
        }
        if (c == 3) {
            return SSL_3_0;
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unexpected TLS version: ") : "Unexpected TLS version: ".concat(valueOf));
    }
}
