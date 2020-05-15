package p000;

/* renamed from: bdnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdnp implements cayy {

    /* renamed from: a */
    private final cijl f106085a;

    /* renamed from: b */
    private final cijl f106086b;

    /* renamed from: c */
    private final cijl f106087c;

    public bdnp(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f106085a = cijl;
        this.f106086b = cijl2;
        this.f106087c = cijl3;
    }

    /* renamed from: b */
    public final bmxv mo6445a() {
        bmxv bmxv;
        cijl cijl = this.f106085a;
        bmxv b = ((bdfw) this.f106087c).mo6445a();
        if (!((bdif) this.f106086b.mo6445a()).f105691b && b.mo66813a() && ((bdnc) b.mo66814b()).mo58192a()) {
            bmxv = bmxv.m108566b((bdnh) cijl.mo6445a());
        } else {
            bmxv = bmvz.f131120a;
        }
        cazf.m127593a(bmxv, "Cannot return null from a non-@Nullable @Provides method");
        return bmxv;
    }
}
