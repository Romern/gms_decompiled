package p000;

/* renamed from: bdnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdnr implements cayy {

    /* renamed from: a */
    private final cijl f106088a;

    /* renamed from: b */
    private final cijl f106089b;

    public bdnr(cijl cijl, cijl cijl2) {
        this.f106088a = cijl;
        this.f106089b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        cijl cijl = this.f106088a;
        bmxv b = ((bdgc) this.f106089b).mo6445a();
        if (bdny.f106105a.f106107c <= 0 || !b.mo66813a() || !((bdpb) b.mo66814b()).mo58248a() || ((bdpb) b.mo66814b()).mo58250c() <= 0) {
            obj = bnon.f131923a;
        } else {
            obj = bnic.m109489a(((bdoa) cijl).mo6445a());
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
