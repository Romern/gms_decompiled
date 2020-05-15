package p000;

/* renamed from: brvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brvq implements brxe {

    /* renamed from: a */
    static final chtn f143471a = chtn.m149535a("X-Goog-Api-Key", chtr.f189134b);

    /* renamed from: a */
    public final bryh mo70011a(brxa brxa) {
        String str;
        boolean z;
        chqo chqo = brxa.f143554b;
        brua brua = (brua) chqo.mo85548a(brua.f143377a);
        boolean z2 = false;
        if (brua != null) {
            if (chqo.mo85548a(bruw.f143433a) == null) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108601b(z, "Must set exactly one of ApiKeyOption or AuthContext if AuthContextManager is provided.");
        }
        brum brum = (brum) chqo.mo85548a(brum.f143417a);
        String b = brum.mo69983b().mo69989b();
        if (brua != null) {
            str = brua.mo69941a();
        } else {
            str = null;
        }
        if (brua != null && brua.mo69941a() == null) {
            if (b != null) {
                z2 = true;
            }
            bmxy.m108601b(z2, "ApiKeyOption defaultApiKey was used, but no default exists");
        }
        if (str != null) {
            b = str;
        }
        if (brum.mo69985d() && b != null) {
            bmxy.m108601b(!brxa.f143553a.mo85650a(f143471a), "API key was already attached to the request");
            brxa.f143553a.mo85648a(f143471a, b);
        }
        return bryh.f143647a;
    }

    /* renamed from: c */
    public final bryi mo70018c() {
        return bryi.f143654a;
    }

    /* renamed from: b */
    public final bryh mo70016b() {
        return bryh.f143647a;
    }

    /* renamed from: b */
    public final bryh mo70017b(brxa brxa) {
        return bryh.f143647a;
    }

    /* renamed from: a */
    public final bryh mo70012a(brxb brxb) {
        return bryh.f143647a;
    }

    /* renamed from: a */
    public final bryi mo70013a(brwz brwz) {
        return bryi.f143654a;
    }

    /* renamed from: a */
    public final bryi mo70014a(brxc brxc) {
        return bryi.f143654a;
    }
}
