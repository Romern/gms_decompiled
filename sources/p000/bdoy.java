package p000;

/* renamed from: bdoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdoy implements cayy {

    /* renamed from: a */
    private final cijl f106174a;

    /* renamed from: b */
    private final cijl f106175b;

    /* renamed from: c */
    private final cijl f106176c;

    /* renamed from: d */
    private final cijl f106177d;

    /* renamed from: e */
    private final cijl f106178e;

    public bdoy(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5) {
        this.f106174a = cijl;
        this.f106175b = cijl2;
        this.f106176c = cijl3;
        this.f106177d = cijl4;
        this.f106178e = cijl5;
    }

    /* renamed from: b */
    public final bmxv mo6445a() {
        bmxv bmxv;
        bmxv b = ((bdgc) this.f106174a).mo6445a();
        bmxv b2 = ((bdpl) this.f106175b).mo6445a();
        cijl cijl = this.f106176c;
        cijl cijl2 = this.f106177d;
        if (!((bdif) this.f106178e.mo6445a()).f105691b && b.mo66813a() && ((bdpb) b.mo66814b()).mo58248a() && ((bdpb) b.mo66814b()).mo58250c() > 0) {
            bmxv = bmxv.m108566b((bdpc) (!b2.mo66813a() ? cijl2.mo6445a() : cijl.mo6445a()));
        } else {
            bmxv = bmvz.f131120a;
        }
        cazf.m127593a(bmxv, "Cannot return null from a non-@Nullable @Provides method");
        return bmxv;
    }
}
