package p000;

import java.io.IOException;

/* renamed from: caui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum caui {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    

    /* renamed from: e */
    public final String f176031e;

    private caui(String str) {
        this.f176031e = str;
    }

    /* renamed from: a */
    public static caui m127235a(String str) {
        if (str.equals(HTTP_1_0.f176031e)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.f176031e)) {
            return HTTP_1_1;
        }
        if (str.equals(HTTP_2.f176031e)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.f176031e)) {
            return SPDY_3;
        }
        String valueOf = String.valueOf(str);
        throw new IOException(valueOf.length() == 0 ? new String("Unexpected protocol: ") : "Unexpected protocol: ".concat(valueOf));
    }

    public final String toString() {
        return this.f176031e;
    }
}
