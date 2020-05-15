package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: aefi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aefi {

    /* renamed from: a */
    public static final /* synthetic */ int f63319a = 0;

    /* renamed from: b */
    private static final Object f63320b = new Object();

    /* renamed from: c */
    private static volatile bruh f63321c;

    /* renamed from: d */
    private static final bmzi f63322d = bmzn.m108681a(aeff.f63315a);

    /* renamed from: a */
    public static brud m51786a(aefl aefl) {
        bmxy.m108581a(aefl);
        aefb aefb = new aefb();
        rpr b = rpr.m34216b();
        cazf.m127594a(b);
        aefb.f63304a = b;
        soc soc = new soc(Integer.MAX_VALUE, 10);
        cazf.m127594a(soc);
        aefb.f63305b = soc;
        cazf.m127595a(aefb.f63304a, Context.class);
        cazf.m127595a(aefb.f63305b, Executor.class);
        return (brud) new aefc(aefb.f63304a, aefb.f63305b).f63306a.mo6445a();
    }

    /* renamed from: a */
    public static bruh m51787a(int i) {
        bnsl bnsl = (bnsl) ((srn) f63322d.mo6606a()).mo68390d();
        bnsl.mo68432a("aefi", "a", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("Returning a channel provider with trafficStatsTag=%d", i);
        if (f63321c == null) {
            synchronized (f63320b) {
                if (f63321c == null) {
                    f63321c = m51789a(m51786a(aefl.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS).mo69973a());
                }
            }
        }
        return m51790a(f63321c, i);
    }

    /* renamed from: a */
    public static bruh m51788a(int i, aefl aefl) {
        bmxy.m108581a(aefl);
        brud a = m51786a(aefl);
        a.f143400b = null;
        bruh a2 = m51789a(a.mo69973a());
        bnsl bnsl = (bnsl) ((srn) f63322d.mo6606a()).mo68390d();
        bnsl.mo68432a("aefi", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("Creating an unauthenticated channel provider with trafficStatsTag=%d", i);
        return m51790a(a2, i);
    }

    /* renamed from: a */
    private static bruh m51789a(brue brue) {
        aefd aefd = new aefd();
        cazf.m127594a(brue);
        aefd.f63312a = brue;
        cazf.m127595a(aefd.f63312a, brue.class);
        return (bruh) new aefe(aefd.f63312a).f63313a.mo6445a();
    }

    /* renamed from: a */
    private static bruh m51790a(bruh bruh, int i) {
        return new brug(brun.I_AM_THE_RPC_LIB, new bruf(brun.I_AM_THE_RPC_LIB, bruh, rpr.m34216b().getApplicationInfo().uid), shr.m35311a(i));
    }
}
