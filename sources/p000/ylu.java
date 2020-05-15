package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: ylu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ylu {

    /* renamed from: a */
    public static final bngx f54053a = bngx.m109357a((Object) 7, (Object) 8);

    /* renamed from: b */
    private final ypv f54054b;

    public ylu(ypv ypv) {
        this.f54054b = ypv;
    }

    /* renamed from: a */
    public static boolean m44340a(yhu yhu, long j, long j2) {
        return !yfp.m43966a(yhu, j, j2);
    }

    /* renamed from: a */
    public final boolean mo30602a(yhu yhu, yhu yhu2) {
        int j = yhu.mo30517j();
        return this.f54054b.mo30654a(yhu2.mo30517j(), (float) j, TimeUnit.NANOSECONDS.toSeconds(yhf.m44092a(yhu)), TimeUnit.SECONDS);
    }
}
