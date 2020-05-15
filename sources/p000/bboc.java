package p000;

import android.net.Uri;

/* renamed from: bboc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bboc {
    /* renamed from: a */
    public static bbob m88268a(bxvq bxvq) {
        bbob bbob = new bbob();
        bbob.f103002b = bxvq;
        bbob.f103003c = new aytg();
        bbob.f103004d = bnsp.m110328a("mdi.sync.stats");
        return bbob;
    }

    /* renamed from: b */
    private static Uri m88270b(Uri uri) {
        return uri.buildUpon().appendPath("sync_metadata.pb").build();
    }

    /* renamed from: c */
    private final bbod m88271c(Uri uri) {
        beju c = mo56258c();
        bejq g = bejr.m95186g();
        g.mo60764a(bbnu.f102981f);
        g.mo60762a(uri);
        g.mo60763a(bejb.f111635a);
        return new bbod(c.mo60765a(g.mo60761a()));
    }

    /* renamed from: a */
    public abstract Class mo56256a();

    /* renamed from: b */
    public abstract bxvq mo56257b();

    /* renamed from: c */
    public abstract beju mo56258c();

    /* renamed from: d */
    public abstract ayte mo56259d();

    /* renamed from: e */
    public abstract bnsn mo56260e();

    @Deprecated
    /* renamed from: a */
    public static bbob m88269a(Class cls) {
        bbob bbob = new bbob();
        bbob.f103001a = cls;
        bbob.f103003c = new aytg();
        bbob.f103004d = bnsp.m110328a("mdi.sync.stats");
        return bbob;
    }

    /* renamed from: a */
    public final bbnn mo56270a(Uri uri) {
        if (mo56256a() != null) {
            Class a = mo56256a();
            bmxy.m108581a(a);
            return new bbnn(a, m88271c(m88270b(uri)), mo56259d());
        } else if (mo56257b() != null) {
            bxvq b = mo56257b();
            bmxy.m108581a(b);
            return new bbnn(new bbne(b), m88271c(m88270b(uri)), mo56259d());
        } else {
            throw new AssertionError("eventType OR enumMap should be non-null");
        }
    }
}
