package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: abp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class abp {

    /* renamed from: a */
    private final ArrayList f107a = new ArrayList();

    /* renamed from: h */
    public abn f108h = null;

    /* renamed from: f */
    public static final abo m247f() {
        return new abo();
    }

    /* renamed from: g */
    public static void m248g(acm acm) {
        int i = acm.f210j;
        if (!acm.mo330k() && (i & 4) == 0) {
            int i2 = acm.f204d;
            int e = acm.mo324e();
            if (i2 == -1 || e == -1 || i2 != e) {
            }
        }
    }

    /* renamed from: h */
    public static final abo m249h(acm acm) {
        abo f = m247f();
        f.mo197a(acm);
        return f;
    }

    /* renamed from: a */
    public abstract void mo198a();

    /* renamed from: a */
    public abstract boolean mo199a(acm acm, abo abo, abo abo2);

    /* renamed from: a */
    public abstract boolean mo200a(acm acm, acm acm2, abo abo, abo abo2);

    /* renamed from: a */
    public boolean mo201a(acm acm, List list) {
        throw null;
    }

    /* renamed from: b */
    public abstract boolean mo202b();

    /* renamed from: b */
    public abstract boolean mo203b(acm acm, abo abo, abo abo2);

    /* renamed from: c */
    public abstract boolean mo204c(acm acm, abo abo, abo abo2);

    /* renamed from: d */
    public abstract void mo205d();

    /* renamed from: d */
    public abstract void mo206d(acm acm);

    /* renamed from: e */
    public final void mo207e() {
        int size = this.f107a.size();
        for (int i = 0; i < size; i++) {
            ((abm) this.f107a.get(i)).mo195a();
        }
        this.f107a.clear();
    }

    /* renamed from: f */
    public boolean mo209f(acm acm) {
        throw null;
    }

    /* renamed from: e */
    public final void mo208e(acm acm) {
        abn abn = this.f108h;
        if (abn != null) {
            abn.mo196a(acm);
        }
    }
}
