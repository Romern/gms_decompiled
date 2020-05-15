package p000;

import android.content.Context;

/* renamed from: kvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kvl implements cayy {

    /* renamed from: a */
    private final cijl f25184a;

    /* renamed from: b */
    private final cijl f25185b;

    /* renamed from: c */
    private final cijl f25186c;

    public kvl(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f25184a = cijl;
        this.f25185b = cijl2;
        this.f25186c = cijl3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        Context context = (Context) ((cayz) this.f25184a).f176439a;
        kbe kbe = (kbe) this.f25185b.mo6445a();
        bmxv bmxv = (bmxv) this.f25186c.mo6445a();
        if (!ccip.m129870j()) {
            obj = bmvz.f131120a;
        } else {
            obj = bmxv.mo66813a() ? bmxv.m108566b(new lbu(context, kbe, (awkh) bmxv.mo66814b())) : bmvz.f131120a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
