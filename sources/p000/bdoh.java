package p000;

import android.os.Build;

/* renamed from: bdoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdoh implements cayy {

    /* renamed from: a */
    private final cijl f106133a;

    /* renamed from: b */
    private final cijl f106134b;

    /* renamed from: c */
    private final cijl f106135c;

    public bdoh(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f106133a = cijl;
        this.f106134b = cijl2;
        this.f106135c = cijl3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        cijl cijl = this.f106133a;
        bmxv b = ((bdfx) this.f106135c).mo6445a();
        if (!((bdif) this.f106134b.mo6445a()).f105691b) {
            int i = Build.VERSION.SDK_INT;
            if (b.mo66813a() && ((bdoj) b.mo66814b()).mo58226a()) {
                obj = bmxv.m108566b(((bdon) cijl).mo6445a());
                cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
                return obj;
            }
        }
        obj = bmvz.f131120a;
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
