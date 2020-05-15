package p000;

import android.os.Build;

/* renamed from: bdkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdkt implements cayy {

    /* renamed from: a */
    private final cijl f105852a;

    /* renamed from: b */
    private final cijl f105853b;

    public bdkt(cijl cijl, cijl cijl2) {
        this.f105852a = cijl;
        this.f105853b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        bmxv b = ((bdku) this.f105852a).mo6445a();
        cijl cijl = this.f105853b;
        int i = Build.VERSION.SDK_INT;
        if (!b.mo66813a() || !((bdkm) b.mo66814b()).mo58107a() || ((bdkm) b.mo66814b()).mo58108b() <= 0 || ((bdkm) b.mo66814b()).mo58108b() > 3145728 || ((bdkm) b.mo66814b()).mo58109c() <= 0 || ((bdkm) b.mo66814b()).mo58111e() <= 0 || ((bdkm) b.mo66814b()).mo58113f() <= 0.0d) {
            obj = bnon.f131923a;
        } else {
            obj = bnic.m109489a((bdkj) cijl.mo6445a());
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
