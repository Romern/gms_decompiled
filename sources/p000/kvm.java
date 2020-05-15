package p000;

import android.content.Context;

/* renamed from: kvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kvm implements cayy {

    /* renamed from: a */
    private final cijl f25187a;

    /* renamed from: b */
    private final cijl f25188b;

    /* renamed from: c */
    private final cijl f25189c;

    public kvm(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f25187a = cijl;
        this.f25188b = cijl2;
        this.f25189c = cijl3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        Context context = (Context) ((cayz) this.f25187a).f176439a;
        kbe kbe = (kbe) this.f25188b.mo6445a();
        bmxv bmxv = (bmxv) this.f25189c.mo6445a();
        if (!ccip.m129871k()) {
            obj = bmvz.f131120a;
        } else if (!ccip.m129870j()) {
            obj = bmvz.f131120a;
        } else {
            obj = bmxv.mo66813a() ? bmxv.m108566b(new lce(context, kbe, (awkh) bmxv.mo66814b())) : bmvz.f131120a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
