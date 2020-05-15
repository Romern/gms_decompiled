package p000;

import android.content.Context;

/* renamed from: kuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kuu implements cayy {

    /* renamed from: a */
    private final cijl f25139a;

    /* renamed from: b */
    private final cijl f25140b;

    /* renamed from: c */
    private final cijl f25141c;

    /* renamed from: d */
    private final cijl f25142d;

    public kuu(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f25139a = cijl;
        this.f25140b = cijl2;
        this.f25141c = cijl3;
        this.f25142d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Context b = ((kuv) this.f25139a).mo6445a();
        bmxv bmxv = (bmxv) this.f25140b.mo6445a();
        bmxv bmxv2 = (bmxv) this.f25141c.mo6445a();
        bmxv bmxv3 = (bmxv) this.f25142d.mo6445a();
        if (!bmxv.mo66813a() || !bmxv2.mo66813a() || !bmxv3.mo66813a()) {
            throw new IllegalStateException("ChromesyncApiInitializer missing dependency");
        }
        kfh kfh = new kfh(b, (kfe) bmxv.mo66814b(), (kfe) bmxv2.mo66814b(), (kfe) bmxv3.mo66814b());
        cazf.m127593a(kfh, "Cannot return null from a non-@Nullable @Provides method");
        return kfh;
    }
}
