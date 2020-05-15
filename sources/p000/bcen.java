package p000;

import java.io.Serializable;

/* renamed from: bcen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcen implements Serializable {

    /* renamed from: d */
    public static final bcen f104043d;

    /* renamed from: e */
    public static final bcen f104044e;

    static {
        bcem f = m88880f();
        f.mo56739a(0L);
        f.mo56737a(1.0d);
        f.mo56741b(0L);
        f.mo56740b(0);
        f.mo56738a(1);
        f.mo56736a();
        bcem f2 = m88880f();
        f2.mo56739a(1000L);
        f2.mo56737a(1.0d);
        f2.mo56741b(2000L);
        f2.mo56740b(1);
        f2.mo56738a(1000);
        f104043d = f2.mo56736a();
        bcem f3 = m88880f();
        f3.mo56739a(1000L);
        f3.mo56737a(2.0d);
        f3.mo56741b(30000L);
        f3.mo56740b(3);
        f3.mo56738a(1000);
        f104044e = f3.mo56736a();
    }

    /* renamed from: f */
    public static bcem m88880f() {
        return new bcem();
    }

    /* renamed from: a */
    public abstract int mo56724a();

    /* renamed from: b */
    public abstract long mo56725b();

    /* renamed from: c */
    public abstract long mo56726c();

    /* renamed from: d */
    public abstract double mo56727d();

    /* renamed from: e */
    public abstract int mo56728e();
}
