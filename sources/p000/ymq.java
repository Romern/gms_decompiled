package p000;

import java.util.List;

/* renamed from: ymq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ymq extends yll {

    /* renamed from: c */
    private final yfr f54106c;

    public ymq(ymp ymp) {
        super(ymp);
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b("com.google.calories.expended");
        a.mo30420a(yfl.f53726a);
        a.mo30419a(this.f53897b.mo30613a(mo30609d()));
        this.f54106c = a.mo30415a();
    }

    /* renamed from: a */
    public abstract void mo30608a(List list, yhg yhg, yhx yhx);

    /* renamed from: b */
    public final ygx mo30565b(List list, yhg yhg, yhy yhy) {
        yhx a = yhy.m44167a(this.f54106c);
        mo30608a(list, yhg, a);
        return a.mo30520b();
    }

    /* renamed from: c */
    public final yfr mo30566c() {
        return this.f54106c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo30609d();
}
