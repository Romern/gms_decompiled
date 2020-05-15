package p000;

import android.content.Context;
import java.util.Random;

/* renamed from: abif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abif implements abig {

    /* renamed from: a */
    private static final Object f57518a = new Object();

    /* renamed from: b */
    private static volatile abig f57519b;

    /* renamed from: c */
    private cijl f57520c;

    /* renamed from: d */
    private cijl f57521d;

    /* renamed from: e */
    private cijl f57522e;

    /* renamed from: f */
    private cijl f57523f;

    /* renamed from: g */
    private cijl f57524g;

    /* renamed from: h */
    private cijl f57525h;

    /* renamed from: i */
    private cijl f57526i;

    /* renamed from: j */
    private cijl f57527j;

    /* renamed from: k */
    private cijl f57528k;

    /* renamed from: l */
    private cijl f57529l;

    /* renamed from: m */
    private cijl f57530m;

    /* renamed from: n */
    private cijl f57531n;

    /* renamed from: o */
    private cijl f57532o;

    /* renamed from: p */
    private cijl f57533p;

    /* renamed from: q */
    private cijl f57534q;

    /* renamed from: r */
    private cijl f57535r;

    /* renamed from: s */
    private cijl f57536s;

    public abif() {
    }

    /* renamed from: a */
    public static abig m47744a() {
        if (f57519b == null) {
            synchronized (f57518a) {
                if (f57519b == null) {
                    abie abie = new abie();
                    if (abie.f57517a == null) {
                        abie.f57517a = new abih();
                    }
                    f57519b = new abif(null);
                }
            }
        }
        return f57519b;
    }

    /* renamed from: b */
    public final Context mo32119b() {
        return (Context) this.f57520c.mo6445a();
    }

    /* renamed from: d */
    public final abij mo32121d() {
        return (abij) this.f57524g.mo6445a();
    }

    /* renamed from: e */
    public final bqgj mo32122e() {
        return (bqgj) this.f57521d.mo6445a();
    }

    /* renamed from: f */
    public final bqgj mo32123f() {
        return (bqgj) this.f57525h.mo6445a();
    }

    /* renamed from: g */
    public final ablc mo32124g() {
        return (ablc) this.f57527j.mo6445a();
    }

    /* renamed from: h */
    public final abla mo32125h() {
        return (abla) this.f57534q.mo6445a();
    }

    /* renamed from: i */
    public final Random mo32126i() {
        Random random = new Random(System.currentTimeMillis());
        cazf.m127593a(random, "Cannot return null from a non-@Nullable @Provides method");
        return random;
    }

    /* renamed from: j */
    public final ablh mo32127j() {
        return (ablh) this.f57536s.mo6445a();
    }

    /* renamed from: k */
    public final abio mo32128k() {
        return new abio(this.f57524g, this.f57526i);
    }

    /* renamed from: c */
    public final abhu mo32120c() {
        bqgj bqgj = (bqgj) this.f57521d.mo6445a();
        return new abhv((Context) this.f57520c.mo6445a());
    }

    public abif(byte[] bArr) {
        this.f57520c = cayx.m127579a(rzr.f43901a);
        this.f57521d = cayx.m127579a(abhx.f57512a);
        cijl a = cayx.m127579a(new abim(this.f57520c));
        this.f57522e = a;
        abil abil = new abil(a);
        this.f57523f = abil;
        this.f57524g = cayx.m127579a(abil);
        this.f57525h = cayx.m127579a(abhz.f57513a);
        this.f57526i = new abhw(this.f57520c, this.f57521d);
        this.f57527j = cayx.m127579a(abld.f57661a);
        cijl a2 = cayx.m127579a(new abjy(this.f57520c));
        this.f57528k = a2;
        cijl a3 = cayx.m127579a(new abjv(this.f57521d, a2));
        this.f57529l = a3;
        abjx abjx = new abjx(this.f57520c, a3);
        this.f57530m = abjx;
        this.f57531n = new abju(abjx);
        abjw abjw = new abjw(this.f57520c, this.f57529l);
        this.f57532o = abjw;
        this.f57533p = new abjj(abjw);
        cayw cayw = new cayw();
        this.f57534q = cayw;
        ablx ablx = new ablx(this.f57524g, this.f57531n, this.f57533p, this.f57520c, this.f57527j, cayw);
        this.f57535r = ablx;
        cijl a4 = cayx.m127579a(ablx);
        this.f57536s = a4;
        cayw.m127577a(this.f57534q, cayx.m127579a(new ablb(a4, this.f57533p)));
    }
}
