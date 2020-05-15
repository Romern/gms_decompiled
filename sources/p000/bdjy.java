package p000;

import android.os.Build;

/* renamed from: bdjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdjy implements cayy {

    /* renamed from: a */
    private final cijl f105769a;

    /* renamed from: b */
    private final cijl f105770b;

    /* renamed from: c */
    private final cijl f105771c;

    public bdjy(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f105769a = cijl;
        this.f105770b = cijl2;
        this.f105771c = cijl3;
    }

    /* renamed from: b */
    public final bmxv mo6445a() {
        bmxv bmxv;
        cijl cijl = this.f105769a;
        bmxv b = ((bdfo) this.f105771c).mo6445a();
        if (!((bdif) this.f105770b.mo6445a()).f105691b) {
            int i = Build.VERSION.SDK_INT;
            if (b.mo66813a() && ((bdjj) b.mo66814b()).mo58078a()) {
                bmxv = bmxv.m108566b((bdjk) cijl.mo6445a());
                cazf.m127593a(bmxv, "Cannot return null from a non-@Nullable @Provides method");
                return bmxv;
            }
        }
        bmxv = bmvz.f131120a;
        cazf.m127593a(bmxv, "Cannot return null from a non-@Nullable @Provides method");
        return bmxv;
    }
}
