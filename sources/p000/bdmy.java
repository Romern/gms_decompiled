package p000;

/* renamed from: bdmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdmy implements cayy {

    /* renamed from: a */
    private final cijl f106017a;

    /* renamed from: b */
    private final cijl f106018b;

    /* renamed from: c */
    private final cijl f106019c;

    public bdmy(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f106017a = cijl;
        this.f106018b = cijl2;
        this.f106019c = cijl3;
    }

    /* renamed from: b */
    public final bmxv mo6445a() {
        bmxv bmxv;
        cijl cijl = this.f106017a;
        bdmd b = ((bdft) this.f106019c).mo6445a();
        if (!((bdif) this.f106018b.mo6445a()).f105691b && b.mo58161a()) {
            bmxv = bmxv.m108566b((bdml) cijl.mo6445a());
        } else {
            bmxv = bmvz.f131120a;
        }
        cazf.m127593a(bmxv, "Cannot return null from a non-@Nullable @Provides method");
        return bmxv;
    }
}
