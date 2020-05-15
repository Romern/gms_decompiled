package p000;

import android.os.HandlerThread;
import java.security.SecureRandom;

/* renamed from: bgsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgsg {

    /* renamed from: b */
    public static bgsg f117406b;

    /* renamed from: a */
    public bgth f117407a;

    /* renamed from: c */
    private final rpr f117408c;

    /* renamed from: d */
    private final SecureRandom f117409d;

    /* renamed from: e */
    private HandlerThread f117410e;

    static {
        srn.m36125a("EAlert");
    }

    public bgsg(rpr rpr) {
        SecureRandom secureRandom = new SecureRandom();
        this.f117408c = rpr;
        this.f117409d = secureRandom;
    }

    /* renamed from: a */
    public static void m99845a() {
        bgso.m99865a(rpr.m34216b());
        if (bgsf.m99843d()) {
            synchronized (bgsg.class) {
                if (f117406b == null) {
                    bgsg bgsg = new bgsg(rpr.m34216b());
                    f117406b = bgsg;
                    HandlerThread handlerThread = new HandlerThread("EA", 9);
                    bgsg.f117410e = handlerThread;
                    handlerThread.start();
                    bgsg.f117407a = new bgth("EA", bgsg.f117410e);
                    bgsg.f117407a.mo63155b(new bgtc("EAWatchSettings", new bgsf(bgsg.f117408c, bgsg.f117407a.mo63151a(1))));
                    bgsp bgsl = !cevi.f183455a.mo6606a().useNewLocationApi() ? new bgsl(bgsg.f117407a.mo63151a(2), bgsg.f117408c) : new bgsj(bgsg.f117407a.mo63151a(2), bgsg.f117408c);
                    bgsg.f117407a.mo63155b(new bgtc("EALocation", bgsl));
                    if (cevi.m138290e()) {
                        bgsg.f117407a.mo63155b(new bgsm(bgsg.f117408c, bgsg.f117409d, bgsl));
                    }
                    if (cevi.m138292g()) {
                        bgsg.f117407a.mo63155b(new bgso(bgsg.f117408c, bgsg.f117409d, bgsl));
                    }
                    bgsg.f117407a.mo63152a();
                }
            }
        }
    }
}
