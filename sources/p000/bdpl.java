package p000;

/* renamed from: bdpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdpl implements cayy {

    /* renamed from: a */
    private final cijl f106218a;

    /* renamed from: b */
    private final cijl f106219b;

    /* renamed from: c */
    private final cijl f106220c;

    /* renamed from: d */
    private final cijl f106221d;

    public bdpl(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f106218a = cijl;
        this.f106219b = cijl2;
        this.f106220c = cijl3;
        this.f106221d = cijl4;
    }

    /* renamed from: b */
    public final bmxv mo6445a() {
        bmxv bmxv;
        cijl cijl = this.f106218a;
        bmxv b = ((bdgd) this.f106220c).mo6445a();
        bmxv b2 = ((bdgb) this.f106221d).mo6445a();
        if (!((bdif) this.f106219b.mo6445a()).f105691b && ((b.mo66813a() && ((bdpr) b.mo66814b()).mo58281a()) || (b2.mo66813a() && ((bdpp) b2.mo66814b()).mo58264a()))) {
            bmxv = bmxv.m108566b((bdps) cijl.mo6445a());
        } else {
            bmxv = bmvz.f131120a;
        }
        cazf.m127593a(bmxv, "Cannot return null from a non-@Nullable @Provides method");
        return bmxv;
    }
}
