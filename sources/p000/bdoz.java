package p000;

/* renamed from: bdoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdoz implements cayy {

    /* renamed from: a */
    private final cijl f106179a;

    /* renamed from: b */
    private final cijl f106180b;

    /* renamed from: c */
    private final cijl f106181c;

    /* renamed from: d */
    private final cijl f106182d;

    public bdoz(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f106179a = cijl;
        this.f106180b = cijl2;
        this.f106181c = cijl3;
        this.f106182d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        bmxv b = ((bdoy) this.f106179a).mo6445a();
        bmxv b2 = ((bdpl) this.f106180b).mo6445a();
        cijl cijl = this.f106181c;
        cijl cijl2 = this.f106182d;
        if (b.mo66813a()) {
            obj = bnic.m109489a((bdkj) (!b2.mo66813a() ? cijl.mo6445a() : cijl2.mo6445a()));
        } else {
            obj = bnon.f131923a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
