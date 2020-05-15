package p000;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bqvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqvo {

    /* renamed from: a */
    public static final bqvo f141689a = new bqvo(new bqvp());

    /* renamed from: b */
    public static final bqvo f141690b = new bqvo(new bqvt());

    /* renamed from: c */
    public static final bqvo f141691c = new bqvo(new bqvv());

    /* renamed from: d */
    public static final bqvo f141692d = new bqvo(new bqvu());

    /* renamed from: e */
    public static final bqvo f141693e = new bqvo(new bqvq());

    /* renamed from: f */
    public static final bqvo f141694f = new bqvo(new bqvs());

    /* renamed from: g */
    public static final bqvo f141695g = new bqvo(new bqvr());

    /* renamed from: h */
    private static final Logger f141696h = Logger.getLogger(bqvo.class.getName());

    /* renamed from: i */
    private static final List f141697i;

    /* renamed from: j */
    private final bqvw f141698j;

    /* renamed from: k */
    private final List f141699k = f141697i;

    static {
        if (!bqwk.m113521a()) {
            f141697i = new ArrayList();
        } else {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f141696h.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            f141697i = arrayList;
        }
    }

    public bqvo(bqvw bqvw) {
        this.f141698j = bqvw;
    }

    /* renamed from: a */
    public final Object mo69341a(String str) {
        List list = this.f141699k;
        int size = list.size();
        int i = 0;
        Exception exc = null;
        while (i < size) {
            try {
                return this.f141698j.mo69342a(str, (Provider) list.get(i));
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
                i++;
            }
        }
        return this.f141698j.mo69342a(str, null);
    }
}
