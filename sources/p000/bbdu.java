package p000;

import android.content.Context;

/* renamed from: bbdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbdu implements cayy {

    /* renamed from: a */
    private final bbdp f102427a;

    /* renamed from: b */
    private final cijl f102428b;

    public bbdu(bbdp bbdp, cijl cijl) {
        this.f102427a = bbdp;
        this.f102428b = cijl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        bbdp bbdp = this.f102427a;
        Context b = ((bbdg) this.f102428b).mo6445a();
        if (bbdp.f102421d.mo66813a()) {
            obj = new afoq(b, (bbfi) bbdp.f102421d.mo66814b(), 20190814);
        } else {
            obj = new bbdo();
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
