package p000;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* renamed from: btwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwy implements Serializable {

    /* renamed from: a */
    public final boolean f152773a;

    /* renamed from: b */
    public final long f152774b;

    /* renamed from: c */
    public final long f152775c;

    /* renamed from: d */
    public final long f152776d;

    /* renamed from: e */
    public final long f152777e;

    /* renamed from: f */
    public final boolean f152778f;

    /* renamed from: g */
    public final long f152779g;

    /* renamed from: h */
    public final boolean f152780h;

    /* renamed from: i */
    public final int f152781i;

    /* renamed from: j */
    public final int f152782j;

    public btwy(btwx btwx) {
        this.f152773a = btwx.f152763a;
        this.f152774b = btwx.f152764b;
        this.f152775c = btwx.f152765c;
        this.f152776d = btwx.f152766d;
        this.f152777e = btwx.f152767e;
        this.f152778f = btwx.f152768f;
        this.f152779g = btwx.f152769g;
        this.f152780h = btwx.f152770h;
        this.f152781i = btwx.f152771i;
        this.f152782j = btwx.f152772j;
    }

    /* renamed from: a */
    public static btwx m118968a() {
        return new btwx();
    }

    /* renamed from: b */
    public static btwy m118969b() {
        btwx a = m118968a();
        a.f152763a = true;
        a.f152764b = TimeUnit.MINUTES.toMillis(15);
        a.f152765c = TimeUnit.MINUTES.toMillis(5);
        a.f152766d = TimeUnit.MINUTES.toMillis(5);
        a.f152767e = TimeUnit.MINUTES.toMillis(1);
        return a.mo72453a();
    }
}
