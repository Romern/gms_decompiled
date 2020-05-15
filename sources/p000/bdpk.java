package p000;

/* renamed from: bdpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdpk implements cayy {

    /* renamed from: a */
    private final cijl f106215a;

    /* renamed from: b */
    private final cijl f106216b;

    /* renamed from: c */
    private final cijl f106217c;

    public bdpk(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f106215a = cijl;
        this.f106216b = cijl2;
        this.f106217c = cijl3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        bmxv b = ((bdpl) this.f106215a).mo6445a();
        cijl cijl = this.f106216b;
        ((bdgd) this.f106217c).mo6445a();
        if (b.mo66813a()) {
            obj = bnic.m109489a((bdkj) cijl.mo6445a());
        } else {
            obj = bnon.f131923a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
