package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: yhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yhu implements yhg {

    /* renamed from: a */
    public final cadn f53837a;

    /* renamed from: b */
    public final yfr f53838b;

    /* renamed from: c */
    private final yfr f53839c;

    public yhu(cadn cadn, yfr yfr, yfr yfr2) {
        bmxy.m108581a(cadn);
        this.f53837a = cadn;
        this.f53838b = yfr;
        this.f53839c = yfr2;
    }

    /* renamed from: a */
    public final long mo30385a() {
        return this.f53837a.f172703c;
    }

    /* renamed from: a */
    public final long mo30386a(TimeUnit timeUnit) {
        return yhf.m44093a(this, timeUnit);
    }

    /* renamed from: b */
    public final float mo30510b(int i) {
        return (float) ((caaw) this.f53837a.f172704d.get(i)).f172383c;
    }

    /* renamed from: b */
    public final long mo30387b() {
        return this.f53837a.f172702b;
    }

    /* renamed from: b */
    public final long mo30388b(TimeUnit timeUnit) {
        return yhf.m44095b(this, timeUnit);
    }

    /* renamed from: c */
    public final long mo30389c() {
        return yhf.m44092a(this);
    }

    /* renamed from: d */
    public final yfr mo30511d() {
        yfr yfr = this.f53839c;
        return yfr == null ? this.f53838b : yfr;
    }

    /* renamed from: e */
    public final String mo30512e() {
        caah a = yyk.m45008a(this.f53837a);
        bmxy.m108581a(a);
        return a.f172336b;
    }

    /* renamed from: f */
    public final long mo30513f() {
        return this.f53837a.f172707g;
    }

    /* renamed from: g */
    public final long mo30514g() {
        return this.f53837a.f172708h;
    }

    /* renamed from: h */
    public final int mo30515h() {
        return this.f53837a.f172704d.size();
    }

    /* renamed from: i */
    public final List mo30516i() {
        ArrayList arrayList = new ArrayList();
        bxwc bxwc = this.f53837a.f172704d;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new yfu((caaw) bxwc.get(i)));
        }
        return arrayList;
    }

    /* renamed from: j */
    public final int mo30517j() {
        return ((caaw) this.f53837a.f172704d.get(0)).f172382b;
    }

    public final String toString() {
        return String.format("%s{%s}", getClass().getSimpleName(), yyk.m45023b(this.f53837a));
    }

    /* renamed from: a */
    public final yfu mo30509a(int i) {
        return new yfu((caaw) this.f53837a.f172704d.get(i));
    }
}
