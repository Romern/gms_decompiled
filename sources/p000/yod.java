package p000;

import java.util.List;

/* renamed from: yod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yod extends yll {

    /* renamed from: c */
    private final yfr f54267c;

    /* renamed from: d */
    private final ynv f54268d;

    public yod(yoc yoc) {
        super(yoc);
        ynv ynv = yoc.f54265a;
        bmxy.m108581a(ynv);
        this.f54268d = ynv;
        String a = this.f53897b.mo30613a(bmxr.m108543a(':').mo66875a("derived", "com.google.location.sample", yfl.f53726a.mo30409a(), "merge_high_fidelity"));
        yfq a2 = yfr.m43986a();
        a2.mo30416a(1);
        a2.mo30421b("com.google.distance.delta");
        a2.mo30420a(yfl.f53726a);
        a2.mo30419a(bzzr.m126369a(this.f53897b.mo30613a("from_high_accuracy_location"), a));
        this.f54267c = a2.mo30415a();
    }

    /* renamed from: b */
    public final String mo30564b() {
        return "HighFidelityDistanceFromLocationTransformation";
    }

    /* renamed from: c */
    public final yfr mo30566c() {
        return this.f54267c;
    }

    /* renamed from: b */
    public final ygx mo30565b(List list, yhg yhg, yhy yhy) {
        yhx a = yhy.m44167a(this.f54267c);
        this.f54268d.mo30638a(((ygx) bnjd.m109587b(list)).mo30473a(), a, yhg);
        return a.mo30520b();
    }
}
