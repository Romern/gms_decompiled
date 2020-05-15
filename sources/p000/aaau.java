package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aaau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaau {

    /* renamed from: a */
    public static final bmzi f27857a = bmzn.m108681a(aaas.f27855a);

    /* renamed from: b */
    private static final ScheduledExecutorService f27858b = snp.m35703a(1, 10);

    /* renamed from: c */
    private static final bmzi f27859c = bmzn.m108681a(aaat.f27856a);

    /* renamed from: a */
    public static qws m21032a() {
        return (qws) sfc.m35144a(rpr.m34216b(), true, true).mo25461a(rpr.m34216b()).get(0);
    }

    /* renamed from: b */
    public static aaar m21034b() {
        return new aaar(f27858b, (int) cdoh.f181424a.mo6606a().mo78065c(), cdoh.f181424a.mo6606a().mo78066d(), TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public static void m21033a(int i, String str, int i2) {
        if (i != 40 && i != 51 && cdoh.f181424a.mo6606a().mo78063a()) {
            ((aaar) f27859c.mo6606a()).mo16667a(i, str, i2);
        }
    }
}
