package p000;

import com.google.android.gms.autofill.metrics.MetricsContext;

/* renamed from: kvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kvi implements cayy {

    /* renamed from: a */
    private final cijl f25175a;

    /* renamed from: b */
    private final cijl f25176b;

    /* renamed from: c */
    private final cijl f25177c;

    /* renamed from: d */
    private final cijl f25178d;

    public kvi(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f25175a = cijl;
        this.f25176b = cijl2;
        this.f25177c = cijl3;
        this.f25178d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        kju kju = (kju) this.f25175a.mo6445a();
        kwu kwu = (kwu) this.f25176b.mo6445a();
        bmxv bmxv = (bmxv) ((cayz) this.f25177c).f176439a;
        bmzq bmzq = (bmzq) this.f25178d.mo6445a();
        if (bmxv.mo66813a()) {
            kju = new kya(kju, (MetricsContext) bmxv.mo66814b(), kwu, bmzq);
        }
        cazf.m127593a(kju, "Cannot return null from a non-@Nullable @Provides method");
        return kju;
    }
}
