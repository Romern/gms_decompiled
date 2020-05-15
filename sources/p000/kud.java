package p000;

/* renamed from: kud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kud implements cayy {

    /* renamed from: a */
    private final cijl f25075a;

    /* renamed from: b */
    private final cijl f25076b;

    /* renamed from: c */
    private final cijl f25077c;

    /* renamed from: d */
    private final cijl f25078d;

    public kud(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f25075a = cijl;
        this.f25076b = cijl2;
        this.f25077c = cijl3;
        this.f25078d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        bmxv bmxv = (bmxv) this.f25075a.mo6445a();
        bmxv bmxv2 = (bmxv) this.f25076b.mo6445a();
        kpk kpk = (kpk) this.f25078d.mo6445a();
        bmxv c = bmxv.m108567c(((kdi) ((cayz) this.f25077c).f176439a).f23888d);
        if (bmxv.mo66813a() && bmxv2.mo66813a()) {
            obj = bmxv.m108566b(new kfx((kfe) bmxv.mo66814b(), (kbj) bmxv2.mo66814b(), kpk, c));
        } else {
            obj = bmvz.f131120a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
