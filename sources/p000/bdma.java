package p000;

/* renamed from: bdma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdma implements cayy {

    /* renamed from: a */
    private final cijl f105934a;

    /* renamed from: b */
    private final cijl f105935b;

    /* renamed from: c */
    private final cijl f105936c;

    public bdma(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f105934a = cijl;
        this.f105935b = cijl2;
        this.f105936c = cijl3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        cijl cijl = this.f105934a;
        cijl cijl2 = this.f105935b;
        bmxv b = ((bdfs) this.f105936c).mo6445a();
        if (b.mo66813a()) {
            obj = bnic.m109489a((bdkj) (!bdlx.m91056a((bdls) b.mo66814b()) ? cijl2.mo6445a() : cijl.mo6445a()));
        } else {
            obj = bnon.f131923a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
